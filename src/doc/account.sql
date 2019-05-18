/*
 Navicat Premium Data Transfer

 Source Server         : jing
 Source Server Type    : MySQL
 Source Server Version : 50622
 Source Host           : localhost:3306
 Source Schema         : jdbctest

 Target Server Type    : MySQL
 Target Server Version : 50622
 File Encoding         : 65001

 Date: 18/05/2019 18:40:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` float NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, 'aaa', 1000);
INSERT INTO `account` VALUES (2, 'bbb', 1000);
INSERT INTO `account` VALUES (3, 'ccc', 1000);
INSERT INTO `account` VALUES (4, '靖哥', 5000);
INSERT INTO `account` VALUES (6, '丫头', 5000);
INSERT INTO `account` VALUES (7, '靖哥22', 5000);

SET FOREIGN_KEY_CHECKS = 1;
