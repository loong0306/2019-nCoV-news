package china.fighting.annotation;


import java.lang.annotation.*;

/**
 * <p>Title: PrintParam. </p>
 * <p>Description 打印方法调用注解 </p>
 * @author dragon
 * @date 2018/3/30 下午3:05
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface PrintParam {
}
