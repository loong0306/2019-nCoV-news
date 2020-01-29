package china.fighting.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title: District. </p>
 * <p>Description: 省市区 </p>
 * @author dragon
 * @date 2020/1/24 5:18 下午
 */
@Data
public class District implements Serializable {
    private static final long serialVersionUID = 1112243324311727392L;
    /**
     * 省市区：1、省 2、市 3、区
     */
    private Integer type;

    /**
     * 城市名
     */
    private String districtName;
}
