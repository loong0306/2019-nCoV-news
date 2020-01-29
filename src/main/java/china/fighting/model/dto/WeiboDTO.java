package china.fighting.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title: WeiboDTO. </p>
 * @author dragon
 * @date 2020/1/24 1:06 下午
 */
@Data
public class WeiboDTO implements Serializable {
    private static final long serialVersionUID = -1700486887380611121L;
    /**
     * 微博ID
     */
    private String id;

    /**
     * 链接
     */
    private String url;

    /**
     * 内容
     */
    private String content;

    /**
     * 时间字符串
     */
    private String pDate;

    /**
     * 微博发送用户信息
     */
    private WeiboSendUserDTO from;
}
