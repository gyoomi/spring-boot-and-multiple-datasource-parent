/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.mybatis.defaults.dao;

import com.gyoomi.mybatis.defaults.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * 用户 - Mapper
 *
 * @author Leon
 * @date 2020-06-29 17:04
 */
public interface UserMapper
{

	User findById(@Param("id") Long id);

	@Select("select * from t_user where id = #{id} ")
	@Results({
		@Result(property = "userName",  column = "user_name")
	})
	User findById2(@Param("id") Long id);
}
