/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gyoomi.multipledatasource.model.Good;
import org.apache.ibatis.annotations.Mapper;

/**
 * Good Mapper
 *
 * @author Leon
 * @date 2020-06-28 15:57
 */
@Mapper
@DS("ds2")
public interface GoodMapper extends BaseMapper<Good>
{
}
