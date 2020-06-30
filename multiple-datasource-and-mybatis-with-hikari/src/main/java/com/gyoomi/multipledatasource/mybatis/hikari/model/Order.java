/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.multipledatasource.mybatis.hikari.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Order - Model
 *
 * @author Leon
 * @date 2020-06-28 15:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
	private Long id;
	private String orderDate;
	private String orderMoney;
	private String remark;
}
