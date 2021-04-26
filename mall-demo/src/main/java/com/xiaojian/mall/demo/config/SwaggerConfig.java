package com.xiaojian.mall.demo.config;

import com.xiaojian.mall.common.config.BaseSwaggerConfig;
import com.xiaojian.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by xiaojian on 2019/4/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.xiaojian.mall.demo.controller")
                .title("mall-demo系统")
                .description("SpringCloud版本中的一些示例")
                .contactName("xiaojian")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
