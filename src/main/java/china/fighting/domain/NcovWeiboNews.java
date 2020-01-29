package china.fighting.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * <p>Title: NcovWeiboNews. </p>
 * <p>Description: 2019-nCoV-微博新闻 </p>
 * @author dragon
 * @date 2020/1/24 3:55 下午
 */
@Data
public class NcovWeiboNews implements Serializable {
    private static final long serialVersionUID = -8336988577358480487L;
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 城市关键字
     */
    private String cityKey;

    /**
     * 微博ID
     */
    private String sourceId;

    /**
     * 微博URL
     */
    private String url;

    /**
     * 微博内容
     */
    private String content;

    /**
     * 微博时间
     */
    private String sendTime;

    /**
     * 微博主ID
     */
    private String fromId;

    /**
     * 微博昵称
     */
    private String fromName;

    /**
     * 时间
     */
    private Date ts;
}