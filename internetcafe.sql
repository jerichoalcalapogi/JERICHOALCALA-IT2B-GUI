-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2025 at 04:52 PM
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
-- Table structure for table `tbl_forgotpassword`
--

CREATE TABLE `tbl_forgotpassword` (
  `fp_id` int(20) NOT NULL,
  `c_id` int(20) NOT NULL,
  `fp_question` varchar(100) NOT NULL,
  `fp_answer` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_forgotpassword`
--

INSERT INTO `tbl_forgotpassword` (`fp_id`, `c_id`, `fp_question`, `fp_answer`) VALUES
(1, 140, 'What was your mother\'s maiden name?', '/ZAnB2wLwXi8dqJu4ndMwcY4ASJVOX6kA2IhSLscw74='),
(4, 143, 'What city were you born in?', '8fTAdauUny/Z6EdZhi3IiXxOVM8JP1ea+5j7zNgF0NE='),
(5, 144, 'What was your mother\'s maiden name?', 'l2J4zJ29EjRvWVSzXkLrr0psNqs8AhyR3CbxH1fXMOk=');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_log`
--

CREATE TABLE `tbl_log` (
  `log_id` int(20) NOT NULL,
  `c_id` int(25) NOT NULL,
  `log_event` varchar(255) NOT NULL,
  `log_description` varchar(255) NOT NULL,
  `log_timestamp` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_log`
--

INSERT INTO `tbl_log` (`log_id`, `c_id`, `log_event`, `log_description`, `log_timestamp`) VALUES
(880, 140, 'LOGOUT', 'Logged out successfully', '2025-04-28 21:00:05'),
(881, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 21:00:12'),
(882, 104, 'User Edited', 'Edited account ID 126', '2025-04-28 21:00:25'),
(883, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 21:00:34'),
(884, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:01:11'),
(885, 129, 'LOGOUT', 'Logged out successfully', '2025-04-28 21:01:20'),
(886, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 21:01:31'),
(887, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 21:01:46'),
(888, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:01:50'),
(889, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:02:30'),
(890, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:13:14'),
(891, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:15:09'),
(892, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:16:04'),
(893, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:22:21'),
(894, 129, 'LOGOUT', 'Logged out successfully', '2025-04-28 21:22:34'),
(895, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:27:16'),
(896, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:29:05'),
(897, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:32:55'),
(898, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:34:30'),
(899, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:35:56'),
(900, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 21:36:28'),
(901, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 21:37:47'),
(902, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 21:39:27'),
(903, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 21:40:15'),
(904, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 21:40:55'),
(905, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:41:01'),
(906, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:41:46'),
(907, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:43:33'),
(908, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 21:43:57'),
(909, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 21:44:26'),
(910, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:44:30'),
(911, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:44:57'),
(912, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:55:49'),
(913, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:56:53'),
(914, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 21:58:40'),
(915, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:04:26'),
(916, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:11:25'),
(917, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:12:47'),
(918, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:13:33'),
(919, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:14:56'),
(920, 129, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:15:06'),
(921, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:15:09'),
(922, 129, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:15:21'),
(923, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 22:15:25'),
(924, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:15:38'),
(925, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:15:42'),
(926, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:17:09'),
(927, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:20:12'),
(928, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:21:32'),
(929, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:23:24'),
(930, 129, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:23:40'),
(931, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:23:44'),
(932, 129, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:24:01'),
(933, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:24:04'),
(934, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:36:37'),
(935, 143, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:38:00'),
(936, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:38:17'),
(937, 129, 'LOGIN', 'Logged in successfully', '2025-04-28 22:41:13'),
(938, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:41:59'),
(939, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:42:31'),
(940, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 22:43:19'),
(941, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:43:31'),
(942, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:43:37'),
(943, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:45:23'),
(944, 143, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:45:31'),
(945, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 22:45:35'),
(946, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:45:58'),
(947, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:46:02'),
(948, 143, 'LOGIN', 'Logged in successfully', '2025-04-28 22:47:39'),
(949, 143, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:49:18'),
(950, 144, 'LOGIN', 'Logged in successfully', '2025-04-28 22:50:33'),
(951, 144, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:50:47'),
(952, 104, 'LOGIN', 'Logged in successfully', '2025-04-28 22:50:51'),
(953, 104, 'LOGOUT', 'Logged out successfully', '2025-04-28 22:51:00'),
(954, 144, 'LOGIN', 'Logged in successfully', '2025-04-28 22:51:02');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_member`
--

CREATE TABLE `tbl_member` (
  `mem_id` int(20) NOT NULL,
  `balance` decimal(10,2) NOT NULL,
  `c_status` varchar(255) NOT NULL,
  `c_date` datetime NOT NULL DEFAULT current_timestamp(),
  `c_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_member`
--

INSERT INTO `tbl_member` (`mem_id`, `balance`, `c_status`, `c_date`, `c_id`) VALUES
(66, 400.00, 'Approve', '2025-04-28 20:41:29', 140),
(67, 100.00, 'Approve', '2025-04-28 20:44:55', 140),
(68, 100.00, 'Approve', '2025-04-28 20:45:01', 140),
(69, 200.00, 'Approve', '2025-04-28 20:50:10', 140),
(70, 40.00, 'Approve', '2025-04-28 21:01:18', 129),
(71, 500.00, 'Approve', '2025-04-28 21:43:38', 129),
(72, 500.00, 'Approve', '2025-04-28 22:15:12', 129),
(73, 500.00, 'Approve', '2025-04-28 22:15:18', 129),
(74, 500.00, 'Approve', '2025-04-28 22:42:46', 143),
(75, 200.00, 'Approve', '2025-04-28 22:43:00', 143),
(76, 500.00, 'Approve', '2025-04-28 22:45:27', 143),
(77, 500.00, 'Approve', '2025-04-28 22:50:45', 144);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_membership`
--

CREATE TABLE `tbl_membership` (
  `m_id` int(20) NOT NULL,
  `m_type` varchar(100) NOT NULL,
  `price_per_hour` varchar(100) NOT NULL,
  `m_status` varchar(100) NOT NULL,
  `m_image` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_membership`
--

INSERT INTO `tbl_membership` (`m_id`, `m_type`, `price_per_hour`, `m_status`, `m_image`) VALUES
(2, 'VIP1', '20', 'ACTIVE', NULL),
(11, 'VIP2', '30', 'ACTIVE', NULL),
(13, 'VIP3', '50', 'ACTIVE', NULL),
(14, 'SILVER', '15', 'ACTIVE', NULL),
(15, 'GOLD', '25', 'SUSPENDED', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaction`
--

CREATE TABLE `tbl_transaction` (
  `t_id` int(20) NOT NULL,
  `c_id` int(20) NOT NULL,
  `m_id` int(20) NOT NULL,
  `duration` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `t_status` varchar(50) NOT NULL,
  `amount_to_be_paid` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`t_id`, `c_id`, `m_id`, `duration`, `date`, `t_status`, `amount_to_be_paid`) VALUES
(58, 140, 2, '3', '04-28-2025', 'Success', 60.00),
(59, 140, 2, '5', '04-28-2025', 'Success', 100.00),
(60, 140, 2, '1', '04-28-2025', 'Success', 20.00),
(61, 129, 11, '1', '04-28-2025', 'Success', 30.00),
(62, 129, 2, '3', '04-28-2025', 'Success', 60.00),
(75, 129, 2, '4', '04-28-2025', 'Success', 80.00),
(76, 129, 13, '3', '04-28-2025', 'Success', 150.00),
(77, 129, 2, '3', '04-28-2025', 'Success', 60.00),
(78, 144, 13, '3', '04-28-2025', 'Success', 150.00);

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
  `password` varchar(150) NOT NULL,
  `contactnum` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  `u_image` varchar(500) DEFAULT NULL,
  `u_balance` decimal(15,2) NOT NULL DEFAULT 0.00
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`c_id`, `fname`, `lname`, `email`, `username`, `password`, `contactnum`, `type`, `status`, `u_image`, `u_balance`) VALUES
(104, 'Maylord', 'Rico', 'maylordrico321@gmail.com', 'eloynes', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09077955120', 'Admin', 'Active', '', 0.00),
(126, 'Felanie', 'Alcala', 'felanie123@gmail.com', 'felanie', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0912381232', 'Member', 'Active', 'src/userimage/icons8-left-100.png', 0.00),
(129, 'Koshes', 'Alcala', 'koshes@gmail.com', 'koshesgwapo', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09182327015', 'Member', 'Active', 'src/userimage/icons8-log-in-64.png', 450.00),
(140, 'dqeqwe', 'qewqwe', 'dadada@gmail.com', 'gfagaga', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '13212321323', 'Member', 'Active', 'src/userimage/14.jpeg', 220.00),
(143, 'Jinny', 'Cano', 'jinny123@gmail.com', 'jinny', '2sA1Y62GguKqloHjdZyAeyK/RGIMrZtOzOl1JJ4LIvI=', '0923287312', 'Member', 'Active', 'src/userimage/icons8-users-90.png', 700.00),
(144, 'frans', 'ababa', 'fransfrans@gmail.com', 'franss', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '08968968', 'Member', 'Active', NULL, 350.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_forgotpassword`
--
ALTER TABLE `tbl_forgotpassword`
  ADD PRIMARY KEY (`fp_id`),
  ADD KEY `c_id` (`c_id`);

--
-- Indexes for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `c_id` (`c_id`);

--
-- Indexes for table `tbl_member`
--
ALTER TABLE `tbl_member`
  ADD PRIMARY KEY (`mem_id`),
  ADD KEY `c_id` (`c_id`);

--
-- Indexes for table `tbl_membership`
--
ALTER TABLE `tbl_membership`
  ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD PRIMARY KEY (`t_id`),
  ADD KEY `uid` (`c_id`),
  ADD KEY `mid` (`m_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`c_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_forgotpassword`
--
ALTER TABLE `tbl_forgotpassword`
  MODIFY `fp_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=955;

--
-- AUTO_INCREMENT for table `tbl_member`
--
ALTER TABLE `tbl_member`
  MODIFY `mem_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;

--
-- AUTO_INCREMENT for table `tbl_membership`
--
ALTER TABLE `tbl_membership`
  MODIFY `m_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `t_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=145;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_forgotpassword`
--
ALTER TABLE `tbl_forgotpassword`
  ADD CONSTRAINT `tbl_forgotpassword_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `tbl_user` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD CONSTRAINT `tbl_log_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `tbl_user` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_member`
--
ALTER TABLE `tbl_member`
  ADD CONSTRAINT `tbl_member_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `tbl_user` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD CONSTRAINT `mid` FOREIGN KEY (`m_id`) REFERENCES `tbl_membership` (`m_id`),
  ADD CONSTRAINT `uid` FOREIGN KEY (`c_id`) REFERENCES `tbl_user` (`c_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
