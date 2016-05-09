/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : mymanager

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-05-09 08:24:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for testdepartment
-- ----------------------------
DROP TABLE IF EXISTS `testdepartment`;
CREATE TABLE `testdepartment` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testdepartment
-- ----------------------------

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
  KEY `departmentId` (`departmentId`),
  CONSTRAINT `testuser_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `testdepartment` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testuser
-- ----------------------------
INSERT INTO `testuser` VALUES ('00000000001', 'admin@comapny.com', null, 'Yang', 'Bino', null, '1990-11-01', null, null, null, null, null);
INSERT INTO `testuser` VALUES ('00000000002', 'admin1@comapny.com', null, 'Li', 'Peter', null, '1990-10-01', null, null, null, null, null);
