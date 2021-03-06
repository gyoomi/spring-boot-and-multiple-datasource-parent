/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.hikari.dao.ds1;

import com.gyoomi.multipledatasource.mybatis.hikari.model.Order;
import org.apache.ibatis.annotations.*;

/**
 * 订单 - Mapper
 *
 * @author Leon
 * @date 2020-06-29 17:04
 */
@Mapper
public interface OrderMapper
{

	Order findById(@Param("id") Long id);

	@Select("select * from t_order where id = #{id} ")
	Order findById2(@Param("id") Long id);
}
