/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : prize

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2020-03-27 16:58:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `meeting_prize`
-- ----------------------------
DROP TABLE IF EXISTS `meeting_prize`;
CREATE TABLE `meeting_prize` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '中奖姓名',
  `prize_level` varchar(20) DEFAULT NULL COMMENT '几等奖',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='中奖记录';

-- ----------------------------
-- Records of meeting_prize
-- ----------------------------
INSERT INTO `meeting_prize` VALUES ('199', 'tx', '三等奖');
INSERT INTO `meeting_prize` VALUES ('203', 'tx4', '三等奖');
INSERT INTO `meeting_prize` VALUES ('204', 'tx5', '三等奖');

-- ----------------------------
-- Table structure for `meeting_user`
-- ----------------------------
DROP TABLE IF EXISTS `meeting_user`;
CREATE TABLE `meeting_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `image` varchar(255) DEFAULT NULL COMMENT '头像',
  `thumb_image` varchar(255) DEFAULT NULL COMMENT '头像',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=206 DEFAULT CHARSET=utf8 COMMENT='抽奖名单';

-- ----------------------------
-- Records of meeting_user
-- ----------------------------
INSERT INTO `meeting_user` VALUES ('199', '/static/img/tx.png', '/static/img/tx.png', 'tx');
INSERT INTO `meeting_user` VALUES ('200', '/static/img/tx1.png', '/static/img/tx1.png', 'tx1');
INSERT INTO `meeting_user` VALUES ('201', '/static/img/tx2.png', '/static/img/tx2.png', 'tx2');
INSERT INTO `meeting_user` VALUES ('202', '/static/img/tx3.png', '/static/img/tx3.png', 'tx3');
INSERT INTO `meeting_user` VALUES ('203', '/static/img/tx4.png', '/static/img/tx4.png', 'tx4');
INSERT INTO `meeting_user` VALUES ('204', '/static/img/tx5.png', '/static/img/tx5.png', 'tx5');
INSERT INTO `meeting_user` VALUES ('205', '/static/img/tx6.png', '/static/img/tx6.png', 'tx6');

-- ----------------------------
-- Table structure for `prize`
-- ----------------------------
DROP TABLE IF EXISTS `prize`;
CREATE TABLE `prize` (
  `title` varchar(255) DEFAULT NULL COMMENT '奖品名称',
  `level` varchar(255) DEFAULT NULL COMMENT '几等奖',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  `type` int(1) DEFAULT '-1' COMMENT '1 游戏  2 抽奖'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖品';

-- ----------------------------
-- Records of prize
-- ----------------------------
INSERT INTO `prize` VALUES ('特等奖', '1', '/static/img/te.jpg', '2');
INSERT INTO `prize` VALUES ('一等奖', '2', '/static/img/一.jpg', '2');
INSERT INTO `prize` VALUES ('二等奖', '3', '/static/img/二.jpg', '2');
INSERT INTO `prize` VALUES ('三等奖', '4', '/static/img/三.jpg', '2');
INSERT INTO `prize` VALUES ('游戏', '-1', '/static/img/play.jpg', '1');
