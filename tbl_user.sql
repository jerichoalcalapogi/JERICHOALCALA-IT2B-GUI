-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 24, 2025 at 03:58 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `intercafe`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `c_id` int(20) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `contactnum` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`c_id`, `fname`, `lname`, `email`, `username`, `password`, `contactnum`, `type`, `status`) VALUES
(28, 'Aaron', 'Ruiz', 'aaronruiz@yahoo.com', 'aaronruiz', '123123123', '09182327015', 'Admin', 'Active'),
(29, 'eqeq', 'eqe', 'adqd@gmail.com', 'qeqwe', '123123123', '321312312', 'Member', 'Pending'),
(30, 'ekosh', 'gwapo', 'ekoshgwapo@gmail.com', 'ekoshh', '123123123', '123123', 'Member', 'Pending'),
(31, 'ekosh', 'alcala', 'alcala@gmail.com', 'ekosh', '321321321', '123123123', 'Admin', 'Active'),
(32, 'felanie', 'alcala', 'felanicealcala@gmail.com', 'felanie', '123123123', '09182327015', 'Member', 'Active'),
(33, 'lanie', 'alcala', 'jerichoalcala@gmail.com', 'hahah', '123123123', '31231231', 'Member', 'Pending'),
(34, 'jinny', 'cano', 'jinnycano@gmail.com', 'jinny', '123123123', '091823232', 'Member', 'Pending'),
(35, 'ekooo', 'baii', 'dada@gmail.com', 'dad', '321321321', '0931314141', 'Member', 'Pending'),
(36, 'manifst', 'pls', 'manifest@gmail.com', 'qeqeq', '123123123', '09182327014', 'Member', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`c_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
