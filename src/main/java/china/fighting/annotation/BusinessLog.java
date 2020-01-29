package china.fighting.annotation;

import java.lang.annotation.*;

/**
 * <p>Title: BusinessLog. </p>
 * <p>Description 接口调用时间注解 </p>
 * @author dragon
 * @date 2018/3/29 下午10:31
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface BusinessLog {
    String logInfo() default "";
}
