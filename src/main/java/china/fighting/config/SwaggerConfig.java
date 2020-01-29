package china.fighting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>Title: SwaggerConfig. </p>
 * <p>Description Swagger配置 </p>
 * @author dragon
 * @date 2020/1/23 下午3:24
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Swagger配置
     * @author: dragon
     * apiInfo - 自定义Swagger基础信息头
     * select - 选择哪些路径和API是需要生成document
     * apis API接口包扫描路径
     *   - 参数 : RequestHandlerSelectors.any() api接口包扫描路径，对所有api进行监控
     *   - 参数 : RequestHandlerSelectors.basePackage(...) 过滤其他包，仅对选中包进行监控
     *   - 参数 : RequestHandlerSelectors.withClassAnnotation(...) 通过类注解形式进行过滤监控
     *   - 参数 : RequestHandlerSelectors.withMethodAnnotation(...) 通过类注解形式进行过滤监控
     * paths 可以根据接口url路径设置哪些请求加入文档，忽略哪些请求
     *   - 参数 : PathSelectors.any() 对所有接口路径进行监控
     *   - 参数 : PathSelectors.regex("/comm.*") 对接口路径进行过滤监控
     */
    @Bean
    public Docket reservationApi() {
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("china.fighting.restful"))
                .paths(PathSelectors.any())
                .build();
    }

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("2019-nCoV-today")
		        .description("Hope well.").version("1.0").build();
	}

}