USE db0;
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` BIGINT ( 11 ) NOT NULL COMMENT '主键',
  `user_name` VARCHAR ( 255 ) DEFAULT NULL COMMENT '用户名',
  `address` VARCHAR ( 255 ) DEFAULT NULL COMMENT '地址',
  `age` INT ( 11 ) DEFAULT NULL COMMENT '年龄',
  `remark` VARCHAR ( 255 ) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY ( `id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;
INSERT INTO `db0`.`t_user`(`id`, `user_name`, `address`, `age`, `remark`) VALUES (182656430101974920, '张三', '美国纽约', 45, '无');
INSERT INTO `db0`.`t_user`(`id`, `user_name`, `address`, `age`, `remark`) VALUES (839063639653627328, '李四', '中国北京', 18, NULL);


USE db1;
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` BIGINT ( 11 ) NOT NULL COMMENT '主键',
  `order_date` VARCHAR ( 255 ) DEFAULT NULL COMMENT '下单时间',
  `order_money` VARCHAR ( 255 ) DEFAULT NULL COMMENT '订单金额',
  `remark` VARCHAR ( 255 ) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY ( `id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;
INSERT INTO `db1`.`t_order`(`id`, `order_date`, `order_money`, `remark`) VALUES (227674990704873732, '2020-02-21', '999.00', '正常订单');
INSERT INTO `db1`.`t_order`(`id`, `order_date`, `order_money`, `remark`) VALUES (611343266355747947, '2020-06-18', '8993.00', '特惠订单');

USE db2;
DROP TABLE IF EXISTS `t_good`;
CREATE TABLE `t_good` (
  `id` BIGINT ( 11 ) NOT NULL COMMENT '主键',
  `good_name` VARCHAR ( 255 ) DEFAULT NULL COMMENT '商品名称',
  `good_category` VARCHAR ( 255 ) DEFAULT NULL COMMENT '商品所属分类',
  `good_content` VARCHAR ( 255 ) DEFAULT NULL COMMENT '商品内容',
  `remark` VARCHAR ( 255 ) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;
INSERT INTO `db2`.`t_good`(`id`, `good_name`, `good_category`, `good_content`, `remark`) VALUES (896072179243261423, 'iphone11 Pro', '手机', '介绍介绍........', '618特惠');
INSERT INTO `db2`.`t_good`(`id`, `good_name`, `good_category`, `good_content`, `remark`) VALUES (482270110109352303, 'iphone11', '手机', '哈哈哈哈哈哈', '暂无优惠');


