/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.druid.config;

import com.alibaba.druid.pool.DruidDataSource;
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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Ds2 - 数据源 - Config
 *
 * @author Leon
 * @date 2020-06-29 11:01
 */
@Configuration
@MapperScan(basePackages = "com.gyoomi.multipledatasource.mybatis.druid.dao.ds2", sqlSessionFactoryRef = "ds2SqlSessionFactory")
public class Ds2DatasourceConfig
{

	@Value("${spring.datasource.druid.ds2.url}")
	private String jdbcUrl;

	@Value("${spring.datasource.druid.ds2.username}")
	private String username;

	@Value("${spring.datasource.druid.ds2.password}")
	private String password;

	@Value("${spring.datasource.druid.ds2.driver-class-name}")
	private String driverClassName;

	@Bean("ds2")
	@ConfigurationProperties(prefix = "spring.datasource.druid.ds2")
	public DataSource dataSource(DataSourceProperties properties)
	{

//		return DataSourceBuilder.create(properties.getClassLoader())
//			.type(DruidDataSource.class)
//			.driverClassName(driverClassName)
//			.url(jdbcUrl)
//			.username(username)
//			.password(password)
//			.build();
		return DataSourceBuilder.create().type(DruidDataSource.class).build();
	}

	@Bean("ds2SqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("ds2") DataSource ds) throws Exception
	{
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(ds);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
		return bean.getObject();
	}

	@Bean("ds2SqlSessionTemplate")
	public SqlSessionTemplate sqlSessionTemplate(@Qualifier("ds2SqlSessionFactory") SqlSessionFactory sqlSessionFactory)
	{
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	@Bean("ds2DataSourceTransactionManager")
	public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("ds2") DataSource ds)
	{
		return new DataSourceTransactionManager(ds);
	}
}
