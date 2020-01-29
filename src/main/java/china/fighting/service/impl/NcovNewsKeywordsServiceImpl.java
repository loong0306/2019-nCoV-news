package china.fighting.service.impl;

import china.fighting.domain.NcovNewsKeywords;
import china.fighting.mapper.NcovNewsKeywordsMapper;
import china.fighting.service.NcovNewsKeywordsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: NcovNewsKeywordsService. </p>
 * <p>Description: 2019-nCoV-关键字Service接口 </p>
 * @author dragon
 * @date 2020/1/24 7:13 下午
 */
@Slf4j
@Service
public class NcovNewsKeywordsServiceImpl extends BaseService<NcovNewsKeywords> implements NcovNewsKeywordsService {

    @Resource
    private NcovNewsKeywordsMapper ncovNewsKeywordsMapper;

    /**
     * <p>Title: getNcovNewsKeywords. </p>
     * <p>Description: 获取关键字 </p>
     * @author dragon
     * @date 2020/1/24 7:13 下午
     * @return 关键字集合
     */
    @Override
    public List<String> getNcovNewsKeywords() {
        return ncovNewsKeywordsMapper.getNcovNewsKeywords();
    }
}
