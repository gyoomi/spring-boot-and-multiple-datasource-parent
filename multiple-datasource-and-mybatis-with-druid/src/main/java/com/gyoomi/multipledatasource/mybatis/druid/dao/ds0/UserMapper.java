/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.druid.dao.ds0;

import com.gyoomi.multipledatasource.mybatis.druid.model.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户 - Mapper
 *
 * @author Leon
 * @date 2020-06-29 17:04
 */
@Mapper
public interface UserMapper
{

	User findById(@Param("id") Long id);

	@Select("select * from t_user where id = #{id} ")
	@Results({
		@Result(property = "userName",  column = "user_name")
	})
	User findById2(@Param("id") Long id);
}
