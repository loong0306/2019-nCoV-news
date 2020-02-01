package china.fighting.controller;

import china.fighting.annotation.BusinessLog;
import china.fighting.annotation.PrintParam;
import china.fighting.constants.GlobalConstant;
import china.fighting.model.dto.QueryNewsDTO;
import china.fighting.model.vo.NcovWeiboNewsVO;
import china.fighting.model.wrap.WrapMapper;
import china.fighting.model.wrap.Wrapper;
import china.fighting.service.NcovWeiboNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: NewsController. </p>
 * <p>Description: 查询新闻Restful接口 </p>
 *
 * @author dragon
 * @date 2020/1/25 1:31 下午
 */
@Slf4j
@RestController
@RequestMapping(value = "/api/news", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class NewsController {

    @Resource
    private NcovWeiboNewsService ncovWeiboNewsService;

    /**
     * <p>Title: query. </p>
     * <p>Description: 查询新闻 </p>
     *
     * @param
     * @return 结果集
     * @author dragon
     * @date 2020/1/25 1:36 下午
     */
    @PrintParam
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.POST})
    @BusinessLog(logInfo = "查询新闻")
    public Wrapper<PageInfo<NcovWeiboNewsVO>> query(@RequestBody QueryNewsDTO queryNewsDTO) {
        try {
            if (null == queryNewsDTO.getPage()) {
                queryNewsDTO.setPage(GlobalConstant.PAGE_NUM);
            }
            PageHelper.startPage(queryNewsDTO.getPage(), GlobalConstant.PAGE_SIZE);
            List<NcovWeiboNewsVO> list = ncovWeiboNewsService.getNewsList(queryNewsDTO);
            PageInfo<NcovWeiboNewsVO> pageInfo = new PageInfo<>(list);
            return WrapMapper.wrap(Wrapper.SUCCESS_CODE, Wrapper.SUCCESS_MESSAGE, pageInfo);
        } catch (Exception ex) {
            log.error("查询新闻出错：{}", ex.getMessage(), ex);
            return WrapMapper.wrap(Wrapper.ERROR_CODE, Wrapper.ERROR_MESSAGE);
        }
    }
}
