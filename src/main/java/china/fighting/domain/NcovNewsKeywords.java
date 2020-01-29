package china.fighting.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title: NcovNewsKeywords. </p>
 * <p>Description: 2019-nCoV-新闻关键词</p>
 * @author dragon
 * @date 2020/1/24 7:11 下午
 */
@Data
public class NcovNewsKeywords implements Serializable {

    private static final long serialVersionUID = -6951580495637617234L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 关键字
     */
    private String keywords;
}
