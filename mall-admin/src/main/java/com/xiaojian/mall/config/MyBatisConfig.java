package com.xiaojian.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.xiaojian.mall.mapper","com.xiaojian.mall.dao"})
public class MyBatisConfig {
}
