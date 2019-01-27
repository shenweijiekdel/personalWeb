-- MySQL dump 10.13  Distrib 8.0.13, for Linux (x86_64)
--
-- Host: localhost    Database: personWeb
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_travel_log`
--

DROP TABLE IF EXISTS `t_travel_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_travel_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(64) NOT NULL,
  `time` timestamp NOT NULL,
  `remark` varchar(255) NOT NULL,
  `is_gone` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `province` (`province`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_travel_log`
--

LOCK TABLES `t_travel_log` WRITE;
/*!40000 ALTER TABLE `t_travel_log` DISABLE KEYS */;
INSERT INTO `t_travel_log` VALUES (1,'内蒙古自治区','2019-01-17 02:00:00','12',_binary ''),(2,'吉林省','2018-11-13 02:00:00','去找同学玩',_binary '\0'),(3,'辽宁省','2018-12-25 02:00:00','又去找同学',_binary '\0'),(4,'河北省','2018-12-17 02:00:00','找女朋友',_binary '\0'),(5,'山西省','2019-01-06 02:00:00','吃',_binary '\0'),(6,'青海省','2019-01-07 02:00:00','fd',_binary '\0'),(7,'陕西省','2019-01-01 02:00:00','dsafdsa',_binary '\0'),(8,'黑龙江省','2018-12-31 02:00:00','fadsfa',_binary '\0'),(9,'江苏省','2019-01-08 02:00:00','fdas',_binary '\0'),(10,'新疆维吾尔自治区','2019-01-17 02:00:00','fdasgdg',_binary '\0'),(11,'河南省','2019-01-15 02:00:00','fdasg',_binary '\0'),(12,'甘肃省','2019-01-11 02:00:00','fggg',_binary '\0'),(13,'山东省','2019-01-07 02:00:00','发生',_binary '\0'),(14,'四川省','2019-01-09 02:00:00','马上去',_binary '\0'),(15,'湖南省','2019-01-09 02:00:00','fdsa ',_binary '\0'),(16,'西藏自治区','2019-01-23 02:00:00','fda',_binary '\0'),(17,'江西省','2019-01-16 02:00:00','bfdas',_binary '\0'),(18,'湖北省','2019-01-24 02:00:00','fdsa',_binary '\0'),(19,'安徽省','2019-01-08 02:00:00','fda',_binary '\0'),(20,'宁夏回族自治区','2019-01-15 02:00:00','fdsa',_binary '\0'),(21,'浙江省','2019-01-15 02:00:00','fdsa',_binary '\0'),(22,'云南省','2019-01-15 02:00:00','fdsa',_binary '\0'),(23,'广西壮族自治区','2019-01-01 02:00:00','fda',_binary '\0'),(24,'天津市','2019-01-01 02:00:00','ggg',_binary '\0'),(25,'贵州省','2018-12-31 02:00:00','fdas',_binary '\0'),(26,'福建省','2018-12-31 02:00:00','fa',_binary '\0'),(27,'广东省','2019-01-16 02:00:00','fdsag',_binary '\0');
/*!40000 ALTER TABLE `t_travel_log` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-28  2:29:33
