package china.fighting.mapper;

import china.fighting.config.MyMapper;
import china.fighting.domain.District;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>Title: DistrictMapper. </p>
 * @author dragon
 * @date 2020/1/24 5:43 下午
 */
public interface DistrictMapper extends MyMapper<District> {
    /**
     * <p>Title: getDistrictKey. </p>
     * <p>Description: 获取省市地址关键字 </p>
     * @param type 类型
     * @author dragon
     * @date 2020/1/24 5:50 下午
     * @return list集合
     */
    List<String> getDistrictKey(@Param("type") Integer type);
}
