/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : mymanager

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-05-11 01:57:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for testdepartment
-- ----------------------------
DROP TABLE IF EXISTS `testdepartment`;
CREATE TABLE `testdepartment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testdepartment
-- ----------------------------
INSERT INTO `testdepartment` VALUES ('1', 'IT', 'IT developer');

-- ----------------------------
-- Table structure for testrole
-- ----------------------------
DROP TABLE IF EXISTS `testrole`;
CREATE TABLE `testrole` (
  `id` int(11) NOT NULL,
  `roleName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testrole
-- ----------------------------
INSERT INTO `testrole` VALUES ('1', 'developer');

-- ----------------------------
-- Table structure for testuser
-- ----------------------------
DROP TABLE IF EXISTS `testuser`;
CREATE TABLE `testuser` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `sex` bit(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `hireDate` date DEFAULT NULL,
  `lastLogin` datetime DEFAULT NULL,
  `photo` blob,
  `description` text,
  `departmentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `testuser_ibfk_1` (`departmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testuser
-- ----------------------------
INSERT INTO `testuser` VALUES ('00000000001', 'admin@comapny.com', null, 'Yang', 'Bino', null, '1990-11-01', null, null, null, null, '1');
INSERT INTO `testuser` VALUES ('00000000002', 'admin1@comapny.com', null, 'Li', 'Peter', null, '1990-10-01', null, null, null, null, '1');
INSERT INTO `testuser` VALUES ('00000000003', 'admin3@comapny.com', null, 'Yu', 'Jerry', null, '1991-05-01', null, null, null, null, null);

-- ----------------------------
-- Table structure for testuser_testrole
-- ----------------------------
DROP TABLE IF EXISTS `testuser_testrole`;
CREATE TABLE `testuser_testrole` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `testuser_id` int(11) DEFAULT NULL,
  `testrole_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `testuser_id` (`testuser_id`),
  KEY `testrole_id` (`testrole_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testuser_testrole
-- ----------------------------
INSERT INTO `testuser_testrole` VALUES ('1', '1', '1');
INSERT INTO `testuser_testrole` VALUES ('2', '2', '1');
