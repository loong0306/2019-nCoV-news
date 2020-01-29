package china.fighting.service;

import china.fighting.domain.District;
import china.fighting.domain.NcovNewsKeywords;

import java.util.List;

/**
 * <p>Title: NcovNewsKeywordsService. </p>
 * <p>Description: 2019-nCoV-关键字Service接口 </p>
 * @author dragon
 * @date 2020/1/24 7:13 下午
 */
public interface NcovNewsKeywordsService extends IService<NcovNewsKeywords> {
    
    /**
     * <p>Title: getNcovNewsKeywords. </p>
     * <p>Description: 获取关键字 </p>
     * @author dragon
     * @date 2020/1/24 7:13 下午
     * @return 关键字集合
     */
    List<String> getNcovNewsKeywords();
}
