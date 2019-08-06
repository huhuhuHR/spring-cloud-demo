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

 Date: 06/08/2019 21:36:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tmp_dept
-- ----------------------------
DROP TABLE IF EXISTS `tmp_dept`;
CREATE TABLE `tmp_dept`  (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门标识',
  `parent_dept_id` bigint(20) DEFAULT NULL COMMENT '父部门标识',
  `dept_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
