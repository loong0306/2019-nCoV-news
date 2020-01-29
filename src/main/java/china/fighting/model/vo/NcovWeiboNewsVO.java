package china.fighting.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title: NcovWeiboNewsVO. </p>
 * <p>Description: 2019-nCoV微博新闻返回VO </p>
 * @author dragon
 * @date 2020/1/25 1:39 下午
 */
@Data
public class NcovWeiboNewsVO implements Serializable {

    private static final long serialVersionUID = -3019683601939254002L;
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
     * 微博昵称
     */
    private String fromName;
}
