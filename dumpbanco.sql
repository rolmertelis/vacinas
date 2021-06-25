CREATE DATABASE  IF NOT EXISTS `vacinarRolmer` /*!40100 DEFAULT CHARACTER SET big5 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `vacinarRolmer`;
-- MySQL dump 10.13  Distrib 5.7.33, for Linux (x86_64)
--
-- Host: localhost    Database: vacinarRolmer
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `aplicacao`
--

DROP TABLE IF EXISTS `aplicacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aplicacao` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `usuario_id` int NOT NULL,
  `dataaplicacao` varchar(45) NOT NULL,
  `obs` varchar(45) DEFAULT NULL,
  `vacina_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_aplicacao_usuario_idx` (`usuario_id`),
  KEY `fk_aplicacao_1_idx` (`vacina_id`),
  CONSTRAINT `fk_aplicacao_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
  CONSTRAINT `fk_aplicacao_vacina` FOREIGN KEY (`vacina_id`) REFERENCES `vacina` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aplicacao`
--

LOCK TABLES `aplicacao` WRITE;
/*!40000 ALTER TABLE `aplicacao` DISABLE KEYS */;
INSERT INTO `aplicacao` VALUES (1,1,'25/05/1964','Uma obs',1),(2,1,'25/05/1965','Outra obs',2),(3,7,'01/05/2011','teste de inc com status created',2),(4,7,'01/05/2011','teste de inc com status created',2),(5,9,'01/05/2011','teste de inc para usuario 9',1);
/*!40000 ALTER TABLE `aplicacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '	',
  `nome` varchar(45) NOT NULL COMMENT '		',
  `email` varchar(45) NOT NULL,
  `nascimento` varchar(10) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'joao','joao@gmail.com','18','12345678910'),(2,'jose','jose@gmail.com','25','12345678911'),(3,'maria','maria@gmail.com','30','12345678912'),(4,'Juca','juca@gmail.com','40','12345678913'),(5,'Madalena','madalena@gmail.com','25/05/1974','322211122'),(7,'Marialva','marialva@gmail.com','25/05/1984','322211123'),(8,'Januario','januario@gmail.com','25/05/1994','322211144'),(9,'Luis','luis@gmail.com','25/05/1993','322211155'),(13,'Luis','abigobaldo@gmail.com','25/05/1993','7777789652'),(14,'Outro usuario','outrousuario@gmail.com','25/05/1993','11111111115'),(15,'scorpion renew','scorpion@gmail.com','25/05/1993','11111111118'),(19,'jacobino','jacobino@gmail.com','25/05/1993','11111111117'),(20,'juliete mexida','juliete@gmail.com','25/05/1984','11111111114'),(22,'Jamelina','Jamelina@gmail.com','25/05/1984','11111111121'),(24,'siberia','siberia@gmail.com','25/05/1993','11111111129'),(25,'Thalyta Lima','thalytalima@gmail.com','25/05/1993','11111111131');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacina`
--

DROP TABLE IF EXISTS `vacina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vacina` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `sigla` varchar(45) NOT NULL,
  `periodicidade` int NOT NULL,
  `doses` int NOT NULL,
  `diasentredoses` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome_UNIQUE` (`nome`),
  UNIQUE KEY `sigla_UNIQUE` (`sigla`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacina`
--

LOCK TABLES `vacina` WRITE;
/*!40000 ALTER TABLE `vacina` DISABLE KEYS */;
INSERT INTO `vacina` VALUES (1,'Febre Amarela','FBA',60,2,30),(2,'Tetano','TTN',36,1,0),(3,'Amarelona','AMR',60,2,15);
/*!40000 ALTER TABLE `vacina` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-25 18:28:58
