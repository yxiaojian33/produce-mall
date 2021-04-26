package com.xiaojian.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by xiaojian on 2019/4/8.
 */
@Configuration
@MapperScan({"com.xiaojian.mall.mapper","com.xiaojian.mall.search.dao"})
public class MyBatisConfig {
}
