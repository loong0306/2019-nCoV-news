/*
 Source Server         : rds-prod
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Schema         : 2019_ncov

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 29/01/2020 21:00:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for district
-- ----------------------------
DROP TABLE IF EXISTS `district`;
CREATE TABLE `district` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT '主键自增',
  `pid` int(11) DEFAULT NULL COMMENT '父类id',
  `district_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '城市的名字',
  `type` int(11) DEFAULT NULL COMMENT '城市的类型，0是国，1是省，2是市，3是区',
  `hierarchy` int(11) DEFAULT NULL COMMENT '地区所处的层级',
  `district_sqe` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '层级序列',
  PRIMARY KEY (`id`),
  KEY `index_type` (`type`) USING BTREE COMMENT '省市区索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='省市区';

-- ----------------------------
-- Table structure for ncov_news_keywords
-- ----------------------------
DROP TABLE IF EXISTS `ncov_news_keywords`;
CREATE TABLE `ncov_news_keywords` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `keywords` varchar(64) DEFAULT NULL COMMENT '关键字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='2019-ncov-关键词';

-- ----------------------------
-- Table structure for ncov_weibo_news
-- ----------------------------
DROP TABLE IF EXISTS `ncov_weibo_news`;
CREATE TABLE `ncov_weibo_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `city_key` varchar(16) DEFAULT NULL COMMENT '城市关键字',
  `source_id` varchar(64) DEFAULT NULL COMMENT '微博ID',
  `url` text COMMENT '微博URL',
  `content` text COMMENT '微博内容',
  `send_time` varchar(32) DEFAULT NULL COMMENT '微博时间',
  `from_id` varchar(64) DEFAULT NULL COMMENT '微博主ID',
  `from_name` varchar(64) DEFAULT NULL COMMENT '微博昵称',
  `ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_source_id` (`source_id`) COMMENT '微博源ID唯一索引',
  KEY `index_city_key` (`city_key`) COMMENT '城市索引'
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='2019-ncov-微博新闻';

SET FOREIGN_KEY_CHECKS = 1;
