package china.fighting.utils;

import com.wxapi.WxApiCall.WxApiCall;
import com.wxapi.model.RequestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: ApiUtil. </p>
 * <p>Description: 微博api </p>
 *
 * @author dragon
 * @date 2020/1/24 12:33 下午
 */
@Slf4j
@Component
public class ApiUtil {

    /**
     * 微博API接口地址
     */
    private static final String API_URL = "https://way.jd.com/JianYiXun/post_weibo";

    /**
     * 微博API—APP-KEY
     */
    @Value("${app.api.key}")
    private String appApiKey;

    /**
     * <p>Title: getApiContent. </p>
     * <p>Description: 获取微博内容 </p>
     *
     * @param oid 关注用户ID
     * @return 返回结果
     * @author dragon
     * @date 2020/1/24 12:34 下午
     */
    public String getApiContent(String oid) {
        RequestModel model = new RequestModel();
        model.setGwUrl(API_URL);
        model.setAppkey(appApiKey);
        Map<String, Object> queryMap = new HashMap<>(3);
        queryMap.put("uid", oid);
        queryMap.put("kw", "");
        queryMap.put("pageToken", "");
        model.setQueryParams(queryMap);
        WxApiCall call = new WxApiCall();
        call.setModel(model);
        return call.request();
    }
}
