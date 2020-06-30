/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.simple.dao.ds0;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gyoomi.multipledatasource.simple.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * User Mapper
 *
 * @author Leon
 * @date 2020-06-28 15:57
 */
@Mapper
public interface UserMapper extends BaseMapper<User>
{
}
