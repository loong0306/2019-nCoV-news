package china.fighting.service;

import china.fighting.domain.NcovWeiboNews;
import china.fighting.model.dto.QueryNewsDTO;
import china.fighting.model.vo.NcovWeiboNewsApiVO;
import china.fighting.model.vo.NcovWeiboNewsVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>Title: NcovWeiboNewsService. </p>
 * <p>Description: ncov新闻Service接口 </p>
 *
 * @author dragon
 * @date 2020/1/24 6:23 下午
 */
public interface NcovWeiboNewsService extends IService<NcovWeiboNews> {

    /**
     * <p>Title: checkRepeatability. </p>
     * <p>Description: 数据重复性校验 </p>
     *
     * @param sourceId 微博ID
     * @return 校验结果
     * @author dragon
     * @date 2020/1/24 6:24 下午
     */
    Boolean checkRepeatability(String sourceId);

    /**
     * <p>Title: getNewsList. </p>
     * <p>Description: 分页关键字查询新闻列表 </p>
     *
     * @param queryNewsDTO 查询参数DTO
     * @return 查询结果
     * @author dragon
     * @date 2020/1/25 1:48 下午
     */
    List<NcovWeiboNewsVO> getNewsList(QueryNewsDTO queryNewsDTO);

    /**
     * <p>Title: getNewsList. </p>
     * <p>Description: 分页关键字查询新闻列表 </p>
     *
     * @param search 搜索关键字
     * @return 查询结果
     * @author dragon
     * @date 2020/1/25 1:48 下午
     */
    List<NcovWeiboNewsApiVO> getNewsListForApi(String search);
}
