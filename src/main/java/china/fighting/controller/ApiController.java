package china.fighting.controller;

import china.fighting.annotation.BusinessLog;
import china.fighting.constants.GlobalConstant;
import china.fighting.model.vo.NcovWeiboNewsApiVO;
import china.fighting.model.wrap.WrapMapper;
import china.fighting.model.wrap.Wrapper;
import china.fighting.service.NcovWeiboNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: ApiController. </p>
 * <p>Description: 对外提供服务接口 </p>
 *
 * @author dragon
 * @date 2020/1/28 7:59 下午
 */
@Slf4j
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ApiController {
    @Resource
    private NcovWeiboNewsService ncovWeiboNewsService;

    /**
     * <p>Title: news. </p>
     * <p>Description: API对外接口查询新闻 </p>
     *
     * @param search 搜索关键字（可为空）
     * @param page   分页、默认第一页
     * @return 结果集
     * @author dragon
     * @date 2020/1/28 7:36 下午
     */
    @ResponseBody
    @RequestMapping(value = "/news", method = {RequestMethod.GET})
    @BusinessLog(logInfo = "API对外接口查询新闻")
    public Wrapper<PageInfo<NcovWeiboNewsApiVO>> query(@RequestParam(value = "search", required = false, defaultValue = "") String search,
                                                       @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
        try {
            PageHelper.startPage(page, GlobalConstant.PAGE_SIZE);
            List<NcovWeiboNewsApiVO> list = ncovWeiboNewsService.getNewsListForApi(search);
            PageInfo<NcovWeiboNewsApiVO> pageInfo = new PageInfo<>(list);
            return WrapMapper.wrap(Wrapper.SUCCESS_CODE, Wrapper.SUCCESS_MESSAGE, pageInfo);
        } catch (Exception ex) {
            log.error("API对外接口查询新闻：{}", ex.getMessage(), ex);
            return WrapMapper.wrap(Wrapper.ERROR_CODE, Wrapper.ERROR_MESSAGE);
        }
    }
}
