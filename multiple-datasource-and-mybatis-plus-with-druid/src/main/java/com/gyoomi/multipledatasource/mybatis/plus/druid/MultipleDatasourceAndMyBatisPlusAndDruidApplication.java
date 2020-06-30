/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.plus.druid;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Leon
 * @date 2020-06-30 16:23
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class MultipleDatasourceAndMyBatisPlusAndDruidApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MultipleDatasourceAndMyBatisPlusAndDruidApplication.class, args);
	}

}
