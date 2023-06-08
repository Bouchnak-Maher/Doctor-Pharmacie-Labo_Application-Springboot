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
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescription` (
  `id_prescription` bigint NOT NULL AUTO_INCREMENT,
  `date_of_prescription` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `medication_list` varchar(255) DEFAULT NULL,
  `nom_patient` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_prescription`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES (30,'2023-04-11','douleurs au niveau de tête ','Doliprane\nSuppositoire à 200 mg\n1 Boîte 10 suppositoires','maher','Sold'),(31,'2023-04-11','douleurs au niveau de tête ','Doliprane\nSuppositoire à 200 mg\n1 Boîte 10 suppositoires','maher','Sold'),(32,'2023-04-11','douleurs au niveau de tête ','Doliprane\nComprimé effervescent à 500 mg\n1 Boîte 16 comprimés','wadhah','Sold'),(33,'2023-04-13','Des courbatures','aspegic\r\nPoudre pour solution buvable à 500 mg \r\n1 Boîte 20 sachets','adem','Sold'),(34,'2023-04-12','Des courbatures','aspegic\r\nPoudre pour solution buvable à 500 mg \r\n1 Boîte 20 sachets','malek','Sold'),(35,'2023-03-16','mal au tête ','Gripex\nPoudre pour solution buvable à 1000 mg \n1 Boîte 20 sachets','amine','Sold'),(36,'2020-10-11','douleur de tete pour les enfants','doliprane','mohamed','Sold'),(38,'2023-03-21','Prescription d\'Analyse d\'urine','Monuril 1 sachet/jour\nAprès le déjeuner. ','mustpha','Sold'),(41,'2023-06-17','test','test','maher','Sold'),(42,'2023-06-17','test','test','maher','Sold'),(43,'2023-06-17','test','test','maher','Sold'),(44,'2023-06-30','test','test','wadhah','Sold'),(45,'2023-06-23','test','test','wadhah','Sold');
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-08 13:51:34
