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

 Date: 06/08/2019 21:36:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tmp_role
-- ----------------------------
DROP TABLE IF EXISTS `tmp_role`;
CREATE TABLE `tmp_role`  (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
