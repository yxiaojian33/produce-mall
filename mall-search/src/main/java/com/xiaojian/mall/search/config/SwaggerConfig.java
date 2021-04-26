package com.xiaojian.mall.search.config;

import com.xiaojian.mall.common.config.BaseSwaggerConfig;
import com.xiaojian.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by xiaojian on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.xiaojian.mall.search.controller")
                .title("mall搜索系统")
                .description("mall搜索相关接口文档")
                .contactName("xiaojian")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
