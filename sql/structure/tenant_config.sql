/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : enesys

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 20/05/2019 11:39:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tenant_config
-- ----------------------------
DROP TABLE IF EXISTS `tenant_config`;
CREATE TABLE `tenant_config`  (
  `tenant_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '租户id',
  `customize_reset_surplus` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自定义余量重置策略：0关闭；1开启',
  `print_repair_receipt` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '打印补气票据：0关闭；1开启',
  `initial_cyc_qty` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '建档时设置初始累积量：0关闭；1开启',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
  `time_split_enable` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否开放分时计价，0-否，1-是',
  `adjust_ladder` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否允许阶梯按月均摊处理，1-允许，0-禁止',
  `cumulant_report_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开户时默认上报类型：0-标况、1-工况',
  `cumulant_report_type_writable` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开户/换表是否可选择上报类型：0-否、1-是',
  PRIMARY KEY (`tenant_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
