/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.plus.hikari.controller;


import com.gyoomi.multipledatasource.mybatis.plus.hikari.dao.GoodMapper;
import com.gyoomi.multipledatasource.mybatis.plus.hikari.dao.OrderMapper;
import com.gyoomi.multipledatasource.mybatis.plus.hikari.dao.UserMapper;
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
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private GoodMapper goodMapper;

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

	@GetMapping("test3")
	public void test3()
	{
		System.out.println(orderMapper.selectById(611343266355747947L).toString());
	}

	@GetMapping("test4")
	public void test4()
	{
		System.out.println(orderMapper.selectList(null).toString());
	}

	@GetMapping("test5")
	public void test5()
	{
		System.out.println(goodMapper.selectById(482270110109352303L).toString());
	}

	@GetMapping("test6")
	public void test6()
	{
		System.out.println(goodMapper.selectList(null).toString());
	}
}
