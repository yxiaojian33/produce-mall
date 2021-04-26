package com.xiaojian.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by xiaojian on 2019/4/8.
 */
@Configuration
@MapperScan("com.xiaojian.mall.mapper")
public class MyBatisConfig {
}
