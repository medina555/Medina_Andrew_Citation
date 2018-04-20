CREATE DATABASE  IF NOT EXISTS `citation` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `citation`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: citation
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `citations`
--

DROP TABLE IF EXISTS `citations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `citations` (
  `ticketnumber` int(11) NOT NULL,
  `CarMake` varchar(45) NOT NULL,
  `CarModel` varchar(45) NOT NULL,
  `CarYear` varchar(45) NOT NULL,
  `PermitNum` varchar(45) NOT NULL,
  `LicenseNum` varchar(45) NOT NULL,
  `State` varchar(45) NOT NULL,
  `Color` varchar(45) NOT NULL,
  `ViolationType` varchar(45) NOT NULL,
  `TDate` varchar(45) NOT NULL,
  `TTime` varchar(45) NOT NULL,
  `Issuer` varchar(45) NOT NULL,
  `Location` varchar(45) NOT NULL,
  `TStatus` varchar(45) NOT NULL,
  PRIMARY KEY (`ticketnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citations`
--

LOCK TABLES `citations` WRITE;
/*!40000 ALTER TABLE `citations` DISABLE KEYS */;
INSERT INTO `citations` VALUES (1,'Ford','F-150','2009','99333000','T7T0099','Texas','Green','Fire Lane','2/2/2018','2:55 PM','Juan Martinez','MAIN','Citation is Unpaid'),(2,'Dodge','Charger','2008','88775544','JJJ88555','Texas','Black','Double Parked','4/4/2018','2:55PM','Juan Martinez','SETB','Citation is Unpaid');
/*!40000 ALTER TABLE `citations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-20  4:54:54
