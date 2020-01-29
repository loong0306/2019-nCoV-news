package china.fighting.mapper;

import china.fighting.config.MyMapper;
import china.fighting.domain.NcovNewsKeywords;

import java.util.List;

/**
 * <p>Title: NcovNewsKeywordsMapper. </p>
 *
 * @author dragon
 * @date 2020/1/24 7:15 下午
 */
public interface NcovNewsKeywordsMapper extends MyMapper<NcovNewsKeywords> {

    /**
     * <p>Title: getNcovNewsKeywords. </p>
     * <p>Description: 获取关键字 </p>
     *
     * @return 关键字集合
     * @author dragon
     * @date 2020/1/24 7:13 下午
     */
    List<String> getNcovNewsKeywords();
}
