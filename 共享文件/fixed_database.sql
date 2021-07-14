/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2021-07-14 13:55:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `ADDR_ID` bigint(20) NOT NULL,
  `PHONE` char(11) DEFAULT NULL,
  `PROVINCE` varchar(20) DEFAULT NULL,
  `CITY` varchar(20) DEFAULT NULL,
  `SECTION` varchar(20) DEFAULT NULL,
  `DETAIL` varchar(50) DEFAULT NULL,
  `RECEIVE_NAME` varchar(30) DEFAULT NULL,
  `RECEIVE_PHONE` char(11) DEFAULT NULL,
  `IS_DEFAULT` int(8) DEFAULT NULL,
  PRIMARY KEY (`ADDR_ID`),
  KEY `FK_Reference_17` (`PHONE`),
  CONSTRAINT `FK_Reference_17` FOREIGN KEY (`PHONE`) REFERENCES `users` (`PHONE`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('1', '12345678910', 'ZHEJIANG', 'WENZHOU', 'LUCHENG', 'NONE', 'Mary', '12345678910', '1');
INSERT INTO `address` VALUES ('2', '12345678911', 'ZHEJIANG', 'WENZHOU', 'LUCHENG', 'NONE', 'Adeline', '12345678911', '1');
INSERT INTO `address` VALUES ('3', '12345678912', 'FUJIAN', 'QUANZHOU', 'QUANGANG', 'NONE', 'Bob', '12345678912', '1');
INSERT INTO `address` VALUES ('4', '12345678913', 'FUJIAN', 'QUANZHOU', 'QUANGANG', 'NONE', 'John', '12345678913', '1');
INSERT INTO `address` VALUES ('5', '12345678914', 'FUJIAN', 'QUANZHOU', 'QUANGANG', 'NONE', 'Ada', '12345678914', '1');
INSERT INTO `address` VALUES ('6', '12345678915', 'FUJIAN', 'QUANZHOU', 'QUANGANG', 'NONE', 'Boost', '12345678915', '1');
INSERT INTO `address` VALUES ('7', '12345678916', 'ZHEJIANG', 'WENZHOU', 'LUCHENG', 'NONE', 'Andy', '12345678916', '1');
INSERT INTO `address` VALUES ('8', '12345678917', 'ZHEJIANG', 'WENZHOU', 'LUCHENG', 'NONE', 'Allan', '12345678917', '1');
INSERT INTO `address` VALUES ('9', '12345678918', 'ZHEJIANG', 'WENZHOU', 'LUCHENG', 'NONE', 'Peter', '12345678918', '1');
INSERT INTO `address` VALUES ('10', '12345678919', 'ZHEJIANG', 'WENZHOU', 'LUCHENG', 'NONE', 'Ailsa', '12345678919', '1');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `GOODS_ID` bigint(20) NOT NULL,
  `PHONE` char(11) NOT NULL,
  `AMMOUNT` int(11) DEFAULT NULL,
  `JOIN_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`GOODS_ID`,`PHONE`),
  KEY `FK_Reference_13` (`PHONE`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`PHONE`) REFERENCES `users` (`PHONE`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`GOODS_ID`) REFERENCES `goods` (`GOODS_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('2', '12345678911', '700', '2021-06-28 00:00:00');
INSERT INTO `cart` VALUES ('3', '12345678910', '100', '2021-06-22 00:00:00');
INSERT INTO `cart` VALUES ('3', '12345678911', '800', '2021-06-29 00:00:00');
INSERT INTO `cart` VALUES ('4', '12345678911', '200', '2021-06-23 00:00:00');
INSERT INTO `cart` VALUES ('5', '12345678910', '500', '2021-06-26 00:00:00');
INSERT INTO `cart` VALUES ('5', '12345678912', '300', '2021-06-24 00:00:00');
INSERT INTO `cart` VALUES ('6', '12345678912', '900', '2021-06-30 00:00:00');
INSERT INTO `cart` VALUES ('6', '12345678913', '400', '2021-06-25 00:00:00');
INSERT INTO `cart` VALUES ('7', '12345678910', '600', '2021-06-27 00:00:00');
INSERT INTO `cart` VALUES ('10', '12345678913', '1000', '2021-07-01 00:00:00');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `GOODS_ID` bigint(20) NOT NULL,
  `GOODS_TITLE` varchar(255) DEFAULT NULL,
  `PRICE` float DEFAULT NULL,
  `DISCOUNT` float DEFAULT NULL,
  `SIZE` int(11) DEFAULT NULL,
  `ALCOHOL` float DEFAULT NULL,
  `RATING` float DEFAULT NULL,
  `DESCRIPTION` longtext,
  `AMMOUNT` int(11) DEFAULT NULL,
  `IMAGE_URL` longtext,
  `UP_DATE` datetime DEFAULT NULL,
  `DOWN_DATE` datetime DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`GOODS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', 'Lafite', '628', '0.9', '750', '12', '4', '拉菲(LAFITE)传奇波尔多 赤霞珠干红葡萄酒 750ml*6瓶 整箱装 法国进口红酒', '500', 'x', '2020-08-30 00:00:00', '2021-08-30 00:00:00', '2021-07-30 00:00:00');
INSERT INTO `goods` VALUES ('2', 'Suamgy', '868', '0.8', '750', '13', '5', '法国原瓶进口红酒 圣芝（Suamgy）波尔多梅多克中级庄博莱瓦AOC干红葡萄酒6支整箱装750ml*6', '600', 'x', '2020-08-31 00:00:00', '2021-08-31 00:00:00', '2021-07-31 00:00:00');
INSERT INTO `goods` VALUES ('3', 'Concha y Toro', '219', '0.5', '500', '14', '2', '干露（Concha y Toro）侯爵大都会赤霞珠干红葡萄酒 750ml 单瓶装 智利进口红酒', '1000', 'x', '2020-09-01 00:00:00', '2021-09-01 00:00:00', '2021-08-01 00:00:00');
INSERT INTO `goods` VALUES ('4', 'Changyu', '340', '1', '750', '11', '4', '张裕（CHANGYU）冰酒酒庄（黄金冰谷）冰酒 金钻19版500ml', '200', 'x', '2020-09-02 00:00:00', '2021-09-02 00:00:00', '2021-08-02 00:00:00');
INSERT INTO `goods` VALUES ('5', 'Khareba', '108', '0.7', '750', '15', '2', '格鲁吉亚原瓶进口红酒 哈列吧（Khareba）萨别拉维经典黑标干红红酒葡萄酒750ML*6支整箱 单支', '10', 'x', '2020-09-03 00:00:00', '2021-09-03 00:00:00', '2021-08-03 00:00:00');
INSERT INTO `goods` VALUES ('6', 'Simfour', '393', '0.6', '750', '16', '1', '【品牌荣誉金奖】法国进口红酒干红葡萄酒 星象（SIMFOUR）波尔多AOC级 星象传奇整箱礼盒750ml*6', '700', 'x', '2020-09-04 00:00:00', '2021-09-04 00:00:00', '2021-08-04 00:00:00');
INSERT INTO `goods` VALUES ('7', 'Jagadal', '268', '1', '750', '13', '3', '加达尔庄园JAGADAL曼宝拉干红葡萄酒14%vol红酒礼盒750ml*6整箱装', '2000', 'x', '2020-09-05 00:00:00', '2021-09-05 00:00:00', '2021-08-05 00:00:00');
INSERT INTO `goods` VALUES ('8', 'Changcheng', '158', '0.9', '750', '14', '5', '长城 特酿3年解百纳干红葡萄酒 750ml*6瓶 整箱装 中粮出品', '40', 'x', '2020-09-06 00:00:00', '2021-09-06 00:00:00', '2021-08-06 00:00:00');
INSERT INTO `goods` VALUES ('9', 'Carlico', '169', '1', '500', '12', '5', 'Carlico卡聂高法国原瓶原装进口红酒双支干红葡萄酒2瓶礼盒装送礼节日福利', '200', 'x', '2020-09-07 00:00:00', '2021-09-07 00:00:00', '2021-08-07 00:00:00');
INSERT INTO `goods` VALUES ('10', 'Mestia', '78', '1', '500', '11', '4', 'Mestia梅斯蒂亚斯大林干红葡萄酒整箱格鲁吉亚进口旧世界红酒萨别拉维单一葡萄酿制750ml*6支 单支', '3000', 'x', '2020-09-08 00:00:00', '2021-09-08 00:00:00', '2021-08-08 00:00:00');
INSERT INTO `goods` VALUES ('11', 'Barbanera', '986', '0.95', '750', '15', '5', 'BARBANERA普利亚风干帕赛托红葡萄酒 Appassimento 750ml单支礼盒 意大利进口', '100', 'x', '2020-09-09 00:00:00', '2021-09-09 00:00:00', '2021-08-09 00:00:00');
INSERT INTO `goods` VALUES ('12', 'Geothim', '352', '0.8', '750', '14', '4', '【波尔多AOC】归星（Geothim）法国原瓶进口红酒礼盒 葡萄酒整箱 波尔多AOC级归星城堡系列750ml*6瓶', '600', 'x', '2020-09-10 00:00:00', '2021-09-10 00:00:00', '2021-08-10 00:00:00');
INSERT INTO `goods` VALUES ('13', '菲特瓦', '534', '0.5', '500', '11', '5', '【连续6年吉尔伯特金奖得主全年保价限时秒杀】法国原瓶原装进口菲特瓦干红葡萄晚安热红酒木整箱送礼盒 朗格多克产区 庄园经典系列750ml*6', '1000', 'x', '2020-09-11 00:00:00', '2021-09-11 00:00:00', '2021-08-11 00:00:00');
INSERT INTO `goods` VALUES ('14', '八芒星', '567', '1', '750', '15', '2', '【购1箱得2箱】法国原瓶进口红酒 八芒星干红葡萄酒整箱礼盒装 共2箱12瓶', '200', 'x', '2020-09-12 00:00:00', '2021-09-12 00:00:00', '2021-08-12 00:00:00');
INSERT INTO `goods` VALUES ('15', '维克多', '235', '0.7', '750', '16', '4', '法国原瓶进口红酒整箱 罗莎庄园维克多干红葡萄酒6瓶整箱装750ml*6', '10', 'x', '2020-09-13 00:00:00', '2021-09-13 00:00:00', '2021-08-13 00:00:00');
INSERT INTO `goods` VALUES ('16', 'Penfolds', '466', '0.6', '750', '13', '2', '奔富（Penfolds） BIN8赤霞珠设拉子红葡萄酒750ml 澳大利亚进口红酒（新老包装随机发货）', '700', 'x', '2020-09-14 00:00:00', '2021-09-14 00:00:00', '2021-08-14 00:00:00');
INSERT INTO `goods` VALUES ('17', 'Torre Oria', '222', '1', '750', '14', '1', '奥兰Torre Oria小红帽干红葡萄酒750ml*6瓶 整箱装 西班牙进口红酒', '2000', 'x', '2020-09-15 00:00:00', '2021-09-15 00:00:00', '2021-08-15 00:00:00');
INSERT INTO `goods` VALUES ('18', '凯旋', '1234', '0.9', '750', '12', '3', '【购1箱得1套酒具】法国原瓶进口红酒凯旋干红葡萄酒礼盒750ml整箱6支装', '40', 'x', '2020-09-16 00:00:00', '2021-09-16 00:00:00', '2021-08-16 00:00:00');
INSERT INTO `goods` VALUES ('19', '图利斯', '235', '1', '500', '11', '5', '法国原酒进口红酒 图利斯酒庄干红葡萄酒整箱礼盒750ml*6', '200', 'x', '2020-09-17 00:00:00', '2021-09-17 00:00:00', '2021-08-17 00:00:00');
INSERT INTO `goods` VALUES ('20', '火烈鸟', '999', '1', '500', '15', '5', '【2020智利一级庄丨全年价保丨限时抢购】冰川集团智利原瓶原装进口红酒 佳沃醇美汇酒庄直供干红葡萄酒 火烈鸟赤霞珠 礼盒整箱750ml*6', '3000', 'x', '2020-09-18 00:00:00', '2021-09-18 00:00:00', '2021-08-18 00:00:00');

-- ----------------------------
-- Table structure for goods_category
-- ----------------------------
DROP TABLE IF EXISTS `goods_category`;
CREATE TABLE `goods_category` (
  `GOODS_ID` bigint(20) NOT NULL,
  `CATEGORY_NAME` varchar(32) NOT NULL,
  PRIMARY KEY (`GOODS_ID`,`CATEGORY_NAME`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`GOODS_ID`) REFERENCES `goods` (`GOODS_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_category
-- ----------------------------
INSERT INTO `goods_category` VALUES ('1', 'Lafite');
INSERT INTO `goods_category` VALUES ('1', '红葡萄');
INSERT INTO `goods_category` VALUES ('2', 'Suamgy');
INSERT INTO `goods_category` VALUES ('2', '白葡萄');
INSERT INTO `goods_category` VALUES ('3', 'Concha y Toro');
INSERT INTO `goods_category` VALUES ('3', '红葡萄');
INSERT INTO `goods_category` VALUES ('4', 'Changyu');
INSERT INTO `goods_category` VALUES ('4', '白葡萄');
INSERT INTO `goods_category` VALUES ('5', 'Khareba');
INSERT INTO `goods_category` VALUES ('5', '红葡萄');
INSERT INTO `goods_category` VALUES ('6', 'Simfour');
INSERT INTO `goods_category` VALUES ('6', '白葡萄');
INSERT INTO `goods_category` VALUES ('7', 'Jagadal');
INSERT INTO `goods_category` VALUES ('7', '白葡萄');
INSERT INTO `goods_category` VALUES ('8', 'Changcheng');
INSERT INTO `goods_category` VALUES ('8', '红葡萄');
INSERT INTO `goods_category` VALUES ('9', 'Carlico');
INSERT INTO `goods_category` VALUES ('9', '红普通');
INSERT INTO `goods_category` VALUES ('10', 'Mestia');
INSERT INTO `goods_category` VALUES ('10', '红葡萄');
INSERT INTO `goods_category` VALUES ('11', 'Barbanera');
INSERT INTO `goods_category` VALUES ('11', '白葡萄');
INSERT INTO `goods_category` VALUES ('12', 'Geothim');
INSERT INTO `goods_category` VALUES ('12', '白葡萄');
INSERT INTO `goods_category` VALUES ('13', '白葡萄');
INSERT INTO `goods_category` VALUES ('13', '菲特瓦');
INSERT INTO `goods_category` VALUES ('14', '八芒星');
INSERT INTO `goods_category` VALUES ('14', '红葡萄');
INSERT INTO `goods_category` VALUES ('15', '红普通');
INSERT INTO `goods_category` VALUES ('15', '维克多');
INSERT INTO `goods_category` VALUES ('16', 'Penfolds');
INSERT INTO `goods_category` VALUES ('16', '红葡萄');
INSERT INTO `goods_category` VALUES ('17', 'Torre Oria');
INSERT INTO `goods_category` VALUES ('17', '白葡萄');
INSERT INTO `goods_category` VALUES ('18', '凯旋');
INSERT INTO `goods_category` VALUES ('18', '白葡萄');
INSERT INTO `goods_category` VALUES ('19', '图利斯');
INSERT INTO `goods_category` VALUES ('19', '红葡萄');
INSERT INTO `goods_category` VALUES ('20', '火烈鸟');
INSERT INTO `goods_category` VALUES ('20', '白葡萄');

-- ----------------------------
-- Table structure for goods_order
-- ----------------------------
DROP TABLE IF EXISTS `goods_order`;
CREATE TABLE `goods_order` (
  `ORDER_ID` bigint(20) NOT NULL,
  `GOODS_ID` bigint(20) NOT NULL,
  `AMMOUNT` int(11) DEFAULT NULL,
  `JOIN_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`,`GOODS_ID`),
  KEY `FK_Reference_15` (`GOODS_ID`),
  CONSTRAINT `FK_Reference_15` FOREIGN KEY (`GOODS_ID`) REFERENCES `goods` (`GOODS_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_16` FOREIGN KEY (`ORDER_ID`) REFERENCES `orders` (`ORDER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_order
-- ----------------------------
INSERT INTO `goods_order` VALUES ('1', '6', '30', '2021-06-22 00:00:00');
INSERT INTO `goods_order` VALUES ('1', '7', '10', '2021-06-22 00:00:00');
INSERT INTO `goods_order` VALUES ('1', '8', '20', '2021-06-22 00:00:00');
INSERT INTO `goods_order` VALUES ('1', '9', '20', '2021-06-22 00:00:00');
INSERT INTO `goods_order` VALUES ('2', '8', '10', '2021-06-26 00:00:00');
INSERT INTO `goods_order` VALUES ('3', '2', '20', '2021-06-27 00:00:00');
INSERT INTO `goods_order` VALUES ('3', '3', '100', '2021-06-27 00:00:00');
INSERT INTO `goods_order` VALUES ('4', '1', '20', '2021-06-29 00:00:00');
INSERT INTO `goods_order` VALUES ('4', '5', '10', '2021-06-29 00:00:00');
INSERT INTO `goods_order` VALUES ('4', '6', '10', '2021-06-29 00:00:00');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `ORDER_ID` bigint(20) NOT NULL,
  `PHONE` char(11) NOT NULL,
  `ADDR_ID` bigint(20) DEFAULT NULL,
  `ORDER_DATE` datetime DEFAULT NULL,
  `STATUS` int(8) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`),
  KEY `FK_Reference_10` (`ADDR_ID`),
  KEY `FK_Reference_14` (`PHONE`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`ADDR_ID`) REFERENCES `address` (`ADDR_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_14` FOREIGN KEY (`PHONE`) REFERENCES `users` (`PHONE`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '12345678910', '1', '2021-06-22 00:00:00', '2');
INSERT INTO `orders` VALUES ('2', '12345678911', '2', '2021-06-23 00:00:00', '3');
INSERT INTO `orders` VALUES ('3', '12345678912', '3', '2021-06-24 00:00:00', '5');
INSERT INTO `orders` VALUES ('4', '12345678913', '4', '2021-06-25 00:00:00', '1');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `PHONE` char(11) NOT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PHONE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('12345678910', '123450');
INSERT INTO `users` VALUES ('12345678911', '123451');
INSERT INTO `users` VALUES ('12345678912', '123452');
INSERT INTO `users` VALUES ('12345678913', '123453');
INSERT INTO `users` VALUES ('12345678914', '123454');
INSERT INTO `users` VALUES ('12345678915', '123455');
INSERT INTO `users` VALUES ('12345678916', '123456');
INSERT INTO `users` VALUES ('12345678917', '123457');
INSERT INTO `users` VALUES ('12345678918', '123458');
INSERT INTO `users` VALUES ('12345678919', '123459');

-- ----------------------------
-- Table structure for user_profile
-- ----------------------------
DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE `user_profile` (
  `PHONE` char(11) NOT NULL,
  `NAME` varchar(20) DEFAULT NULL,
  `BRITHDAY` date DEFAULT NULL,
  `GENDER` char(1) DEFAULT NULL,
  `REG_DATE` date DEFAULT NULL,
  `LAST_LOGIN_DATE` datetime DEFAULT NULL,
  `HEAD_IMAGE` longtext,
  PRIMARY KEY (`PHONE`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`PHONE`) REFERENCES `users` (`PHONE`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_profile
-- ----------------------------
INSERT INTO `user_profile` VALUES ('12345678910', 'Mary', '1980-01-01', 'F', '2009-01-01', '2021-06-01 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678911', 'Adeline', '1980-01-03', 'F', '2009-01-02', '2021-05-01 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678912', 'Bob', '1980-01-04', 'M', '2009-01-03', '2021-05-21 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678913', 'John', '1980-01-05', 'M', '2009-01-04', '2021-05-13 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678914', 'Ada', '1980-01-06', 'F', '2009-01-05', '2021-06-21 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678915', 'Boost', '1980-01-07', 'M', '2009-01-06', '2021-06-16 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678916', 'Andy', '1980-01-08', 'M', '2009-01-07', '2021-06-17 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678917', 'Allan', '1980-01-09', 'M', '2009-01-08', '2021-06-18 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678918', 'Peter', '1980-01-10', 'M', '2009-01-09', '2021-06-19 23:59:00', 'X');
INSERT INTO `user_profile` VALUES ('12345678919', 'Ailsa', '1980-01-11', 'F', '2009-01-10', '2021-06-20 23:59:00', 'X');
