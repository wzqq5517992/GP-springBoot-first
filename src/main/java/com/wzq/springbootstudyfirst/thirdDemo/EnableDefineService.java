package com.wzq.springbootstudyfirst.thirdDemo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 18:02
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented //文档化
@Inherited //是否允许被继承
@Import({CacheImportSelector.class}) //
public @interface EnableDefineService {
    //配置方法
    Class<?>[] exclude() default {};
}
