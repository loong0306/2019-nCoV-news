package china.fighting.service.impl;

import china.fighting.domain.District;
import china.fighting.mapper.DistrictMapper;
import china.fighting.service.DistrictService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: DistrictServiceImpl. </p>
 *
 * @author dragon
 * @date 2020/1/24 5:52 下午
 */
@Slf4j
@Service
public class DistrictServiceImpl extends BaseService<District> implements DistrictService {

    @Resource
    private DistrictMapper districtMapper;

    /**
     * <p>Title: getDistrictKey. </p>
     * <p>Description: 获取省市地址关键字 </p>
     *
     * @return list集合
     * @author dragon
     * @date 2020/1/24 5:50 下午
     */
    @Override
    public List<String> getDistrictKey() {
        List<String> list = Lists.newArrayList();
        List<String> province = districtMapper.getDistrictKey(1);
        List<String> city = districtMapper.getDistrictKey(2);
        // push
        list.addAll(city);
        list.addAll(province);
        return list;
    }
}
