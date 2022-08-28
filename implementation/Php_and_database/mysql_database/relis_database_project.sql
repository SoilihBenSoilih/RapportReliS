-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 03, 2020 at 03:41 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `relis_database_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `classification`
--

DROP TABLE IF EXISTS `classification`;
CREATE TABLE IF NOT EXISTS `classification` (
  `id_class` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(250) DEFAULT NULL,
  `project` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_class`),
  KEY `classification_ibfk_1` (`project`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `classification`
--

INSERT INTO `classification` (`id_class`, `question`, `project`) VALUES
(1, 'Does the paper talk about Xtext grammar\r\n', 1),
(2, 'null', 2),
(3, 'null', 3),
(4, 'Does the paper report modelling approaches for building CPS', 4),
(5, 'Does paper report a model/metamodel', 4),
(6, 'Does the paper report a tool/language', 4),
(7, 'Does the paper report the model of the adopted process', 4),
(8, 'Does the paper report a multi-paradigm modelling approach', 4),
(9, 'Is the approach domain specific', 4),
(10, 'Does the paper report the actors/stakeholders involved in modelling of the CPS', 4),
(11, 'Does the paper report the modellers background knowledge?', 4),
(12, 'What is the relevance of the paper according to the conference/journal where it was published?', 4),
(13, 'What is the relevance of the citation according to its related citations?', 4),
(14, 'How clearly is the problem of study described?\r\n', 4),
(15, 'How clearly is the research context stated?\r\n', 4),
(28, 'How rigorously is the method evaluated?\r\n', 4),
(29, 'How explicitly are the contributions presented?\r\n', 4),
(30, 'How explicitly are the insights and issues for future work stated?\r\n', 4),
(31, 'SA1 Reviewers confidence about content of the study\r\n', 4),
(32, 'SA2 Reviewers confidence about quality of the study\r\n', 4);

-- --------------------------------------------------------

--
-- Table structure for table `conflicts`
--

DROP TABLE IF EXISTS `conflicts`;
CREATE TABLE IF NOT EXISTS `conflicts` (
  `id_conflict` int(11) NOT NULL AUTO_INCREMENT,
  `conflict_decision` varchar(250) DEFAULT NULL,
  `conflict_number` int(11) DEFAULT NULL,
  `phase` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_conflict`),
  KEY `conflicts_ibfk_1` (`phase`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `conflicts`
--

INSERT INTO `conflicts` (`id_conflict`, `conflict_decision`, `conflict_number`, `phase`) VALUES
(1, 'Resolved included', 0, 1),
(2, 'Resolved excluded', 0, 1),
(3, 'Pending conflicts', 0, 1),
(4, 'Resolved included', 0, 2),
(5, 'Resolved excluded', 0, 2),
(6, 'Pending conflicts', 0, 2),
(7, 'Resolved included', 29, 3),
(8, 'Resolved excluded', 126, 3),
(9, 'Pending conflicts', 0, 3),
(10, 'Resolved included', 27, 4),
(11, 'Resolved excluded', 35, 4),
(12, 'Pending conflicts', 0, 4),
(13, 'Resolved included', 0, 5),
(14, 'Resolved excluded', 0, 5),
(15, 'Pending conflicts', 0, 5);

-- --------------------------------------------------------

--
-- Table structure for table `criterias`
--

DROP TABLE IF EXISTS `criterias`;
CREATE TABLE IF NOT EXISTS `criterias` (
  `id_criteria` int(11) NOT NULL AUTO_INCREMENT,
  `nameCriteria` varchar(250) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `percentage` varchar(250) DEFAULT NULL,
  `phase` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_criteria`),
  KEY `criterias_ibfk_1` (`phase`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `criterias`
--

INSERT INTO `criterias` (`id_criteria`, `nameCriteria`, `number`, `percentage`, `phase`) VALUES
(1, 'Dont talk about Xtext Grammar', 1, '100.0', 1),
(2, 'null', 0, '0.0', 2),
(3, 'Off topic', 618, '85.83', 3),
(4, 'It does not use modelling', 24, '3.33', 3),
(5, 'It does not use mobile development', 78, '10.83', 3),
(6, 'Papers that did not apply to research questions', 124, '64.58', 4),
(7, 'Informal literature and secondary_tertiary studies', 35, '18.23', 4),
(8, 'Purely hardware or electrical engineering perspective papers', 3, '1.56', 4),
(9, 'Outside of the SLR date range', 12, '6.25', 4),
(10, 'Secondary study', 14, '7.29', 4),
(11, 'Papers written in other than English language', 4, '2.08', 4),
(12, 'null', 0, '0.0', 5);

-- --------------------------------------------------------

--
-- Table structure for table `decisions`
--

DROP TABLE IF EXISTS `decisions`;
CREATE TABLE IF NOT EXISTS `decisions` (
  `id_decisions` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(250) DEFAULT NULL,
  `included` int(11) DEFAULT NULL,
  `excluded` int(11) DEFAULT NULL,
  `inConflict` int(11) DEFAULT NULL,
  `phase` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_decisions`),
  KEY `decisions_ibfk_1` (`phase`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `decisions`
--

INSERT INTO `decisions` (`id_decisions`, `user`, `included`, `excluded`, `inConflict`, `phase`) VALUES
(1, 'Soilihi BEN SOILIHI', 4, 1, 0, 1),
(2, 'Erick Raelijohn', 45, 0, 0, 2),
(3, 'Lea Brunschwig', 55, 240, 0, 3),
(4, 'esther guerra', 55, 240, 0, 3),
(5, 'Juan de Lara', 55, 240, 0, 3),
(6, 'Raheleh', 21, 25, 0, 4),
(7, 'Ivan Ruchkin', 21, 27, 0, 4),
(8, 'Vasco', 21, 25, 0, 4),
(9, 'Miguel Goulao', 19, 28, 0, 4),
(10, 'Antonio Cicchetti', 25, 21, 0, 4),
(11, 'Bedir Tekinerdogan', 28, 19, 0, 4),
(12, 'Ferhat Erata', 24, 24, 0, 4),
(13, 'Dominique Blouin', 25, 23, 0, 4),
(14, 'Soilihi BEN SOILIHI', 4, 0, 0, 5);

-- --------------------------------------------------------

--
-- Table structure for table `participants`
--

DROP TABLE IF EXISTS `participants`;
CREATE TABLE IF NOT EXISTS `participants` (
  `id_participant` int(11) NOT NULL AUTO_INCREMENT,
  `name_participant` varchar(250) DEFAULT NULL,
  `role` varchar(250) DEFAULT NULL,
  `project` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_participant`),
  KEY `participants_ibfk_1` (`project`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `participants`
--

INSERT INTO `participants` (`id_participant`, `name_participant`, `role`, `project`) VALUES
(1, 'Soilihi', 'Project admin', 1),
(2, 'Lea', 'Project admin', 3),
(3, 'Juan', 'Project admin', 3),
(4, 'Esther', 'Project admin', 3),
(5, 'Erick Raelijohn', 'Project admin', 2),
(6, 'Ankica Barisic', 'Project admin', 4),
(7, 'Vasco', 'Reviewer', 4),
(8, 'Dusan', 'Validator', 4),
(9, 'Paulo Carreira', 'Reviewer', 4),
(10, 'Eugene Test', 'Project admin', 4),
(11, 'Dominique Blouin', 'Reviewer', 4),
(12, 'Ivan Ruchkin', 'Reviewer', 4),
(13, 'Antonio Cicchetti', 'Reviewer', 4),
(14, 'Ferhat Erata', 'Reviewer', 4),
(15, 'Bedir Tekinerdogan', 'Reviewer', 4),
(16, 'Miguel Goulao', 'Reviewer', 4),
(17, 'Moharram Challenger', 'Reviewer', 4),
(18, 'Mustafa Xoodiye', 'Reviewer', 4),
(19, 'Raheleh', 'Reviewer', 4),
(20, 'Claudio Gomes', 'Reviewer', 4),
(21, 'Oksana Nikiforova', 'Reviewer', 4),
(22, 'Rima', 'Reviewer', 4),
(23, 'Antonio Cicchetti', 'Reviewer', 4),
(24, 'Letitia', 'Reviewer', 4),
(25, 'Hana', 'Reviewer', 4);

-- --------------------------------------------------------

--
-- Table structure for table `phases`
--

DROP TABLE IF EXISTS `phases`;
CREATE TABLE IF NOT EXISTS `phases` (
  `id_phase` int(11) NOT NULL AUTO_INCREMENT,
  `name_phase` varchar(250) DEFAULT NULL,
  `project` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_phase`),
  KEY `phases_ibfk_1` (`project`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phases`
--

INSERT INTO `phases` (`id_phase`, `name_phase`, `project`) VALUES
(1, 'Screen title and abstract', 1),
(2, 'phase1', 2),
(3, 'phase1', 3),
(4, 'Screening of abstract and title', 4),
(5, 'Screen the rest', 1);

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
CREATE TABLE IF NOT EXISTS `project` (
  `id_project` int(11) NOT NULL AUTO_INCREMENT,
  `name_project` varchar(250) DEFAULT NULL,
  `users` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_project`),
  KEY `users` (`users`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`id_project`, `name_project`, `users`) VALUES
(1, 'Xtext Gammar', 12),
(2, 'classification rsq', 13),
(3, 'Mobile and model driven engineering ', 14),
(4, 'Multi paradigm modeling paradigm for CPS', 17);

-- --------------------------------------------------------

--
-- Table structure for table `responses`
--

DROP TABLE IF EXISTS `responses`;
CREATE TABLE IF NOT EXISTS `responses` (
  `id_responses` int(11) NOT NULL AUTO_INCREMENT,
  `name_response` varchar(250) DEFAULT NULL,
  `response_stat` int(11) NOT NULL,
  `classification` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_responses`),
  KEY `responses_ibfk_1` (`classification`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `responses`
--

INSERT INTO `responses` (`id_responses`, `name_response`, `response_stat`, `classification`) VALUES
(1, 'talk about Xtext', 4, 1),
(2, 'null', 0, 2),
(3, 'null', 0, 3),
(4, 'YES', 265, 4),
(5, 'YES', 230, 5),
(6, 'NO', 35, 5),
(7, 'YES', 209, 6),
(8, 'NO', 56, 6),
(9, 'YES', 118, 7),
(10, 'NO', 147, 7),
(11, 'YES', 122, 8),
(12, 'NO', 143, 8),
(13, 'YES', 100, 9),
(14, 'NO', 165, 9),
(15, 'YES', 49, 10),
(16, 'NO', 216, 10),
(17, 'YES', 14, 11),
(18, 'NO', 251, 11),
(19, 'Very relevant (A or higher)', 59, 12),
(20, 'Relevant (B)', 83, 12),
(21, 'Not so relevant', 123, 12),
(22, 'High (bigger than five)', 166, 13),
(23, 'Medium (between zero and five)', 77, 13),
(24, 'Low (equal to zero)', 22, 13),
(25, 'Explicitly', 186, 14),
(26, 'Vaguely', 79, 14),
(27, 'With references', 151, 15),
(28, 'Generally', 106, 15),
(29, 'Vaguely', 8, 15),
(30, 'Empirical foundation', 30, 28),
(31, 'Case study', 177, 28),
(32, 'Lessons Learned', 17, 28),
(33, 'No evaluation', 41, 28),
(34, 'Explicitly', 133, 29),
(35, 'Generally', 122, 29),
(36, 'No presentation', 10, 29),
(37, 'With recommendations', 63, 30),
(38, 'Generally', 151, 30),
(39, 'No statement', 51, 30),
(40, 'Very confident', 87, 31),
(41, 'Confident', 178, 31),
(42, 'Very confident', 72, 32),
(43, 'Confident', 193, 32);

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

DROP TABLE IF EXISTS `results`;
CREATE TABLE IF NOT EXISTS `results` (
  `id_result` int(11) NOT NULL AUTO_INCREMENT,
  `result_decision` varchar(250) DEFAULT NULL,
  `result_papers` int(11) DEFAULT NULL,
  `result_percentage` varchar(250) DEFAULT NULL,
  `phase` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_result`),
  KEY `results_ibfk_1` (`phase`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`id_result`, `result_decision`, `result_papers`, `result_percentage`, `phase`) VALUES
(1, 'Included', 4, '80.0', 1),
(2, 'Excluded', 1, '20.0', 1),
(3, 'In conflict', 0, '0.0', 1),
(4, 'In review', 0, '0.0', 1),
(5, 'Pending', 0, '0.0', 1),
(6, 'Total', 5, NULL, 1),
(7, 'Included', 45, '100.0', 2),
(8, 'Excluded', 0, '0.0', 2),
(9, 'In conflict', 0, '0.0', 2),
(10, 'In review', 0, '0.0', 2),
(11, 'Pending', 0, '0.0', 2),
(12, 'Total', 45, NULL, 2),
(13, 'Included', 55, '18.64', 3),
(14, 'Excluded', 240, '81.36', 3),
(15, 'In conflict', 0, '0.0', 3),
(16, 'In review', 0, '0.0', 3),
(17, 'Pending', 0, '0.0', 3),
(18, 'Total', 295, NULL, 3),
(19, 'Included', 92, '48.94', 4),
(20, 'Excluded', 96, '51.06', 4),
(21, 'In conflict', 0, '0.0', 4),
(22, 'In review', 0, '0.0', 4),
(23, 'Pending', 0, '0.0', 4),
(24, 'Total', 188, NULL, 4),
(25, 'Included', 4, '100.0', 5),
(26, 'Excluded', 0, '0.0', 5),
(27, 'In conflict', 0, '0.0', 5),
(28, 'In review', 0, '0.0', 5),
(29, 'Pending', 0, '0.0', 5),
(30, 'Total', 4, NULL, 5);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id_users` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(250) DEFAULT NULL,
  `project` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_users`),
  KEY `decisions_ibfk_2` (`project`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_users`, `username`, `project`) VALUES
(12, 'soilihi', 1),
(13, 'erick', 2),
(14, 'lea', 3),
(15, 'juan', 3),
(16, 'esther', 3),
(17, 'ankica ', 4),
(18, 'ankica', 4),
(19, 'vasco', 4),
(20, 'dusan', 4),
(21, 'paulo', 4),
(22, 'eugene', 4),
(23, 'dominique', 4),
(24, 'ivan', 4),
(25, 'ferhat', 4),
(26, 'antonio', 4),
(27, 'bedir', 4),
(28, 'miguel', 4),
(29, 'moharram', 4),
(30, 'mustafa', 4),
(31, 'raheleh', 4),
(32, 'claudio', 4),
(33, 'oksana', 4),
(34, 'rima', 4),
(35, 'hana', 4),
(36, 'letitia', 4);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `classification`
--
ALTER TABLE `classification`
  ADD CONSTRAINT `classification_ibfk_1` FOREIGN KEY (`project`) REFERENCES `project` (`id_project`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `conflicts`
--
ALTER TABLE `conflicts`
  ADD CONSTRAINT `conflicts_ibfk_1` FOREIGN KEY (`phase`) REFERENCES `phases` (`id_phase`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `criterias`
--
ALTER TABLE `criterias`
  ADD CONSTRAINT `criterias_ibfk_1` FOREIGN KEY (`phase`) REFERENCES `phases` (`id_phase`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `decisions`
--
ALTER TABLE `decisions`
  ADD CONSTRAINT `decisions_ibfk_1` FOREIGN KEY (`phase`) REFERENCES `phases` (`id_phase`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `participants`
--
ALTER TABLE `participants`
  ADD CONSTRAINT `participants_ibfk_1` FOREIGN KEY (`project`) REFERENCES `project` (`id_project`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `phases`
--
ALTER TABLE `phases`
  ADD CONSTRAINT `phases_ibfk_1` FOREIGN KEY (`project`) REFERENCES `project` (`id_project`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `project_ibfk_1` FOREIGN KEY (`users`) REFERENCES `users` (`id_users`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `responses`
--
ALTER TABLE `responses`
  ADD CONSTRAINT `responses_ibfk_1` FOREIGN KEY (`classification`) REFERENCES `classification` (`id_class`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `results`
--
ALTER TABLE `results`
  ADD CONSTRAINT `results_ibfk_1` FOREIGN KEY (`phase`) REFERENCES `phases` (`id_phase`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `decisions_ibfk_2` FOREIGN KEY (`project`) REFERENCES `project` (`id_project`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
