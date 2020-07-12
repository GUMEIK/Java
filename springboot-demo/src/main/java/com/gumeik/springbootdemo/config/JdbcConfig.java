package com.gumeik.springbootdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration//注解，配置类
@PropertySource("classpath:jdbc.properties")//配置文件
public class JdbcConfig {
    @Value("${jdbc.url}")//从配置文件中读取
    String url;
    @Value("${jdbc.driveClassName}")
    String driveClassName;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;
    @Bean//注册数据源
    public DataSource dataSource(){//返回一个数据源
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driveClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
