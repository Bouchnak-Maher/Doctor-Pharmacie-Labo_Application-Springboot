-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: spring
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `radiographie`
--

DROP TABLE IF EXISTS `radiographie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `radiographie` (
  `id_radiographie` bigint NOT NULL AUTO_INCREMENT,
  `date_radiographie` date DEFAULT NULL,
  `patient` varchar(255) DEFAULT NULL,
  `resultat` varchar(255) DEFAULT NULL,
  `type_radiographie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_radiographie`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `radiographie`
--

LOCK TABLES `radiographie` WRITE;
/*!40000 ALTER TABLE `radiographie` DISABLE KEYS */;
INSERT INTO `radiographie` VALUES (1,'2023-04-28','wadhah','encours.jpg','radiographie du rachis cervical'),(2,'2023-04-29','maher','test.jpg','Radiographie generale'),(13,'2023-04-29','wadhah','encours.jpg','testRadiographie generale'),(14,'2023-04-15','wadhah','test.jpg','radiographie du rachis cervical'),(15,'2023-03-23','mohamed','test.jpg','Radiologie ostéoarticulaire'),(16,'2023-03-23','adem','test.jpg','Radiologie Arthographie'),(17,'2023-03-23','adel','test.jpg','Radiologie Gynécologique'),(18,'2023-04-04','wadhah','encours.jpg','radiographie du thorax'),(19,'2023-04-05','weal','encours.jpg','radiographie du thorax'),(20,'2023-04-06','aymen','test.jpg','radiographie du rachis cervical'),(21,'2023-04-07','aziz','test.jpg','radiographie du rachis dorsal'),(22,'2023-04-08','amine','test.jpg','radiographie de l\'abdomen ASP'),(23,'2023-04-08','malek','test.jpg','radiographie de l\'abdomen ASP'),(24,'2023-04-10','yassine','test.jpg','Radiographie generale'),(25,'2023-05-10','wadhah','encours.jpg','test'),(26,'2023-06-03','wadhah','encours.jpg','test'),(27,'2023-06-16','ok','encours.jpg','test');
/*!40000 ALTER TABLE `radiographie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-08 13:51:35
