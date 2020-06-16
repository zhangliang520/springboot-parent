/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1_localhost
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : 65001

 Date: 06/04/2020 00:25:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (13);

-- ----------------------------
-- Table structure for tb_hobby
-- ----------------------------
DROP TABLE IF EXISTS `tb_hobby`;
CREATE TABLE `tb_hobby`  (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_1g1ws14kbw30ekfpwmbnv26m0`(`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_hobby
-- ----------------------------
INSERT INTO `tb_hobby` VALUES (0, '篮球', 1);
INSERT INTO `tb_hobby` VALUES (1, '旅游', 1);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `age` int(11) NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nick_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pass_word` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reg_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_mx7woyv2wwr462kfnpdhsfvxa`(`email`) USING BTREE,
  UNIQUE INDEX `UK_obbnmq5l56ghtreq7gj2ixt10`(`user_name`) USING BTREE,
  UNIQUE INDEX `UK_qsfr3pppdg879a7n2nfjuyf7h`(`nick_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 29, '1796969389@qq.com', 'zhangl', '13128600812', '2020年2月29日 下午03时36分18秒', 'zhangl');
INSERT INTO `tb_user` VALUES (12, 30, '17969693891@qq.com', 'zhangl1', '123456', '2020-04-02', 'zhangliang');

SET FOREIGN_KEY_CHECKS = 1;
