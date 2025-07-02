package com.fitlog.mvc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.fitlog.mvc.model.dao")
@Configuration
public class MyBatisConfig {

}
