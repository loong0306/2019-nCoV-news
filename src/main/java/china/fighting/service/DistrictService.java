package china.fighting.service;

import china.fighting.domain.District;

import java.util.List;

/**
 * <p>Title: DistrictService. </p>
 * <p>Description: 省市区查询接口 </p>
 * @author dragon
 * @date 2020/1/24 5:48 下午
 */
public interface DistrictService extends IService<District> {

    /**
     * <p>Title: getDistrictKey. </p>
     * <p>Description: 获取省市地址关键字 </p>
     * @author dragon
     * @date 2020/1/24 5:50 下午
     * @return list集合
     */
    List<String> getDistrictKey();
}
