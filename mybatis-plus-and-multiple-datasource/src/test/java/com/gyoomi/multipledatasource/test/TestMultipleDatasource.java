/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.test;

import com.gyoomi.multipledatasource.dao.GoodMapper;
import com.gyoomi.multipledatasource.dao.OrderMapper;
import com.gyoomi.multipledatasource.dao.UserMapper;
import com.gyoomi.multipledatasource.model.Good;
import com.gyoomi.multipledatasource.model.Order;
import com.gyoomi.multipledatasource.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 *
 * @author Leon
 * @date 2020-06-28 16:13
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@SpringBootTest
public class TestMultipleDatasource
{

	/**
	 * Logger
	 */
	private final Logger lg = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private GoodMapper goodMapper;

	/**
	 * user
	 */
	@Test
	public void testUser() throws Exception
	{
		User user = userMapper.selectById(839063639653627328L);
		lg.info("结果 -> {}", user.toString());
	}

	/**
	 * order
	 */
	@Test
	public void testOrder() throws Exception
	{
		Order order = orderMapper.selectById(227674990704873732L);
		lg.info("结果 -> {}", order.toString());
	}

	/**
	 * good
	 */
	@Test
	public void testGood() throws Exception
	{
		Good good = goodMapper.selectById(896072179243261423L);
		lg.info("结果 -> {}", good.toString());
	}
}
