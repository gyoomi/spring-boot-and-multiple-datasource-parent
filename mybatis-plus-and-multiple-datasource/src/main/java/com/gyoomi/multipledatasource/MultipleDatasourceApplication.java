/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Leon
 * @date 2020-06-28 15:11
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class MultipleDatasourceApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(MultipleDatasourceApplication.class, args);
	}

}
