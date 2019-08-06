/*
 Navicat Premium Data Transfer

 Source Server         : 154
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : 10.0.53.154:3306
 Source Schema         : huoTest

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 06/08/2019 21:36:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tmp_user
-- ----------------------------
DROP TABLE IF EXISTS `tmp_user`;
CREATE TABLE `tmp_user`  (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `role_id` bigint(255) DEFAULT NULL COMMENT '角色id',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '部门',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人员名称',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系方式',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
