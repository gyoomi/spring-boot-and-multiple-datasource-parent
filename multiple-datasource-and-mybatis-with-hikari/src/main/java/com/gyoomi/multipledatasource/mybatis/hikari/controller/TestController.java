/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.hikari.controller;

import com.gyoomi.multipledatasource.mybatis.hikari.dao.ds0.UserMapper;
import com.gyoomi.multipledatasource.mybatis.hikari.dao.ds1.OrderMapper;
import com.gyoomi.multipledatasource.mybatis.hikari.dao.ds2.GoodMapper;
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
		System.out.println(userMapper.findById(839063639653627328L).toString());
	}

	@GetMapping("test2")
	public void test2()
	{
		System.out.println(userMapper.findById2(839063639653627328L).toString());
	}

	@GetMapping("test3")
	public void test3()
	{
		System.out.println(orderMapper.findById(611343266355747947L).toString());
	}

	@GetMapping("test4")
	public void test4()
	{
		System.out.println(orderMapper.findById2(611343266355747947L).toString());
	}

	@GetMapping("test5")
	public void test5()
	{
		System.out.println(goodMapper.findById(482270110109352303L).toString());
	}

	@GetMapping("test6")
	public void test6()
	{
		System.out.println(goodMapper.findById2(896072179243261423L).toString());
	}
}
