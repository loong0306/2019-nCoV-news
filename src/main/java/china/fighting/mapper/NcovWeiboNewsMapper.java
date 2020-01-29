package china.fighting.mapper;

import china.fighting.config.MyMapper;
import china.fighting.domain.NcovWeiboNews;
import china.fighting.model.vo.NcovWeiboNewsApiVO;
import china.fighting.model.vo.NcovWeiboNewsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>Title: NcovWeiboNewsService. </p>
 *
 * @author dragon
 * @date 2020/1/24 3:56 下午
 */
public interface NcovWeiboNewsMapper extends MyMapper<NcovWeiboNews> {

    /**
     * <p>Title: getNewsList. </p>
     * <p>Description: 分页关键字查询新闻列表 </p>
     *
     * @param search 查询关键字
     * @return 查询结果
     * @author dragon
     * @date 2020/1/25 1:48 下午
     */
    List<NcovWeiboNewsVO> getNewsList(@Param("search") String search);

    /**
     * <p>Title: getNewsListForApi. </p>
     * <p>Description: 提供API使用 - 分页关键字查询新闻列表 </p>
     *
     * @param search 搜索关键字
     * @return 查询结果
     * @author dragon
     * @date 2020/1/25 1:48 下午
     */
    List<NcovWeiboNewsApiVO> getNewsListForApi(@Param("search") String search);
}