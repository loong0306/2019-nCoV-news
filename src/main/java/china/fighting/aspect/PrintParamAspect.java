package china.fighting.aspect;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.netflix.hystrix.contrib.javanica.utils.AopUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * <p>Title: PrintParamAspect. </p>
 * <p>Description 打印方法调用参数切面 </p>
 * @author dragon
 * @date 2018/3/30 下午3:05
 */
@Component
@Aspect
@Slf4j
public class PrintParamAspect {
    @Around("@annotation(china.fighting.annotation.PrintParam)")
    public Object printParam(final ProceedingJoinPoint joinPoint) throws Throwable {
        Method methodFromTarget = AopUtils.getMethodFromTarget(joinPoint);
        String methodName = methodFromTarget.getName();
        Object[] args = joinPoint.getArgs();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        log.info("方法调用开始: 方法名: {}, 入参: {}", methodName, JSONObject.toJSONStringWithDateFormat(args, dateFormat, SerializerFeature.WriteMapNullValue));
        return joinPoint.proceed();
    }
}
