package com.yegol.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //作为配置类，代替xml配置文件
@ComponentScan(basePackages = {"com.yegol"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
