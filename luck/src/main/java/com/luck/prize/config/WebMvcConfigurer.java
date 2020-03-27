package com.luck.prize.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Classname WebMvcConfigurer
 * @Date 10/25/2019 9:10 AM
 * @Created by tanro
 * @Copyright &copy CAUCHINA
 * @Description <p>
 * 该拦截器导致springboot静态资源路径自动配置失效
 */

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

        super.addInterceptors(registry);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
}
