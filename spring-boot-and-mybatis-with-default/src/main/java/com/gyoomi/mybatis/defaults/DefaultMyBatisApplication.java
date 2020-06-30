/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.mybatis.defaults;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统类
 *
 * @author Leon
 * @date 2020-06-29 17:02
 */
@SpringBootApplication
@MapperScan("com.gyoomi.mybatis.defaults.dao")
public class DefaultMyBatisApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(DefaultMyBatisApplication.class, args);
	}
}
