package com.trendyol.jsonlogger.configuration;

import com.trendyol.jsonlogger.interceptor.LoggingInterceptorAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {


    private LoggingInterceptorAdapter loggingInterceptorAdapter;

    @Autowired
    public InterceptorConfiguration(LoggingInterceptorAdapter loggingInterceptorAdapter) {
        this.loggingInterceptorAdapter = loggingInterceptorAdapter;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(loggingInterceptorAdapter)
                .addPathPatterns("/*");
    }
}
