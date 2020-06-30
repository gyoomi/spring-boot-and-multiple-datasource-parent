/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.plus.hikari.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gyoomi.multipledatasource.mybatis.plus.hikari.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * User Mapper
 *
 * @author Leon
 * @date 2020-06-28 15:57
 */
@Mapper
@DS("ds0")
public interface UserMapper extends BaseMapper<User>
{
}
