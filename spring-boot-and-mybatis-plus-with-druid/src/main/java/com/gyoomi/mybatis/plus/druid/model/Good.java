/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.mybatis.plus.druid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Good - Model
 *
 * @author Leon
 * @date 2020-06-28 15:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good
{
	private Long id;
	private String goodName;
	private String goodCategory;
	private String goodContent;
	private String remark;
}
