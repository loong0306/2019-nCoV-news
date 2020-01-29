package china.fighting.service.impl;

import china.fighting.domain.District;
import china.fighting.domain.NcovWeiboNews;
import china.fighting.mapper.NcovWeiboNewsMapper;
import china.fighting.model.dto.QueryNewsDTO;
import china.fighting.model.vo.NcovWeiboNewsApiVO;
import china.fighting.model.vo.NcovWeiboNewsVO;
import china.fighting.service.DistrictService;
import china.fighting.service.NcovWeiboNewsService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: NcovWeiboNewsServiceImpl. </p>
 * @author dragon
 * @date 2020/1/24 6:25 下午
 */
@Slf4j
@Service
public class NcovWeiboNewsServiceImpl extends BaseService<NcovWeiboNews> implements NcovWeiboNewsService {

    @Resource
    private NcovWeiboNewsMapper ncovWeiboNewsMapper;

    /**
     * <p>Title: checkRepeatability. </p>
     * <p>Description: 数据重复性校验 </p>
     * @param sourceId 微博ID
     * @author dragon
     * @date 2020/1/24 6:24 下午
     * @return 校验结果
     */
    @Override
    public Boolean checkRepeatability(String sourceId) {
        NcovWeiboNews news = new NcovWeiboNews();
        news.setSourceId(sourceId);
        return null == ncovWeiboNewsMapper.selectOne(news);
    }

    /**
     * <p>Title: getNewsList. </p>
     * <p>Description: 分页关键字查询新闻列表 </p>
     *
     * @param queryNewsDTO 查询参数DTO
     * @return 查询结果
     * @author dragon
     * @date 2020/1/25 1:48 下午
     */
    @Override
    public List<NcovWeiboNewsVO> getNewsList(QueryNewsDTO queryNewsDTO) {
        String search = queryNewsDTO.getSearch();
        return ncovWeiboNewsMapper.getNewsList(search);
    }

    /**
     * <p>Title: getNewsList. </p>
     * <p>Description: 提供API使用 - 分页关键字查询新闻列表 </p>
     *
     * @param search 搜索关键字
     * @return 查询结果
     * @author dragon
     * @date 2020/1/25 1:48 下午
     */
    @Override
    public List<NcovWeiboNewsApiVO> getNewsListForApi(String search) {
        return ncovWeiboNewsMapper.getNewsListForApi(search);
    }
}
