package china.fighting.schedule;

import china.fighting.constants.GlobalConstant;
import china.fighting.domain.NcovWeiboNews;
import china.fighting.model.dto.WeiboDTO;
import china.fighting.service.DistrictService;
import china.fighting.service.NcovNewsKeywordsService;
import china.fighting.service.NcovWeiboNewsService;
import china.fighting.utils.ApiUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>Title: TaskSchedule. </p>
 * <p>Description: 调度任务 </p>
 * <p>每小时: 0 0 0/1 * * ?</p>
 * <p>每5分钟: 0 0/5 * * * ?</p>
 *
 * @author dragon
 * @date 2020/1/24 3:59 下午
 */
@Slf4j
@Component
public class TaskSchedule {

    @Resource
    private DistrictService districtService;

    @Resource
    private NcovWeiboNewsService ncovWeiboNewsService;

    @Resource
    private NcovNewsKeywordsService ncovNewsKeywordsService;

    @Autowired
    private ApiUtil apiUtil;

    /**
     * <p>Title: startPeopleNetDataListener. </p>
     * <p>Description: 人民网调度器 </p>
     * <p>0 0/5 * * * ?</p>
     *
     * @author dragon
     * @date 2020/1/24 4:01 下午
     */
    @Scheduled(cron = "0 0/5 * * * ?")
    public void startPeopleNetDataListener() {
        log.info(">>> Start to pull people net data from weibo ...");
        // 调用API接口
        String apiResult = apiUtil.getApiContent(GlobalConstant.PEOPLE_NET_OID);
        List<NcovWeiboNews> peopleNewDataList = this.screenNews(apiResult);

        // 数据落地
        if (CollectionUtils.isNotEmpty(peopleNewDataList)) {
            peopleNewDataList.forEach(item -> {
                ncovWeiboNewsService.save(item);
            });
        }
        log.info("### End to pull people net data from weibo ...\nUpdate news list size = {}", peopleNewDataList.size());
    }

    /**
     * <p>Title: startCctvDataListener. </p>
     * <p>Description: 央视新闻调度器 </p>
     * <p>15 0/5 * * * ?</p>
     *
     * @author dragon
     * @date 2020/1/24 4:01 下午
     */
    @Scheduled(cron = "15 0/5 * * * ?")
    public void startCctvNewsDataListener() {
        log.info(">>> Start to pull cctv news data from weibo ...");
        // 调用API接口
        String apiResult = apiUtil.getApiContent(GlobalConstant.CCTV_NEWS_OID);
        List<NcovWeiboNews> cctvNewsDataList = this.screenNews(apiResult);

        // 数据落地
        if (CollectionUtils.isNotEmpty(cctvNewsDataList)) {
            cctvNewsDataList.forEach(item -> {
                ncovWeiboNewsService.save(item);
            });
        }
        log.info("### End to pull cctv news data from weibo ...\nUpdate news list size = {}", cctvNewsDataList.size());
    }

    /**
     * <p>Title: startTouTiaoNewsDataListener. </p>
     * <p>Description: 头条新闻调度器 </p>
     * <p>30 0/5 * * * ?</p>
     *
     * @author dragon
     * @date 2020/1/24 5:21 下午
     */
    @Scheduled(cron = "30 0/5 * * * ?")
    public void startTouTiaoNewsDataListener() {
        log.info(">>> Start to pull tou tiao news data from weibo ...");
        // 调用API接口
        String apiResult = apiUtil.getApiContent(GlobalConstant.TOU_TIAO_NEWS_OID);
        List<NcovWeiboNews> touTiaoNewsDataList = this.screenNews(apiResult);

        // 数据落地
        if (CollectionUtils.isNotEmpty(touTiaoNewsDataList)) {
            touTiaoNewsDataList.forEach(item -> {
                ncovWeiboNewsService.save(item);
            });
        }
        log.info("### End to pull tou tiao news data from weibo ...\nUpdate news list size = {}", touTiaoNewsDataList.size());
    }

    /**
     * <p>Title: screenNews. </p>
     * <p>Description: 筛选新闻 </p>
     *
     * @param apiResult API接口结果
     * @return 筛选后新闻集合
     * @author dragon
     * @date 2020/1/24 6:20 下午
     */
    private List<NcovWeiboNews> screenNews(String apiResult) {
        // 初始化结果容器
        List<NcovWeiboNews> resultList = Lists.newArrayList();
        try {
            // 解析api结果
            JSONObject apiJsonObject = JSON.parseObject(apiResult);
            String code = (String) apiJsonObject.get("code");
            if (GlobalConstant.API_SUCCESS_CODE.equals(code)) {
                JSONObject resultJsonObject = (JSONObject) apiJsonObject.get("result");
                JSONArray data = (JSONArray) resultJsonObject.get("data");
                if (null == data) {
                    return resultList;
                }
                List<WeiboDTO> list = data.toJavaList(WeiboDTO.class);

                // 获取关键词
                List<String> keywordsList = ncovNewsKeywordsService.getNcovNewsKeywords();
                // 获取省市
                List<String> districtKeyList = districtService.getDistrictKey();

                list.forEach(item -> {
                    String content = item.getContent();
                    String sourceId = item.getId();
                    // 重复性校验
                    if (CollectionUtils.isNotEmpty(resultList)) {
                        Map<String, NcovWeiboNews> map = resultList.stream().collect(Collectors.toMap(NcovWeiboNews::getSourceId, Function.identity()));
                        if (null != map.get(sourceId)) {
                            return;
                        }
                    }
                    if (!ncovWeiboNewsService.checkRepeatability(sourceId)) {
                        return;
                    }

                    NcovWeiboNews news = new NcovWeiboNews();
                    // 关键字校验
                    keywordsList.forEach(keywords -> {
                        if (content.contains(keywords) && null == news.getSourceId()) {
                            news.setSourceId(sourceId);
                            news.setContent(content);
                            news.setSendTime(item.getPDate());
                            news.setUrl(item.getUrl());
                            news.setFromId(item.getFrom().getId());
                            news.setFromName(item.getFrom().getName());
                            // 校验省市关键字
                            districtKeyList.forEach(key -> {
                                if (content.contains(key) && null == news.getCityKey()) {
                                    news.setCityKey(key);
                                    resultList.add(news);
                                }
                            });
                        }
                    });
                });
            } else {
                log.warn("$$$ Get result error ! The api return code = {}", code);
            }
        } catch (Exception e) {
            log.error("&&& Bad api result = {}, exception = \n", apiResult, e);
        }
        return resultList;
    }
}
