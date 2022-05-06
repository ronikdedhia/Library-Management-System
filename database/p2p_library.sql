-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2022 at 06:32 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `p2p_library`
--

-- --------------------------------------------------------

--
-- Table structure for table `lib_book_category`
--

CREATE TABLE `lib_book_category` (
  `book_category` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_book_category`
--

INSERT INTO `lib_book_category` (`book_category`) VALUES
('Database'),
('Programming'),
('Web');

-- --------------------------------------------------------

--
-- Table structure for table `lib_book_master`
--

CREATE TABLE `lib_book_master` (
  `book_id` int(10) UNSIGNED NOT NULL,
  `book_title` varchar(100) NOT NULL,
  `book_author` varchar(100) NOT NULL,
  `book_publisher` varchar(100) NOT NULL,
  `book_publish_year` varchar(45) NOT NULL,
  `book_category` varchar(100) NOT NULL,
  `book_keyword` varchar(250) NOT NULL,
  `book_status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_book_master`
--

INSERT INTO `lib_book_master` (`book_id`, `book_title`, `book_author`, `book_publisher`, `book_publish_year`, `book_category`, `book_keyword`, `book_status`) VALUES
(1, 'Mastering VB6', 'Mr. J. K', 'MSN', '1999', 'Programming', 'VB6, Programming', 'Available'),
(2, 'Oracle Handbook', 'Mr. Oracle', 'Oracle Press', '2010', 'Database', 'Oracle, Database', 'Issued'),
(4, 'JAVA 123', 'Atanu', 'P2P', '2000', 'Programming', 'Java', 'Issued'),
(5, 'Easy HTML', 'Mr. Jarry', 'P2P', '2009', 'Web', 'HTML, Web', 'Available'),
(6, 'JAVA handbook', 'Sun', 'Sun', '2010', 'Programming', 'Java, Programming', 'Issued'),
(7, 'MS Office Easy', 'Microsoft', 'MSN', '2010', 'Programming', 'MS Office', 'Available'),
(8, 'C', 'Balagrurswamy', 'TATA', '1970', 'Programming', 'VB6, Programming', 'Available'),
(9, 'C++', 'Balagrurswamy', 'TATA', '1999', 'Programming', 'cpp, Programming,c++', 'Issued'),
(10, 'Data Structure', 'Rema Theraja', 'Jaico', '1999', 'Programming', 'DSA, Data, algorithm', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `lib_member_master`
--

CREATE TABLE `lib_member_master` (
  `mem_id` int(11) NOT NULL,
  `mem_name` varchar(100) NOT NULL,
  `mem_address` varchar(250) NOT NULL,
  `mem_email_id` varchar(100) NOT NULL,
  `mem_mobile_no` varchar(20) NOT NULL,
  `mem_registered_date` date NOT NULL,
  `mem_active` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_member_master`
--

INSERT INTO `lib_member_master` (`mem_id`, `mem_name`, `mem_address`, `mem_email_id`, `mem_mobile_no`, `mem_registered_date`, `mem_active`) VALUES
(1, 'Tom', 'Mumai', 'tom123@gmail.com', '996774212', '2021-08-08', 'Y'),
(2, 'Harry ', 'Mumbai, India', 'harry@gmail.com', '9999999999', '0000-00-00', 'Y'),
(3, 'Ryan', 'New Delhi', 'ryan@gmail.com', '9999632333', '0000-00-00', 'Y'),
(4, 'John', 'Mumai', 'john@gmail.com', '996787212', '2021-08-08', 'Y'),
(5, 'Robert', 'Mumai', 'Robert@gmail.com', '996774312', '2021-08-08', 'Y'),
(6, 'William', 'Mumai', 'William@gmail.com', '996774212', '2021-08-08', 'Y'),
(7, 'David', 'Mumbai', 'david@gmail.com', '996774212', '2021-08-08', 'Y'),
(8, 'Jennifer', 'Mumbai', 'jennifer@gmail.com', '996774212', '2012-08-08', 'Y'),
(9, 'Emille', 'Mumai', 'emille@gmail.com', '9954374212', '2021-08-08', 'Y'),
(10, 'Andrew', 'Mumbai', 'Andrew@gmail.com', '998774212', '2021-08-04', 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `lib_transaction`
--

CREATE TABLE `lib_transaction` (
  `trn_id` int(10) UNSIGNED NOT NULL,
  `trn_mem_id` int(10) UNSIGNED NOT NULL,
  `trn_book_id` int(10) UNSIGNED NOT NULL,
  `trn_issue_dt` datetime NOT NULL,
  `trn_receive_dt` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_transaction`
--

INSERT INTO `lib_transaction` (`trn_id`, `trn_mem_id`, `trn_book_id`, `trn_issue_dt`, `trn_receive_dt`) VALUES
(1, 1, 1, '2021-01-01 00:00:00', '2021-01-01 00:00:00'),
(2, 1, 2, '2021-09-08 23:42:11', '2021-09-09 10:22:58'),
(3, 2, 1, '2021-09-08 23:43:03', '2021-09-09 10:23:07'),
(4, 1, 1, '2021-09-09 10:23:21', '2022-05-06 09:40:03'),
(5, 3, 6, '2021-09-09 11:35:26', '2021-09-09 11:36:20'),
(6, 2, 7, '2021-09-09 11:58:23', '2021-09-09 11:59:06'),
(7, 3, 4, '2021-12-30 15:49:28', NULL),
(8, 2, 2, '2022-01-27 15:54:03', NULL),
(9, 4, 6, '2022-01-28 11:11:51', NULL),
(10, 1, 8, '2022-05-06 09:44:32', '2022-05-06 09:44:51');

-- --------------------------------------------------------

--
-- Table structure for table `lib_user`
--

CREATE TABLE `lib_user` (
  `user_name` varchar(45) NOT NULL,
  `user_password` varchar(45) NOT NULL,
  `user_type` varchar(45) NOT NULL,
  `user_active` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_user`
--

INSERT INTO `lib_user` (`user_name`, `user_password`, `user_type`, `user_active`) VALUES
('Admin', 'ak', 'Admin', 'YES'),
('Akshit', 'akshitc', 'User', 'YES'),
('Ronik', 'ronik', 'User', 'YES'),
('Sakshi', 'sakshi', 'User', 'YES');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lib_book_category`
--
ALTER TABLE `lib_book_category`
  ADD PRIMARY KEY (`book_category`);

--
-- Indexes for table `lib_book_master`
--
ALTER TABLE `lib_book_master`
  ADD PRIMARY KEY (`book_id`),
  ADD UNIQUE KEY `book_title` (`book_title`);

--
-- Indexes for table `lib_member_master`
--
ALTER TABLE `lib_member_master`
  ADD PRIMARY KEY (`mem_id`);

--
-- Indexes for table `lib_transaction`
--
ALTER TABLE `lib_transaction`
  ADD PRIMARY KEY (`trn_id`);

--
-- Indexes for table `lib_user`
--
ALTER TABLE `lib_user`
  ADD PRIMARY KEY (`user_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lib_book_master`
--
ALTER TABLE `lib_book_master`
  MODIFY `book_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `lib_member_master`
--
ALTER TABLE `lib_member_master`
  MODIFY `mem_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `lib_transaction`
--
ALTER TABLE `lib_transaction`
  MODIFY `trn_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
