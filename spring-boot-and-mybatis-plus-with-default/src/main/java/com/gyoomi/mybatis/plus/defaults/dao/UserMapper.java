/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.mybatis.plus.defaults.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gyoomi.mybatis.plus.defaults.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 - Mapper
 *
 * @author Leon
 * @date 2020-06-29 17:04
 */
@Mapper
public interface UserMapper extends BaseMapper<User>
{

}
