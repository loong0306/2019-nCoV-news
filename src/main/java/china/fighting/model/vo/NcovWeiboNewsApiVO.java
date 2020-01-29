package china.fighting.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title: NcovWeiboNewsApiVO. </p>
 * <p>Description: 提供API使用：2019-nCoV微博新闻返回VO </p>
 * @author dragon
 * @date 2020/1/28 8:07 下午
 */
@Data
public class NcovWeiboNewsApiVO implements Serializable {
    private static final long serialVersionUID = -1260733410527948988L;
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
