package com.rpc.server;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RPC服务注解，标注在服务实现类上
 */
@Target({ElementType.TYPE})
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface RpcService {

    /**
     * 实现的服务接口类
     */
    Class<?> value();

    /**
     * 服务版本号
     */
    String version() default "";
}
