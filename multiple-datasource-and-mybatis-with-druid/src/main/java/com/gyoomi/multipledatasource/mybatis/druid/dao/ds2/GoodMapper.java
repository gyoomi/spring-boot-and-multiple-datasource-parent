/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.druid.dao.ds2;

import com.gyoomi.multipledatasource.mybatis.druid.model.Good;
import org.apache.ibatis.annotations.*;

/**
 * 商品 - Mapper
 *
 * @author Leon
 * @date 2020-06-29 17:04
 */
@Mapper
public interface GoodMapper
{

	Good findById(@Param("id") Long id);

	@Select("select * from t_good where id = #{id} ")
	@Results({
		@Result(property = "goodName",  column = "good_name"),
		@Result(property = "goodCategory",  column = "good_category")
	})
	Good findById2(@Param("id") Long id);
}
