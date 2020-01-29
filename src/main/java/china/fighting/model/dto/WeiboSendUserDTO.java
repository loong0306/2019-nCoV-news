package china.fighting.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title: from. </p>
 * <p>Description: 来源 </p>
 * @author dragon
 * @date 2020/1/24 3:03 下午
 */
@Data
public class WeiboSendUserDTO implements Serializable {
    private static final long serialVersionUID = -830085891620883704L;
    /**
     * 微博主ID
     */
    private String id;

    /**
     * 微博昵称
     */
    private String name;
}
