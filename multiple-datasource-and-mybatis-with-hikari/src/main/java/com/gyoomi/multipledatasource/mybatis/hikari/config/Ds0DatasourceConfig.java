/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.hikari.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Ds0 - 数据源 - Config
 *
 * @author Leon
 * @date 2020-06-29 11:01
 */
@Configuration
@MapperScan(basePackages = "com.gyoomi.multipledatasource.mybatis.hikari.dao.ds0", sqlSessionFactoryRef = "ds0SqlSessionFactory")
public class Ds0DatasourceConfig
{

//	@Value("${spring.datasource.ds0.url}")
//	private String jdbcUrl;

	@Value("${spring.datasource.ds0.username}")
	private String username;

	@Value("${spring.datasource.ds0.password}")
	private String password;

	@Value("${spring.datasource.ds0.driver-class-name}")
	private String driverClassName;

	@Bean("ds0")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.ds0")
	public DataSource dataSource(DataSourceProperties properties)
	{

//		return DataSourceBuilder.create(properties.getClassLoader())
//			.type(HikariDataSource.class)
//			.driverClassName(driverClassName)
//			.url(jdbcUrl)
//			.username(username)
//			.password(password)
//			.build();
		// 单数据源自动配置
		 return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}

	@Bean("ds0SqlSessionFactory")
	@Primary
	public SqlSessionFactory sqlSessionFactory(@Qualifier("ds0") DataSource ds) throws Exception
	{
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(ds);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
		return bean.getObject();
	}

	@Bean("ds0SqlSessionTemplate")
	@Primary
	public SqlSessionTemplate sqlSessionTemplate(@Qualifier("ds0SqlSessionFactory") SqlSessionFactory sqlSessionFactory)
	{
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	@Bean("ds0DataSourceTransactionManager")
	@Primary
	public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("ds0") DataSource ds)
	{
		return new DataSourceTransactionManager(ds);
	}
}
