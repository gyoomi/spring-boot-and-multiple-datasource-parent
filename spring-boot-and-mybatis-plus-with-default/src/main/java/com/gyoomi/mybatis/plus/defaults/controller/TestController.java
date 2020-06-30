/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.mybatis.plus.defaults.controller;

import com.gyoomi.mybatis.plus.defaults.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test
 *
 * @author Leon
 * @date 2020-06-29 17:13
 */
@RestController
public class TestController
{

	@Autowired
	private UserMapper userMapper;

	@GetMapping("test")
	public void test()
	{
		System.out.println(userMapper.selectById(839063639653627328L).toString());
	}

	@GetMapping("test2")
	public void test2()
	{
		System.out.println(userMapper.selectList(null).toString());
	}
}
