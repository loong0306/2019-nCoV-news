package china.fighting.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title: QueryNewsDTO. </p>
 * <p>Description: 查询参数DTO </p>
 * @author dragon
 * @date 2020/1/25 1:41 下午
 */
@Data
public class QueryNewsDTO implements Serializable {

    private static final long serialVersionUID = 7268491463513867096L;

    /**
     * 查询参数
     */
    private String search;

    /**
     * 页数
     */
    private Integer page;
}
