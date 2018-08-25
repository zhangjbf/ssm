package com.yonyou.wljt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration // 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
@ComponentScan(basePackages = "com.yonyou.wljt.service") // 配置扫描包
@PropertySource(value = { "classpath:resource/db.properties" }, ignoreResourceNotFound = true)
public class SpringConfig {

	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Value("${jdbc.driver}")
	private String jdbcDriverClassName;

	@Value("${jdbc.username}")
	private String jdbcUsername;

	@Value("${jdbc.password}")
	private String jdbcPassword;

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
		datasource.setDriverClassName(jdbcDriverClassName);
		// 相应驱动的jdbcUrl
		datasource.setUrl(jdbcUrl);
		// 数据库的用户名
		datasource.setUsername(jdbcUsername);
		// 数据库的密码
		datasource.setPassword(jdbcPassword);
		return datasource;
	}
	
	

}
