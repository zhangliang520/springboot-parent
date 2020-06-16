/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1_localhost
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost:3306
 Source Schema         : multi_test1

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : 65001

 Date: 06/04/2020 00:55:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `passWord` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nick_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'zhangl', '13128600812', '张亮', NULL);
INSERT INTO `tb_user` VALUES (2, 'zhangl', '13128600812', 'zhangl', NULL);
INSERT INTO `tb_user` VALUES (3, 'zhangl', '13128600812', 'zhangl', NULL);
INSERT INTO `tb_user` VALUES (4, 'zhangl', '13128600812', 'zhangl', NULL);
INSERT INTO `tb_user` VALUES (5, 'zhangl', '13128600812', 'zhangl', NULL);
INSERT INTO `tb_user` VALUES (6, 'zhangl', '13128600812', 'zhangl', NULL);
INSERT INTO `tb_user` VALUES (7, 'zhangl', '13128600812', 'zhangl', NULL);
INSERT INTO `tb_user` VALUES (8, 'zhangl', '13128600812', 'zhangl', NULL);

SET FOREIGN_KEY_CHECKS = 1;
