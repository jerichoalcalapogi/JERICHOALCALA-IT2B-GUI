-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2025 at 05:13 PM
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
(7, 146, 'What was your mother\'s maiden name?', 'u1J7HtF451Ttz52fbsZpttnwqegTPJf9A8521poF1vM='),
(10, 149, 'What was your mother\'s maiden name?', 'nGp4FAGxk2AdhGz1nYK3ZhxeGA7RmqzJ0xThksq9wHM='),
(11, 150, 'What was your mother\'s maiden name?', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8='),
(12, 151, 'What was your mother\'s maiden name?', 'KCX08jhpCEfC0jASJf7E5zPZxMerIN6suTwxB+EnegY='),
(13, 152, 'What was your mother\'s maiden name?', 'y3sI1vId08uGPo1UV/DIa6obkwev2AA++4zFRAEmlF0='),
(14, 153, 'What was your mother\'s maiden name?', 'VaOT1dlKlSuD/xOZ+BlRKyw2GEFB5ckAgMh2DnVS2+o='),
(15, 154, 'What city were you born in?', 'W1UuFA/iqEqgzDtCIqQtXyORugBmhpfE/qCywV2y25I='),
(16, 155, 'What was your mother\'s maiden name?', 'SC+JG/TmnV5BAWpJ/Jm4XZEhSEd3tf5twuvY/lXSlmE='),
(17, 156, 'What city were you born in?', '8fTAdauUny/Z6EdZhi3IiXxOVM8JP1ea+5j7zNgF0NE='),
(18, 157, 'What was the name of your first school?\"', 'BOd7+Plcs+GjalnR6ThXxBGTDbZGtGwhigNS5DICPPI=');

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
(1483, 152, 'LOGIN', 'Logged in successfully', '2025-05-05 16:22:58'),
(1484, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:26:07'),
(1485, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:26:30'),
(1486, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:29:51'),
(1487, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:31:00'),
(1488, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:31:34'),
(1489, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:32:13'),
(1490, 155, 'LOGIN', 'Logged in successfully', '2025-05-05 16:32:42'),
(1491, 155, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:32:55'),
(1492, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:32:58'),
(1493, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:33:50'),
(1494, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:37:27'),
(1495, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:37:54'),
(1496, 152, 'LOGIN', 'Logged in successfully', '2025-05-05 16:37:57'),
(1497, 152, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:38:04'),
(1498, 155, 'LOGIN', 'Logged in successfully', '2025-05-05 16:38:18'),
(1499, 155, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:38:26'),
(1500, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:38:29'),
(1501, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:38:44'),
(1502, 155, 'LOGIN', 'Logged in successfully', '2025-05-05 16:38:48'),
(1503, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:41:01'),
(1504, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:42:04'),
(1505, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:44:49'),
(1506, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:45:52'),
(1507, 152, 'LOGIN', 'Logged in successfully', '2025-05-05 16:46:25'),
(1508, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:48:15'),
(1509, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:49:17'),
(1510, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:49:34'),
(1511, 152, 'LOGIN', 'Logged in successfully', '2025-05-05 16:49:36'),
(1512, 152, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:49:58'),
(1513, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:50:02'),
(1514, 152, 'LOGIN', 'Logged in successfully', '2025-05-05 16:51:52'),
(1515, 152, 'LOGOUT', 'Logged out successfully', '2025-05-05 16:52:32'),
(1516, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 16:52:36'),
(1517, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:18:53'),
(1518, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 18:20:55'),
(1519, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 18:23:20'),
(1520, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 18:28:53'),
(1521, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 18:34:15'),
(1522, 154, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:35:23'),
(1523, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 18:35:26'),
(1524, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 18:36:20'),
(1525, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:37:38'),
(1526, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:38:44'),
(1527, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:39:14'),
(1528, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:41:59'),
(1529, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:44:05'),
(1530, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:44:47'),
(1531, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:45:12'),
(1532, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:46:47'),
(1533, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:48:02'),
(1534, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:48:56'),
(1535, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:51:20'),
(1536, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:53:06'),
(1537, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:53:20'),
(1538, 156, 'LOGIN', 'Logged in successfully', '2025-05-05 18:53:24'),
(1539, 156, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:53:41'),
(1540, 156, 'LOGIN', 'Logged in successfully', '2025-05-05 18:53:45'),
(1541, 156, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:53:51'),
(1542, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:53:57'),
(1543, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:54:36'),
(1544, 156, 'LOGIN', 'Logged in successfully', '2025-05-05 18:54:39'),
(1545, 156, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:54:52'),
(1546, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:54:56'),
(1547, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:55:09'),
(1548, 156, 'LOGIN', 'Logged in successfully', '2025-05-05 18:55:13'),
(1549, 156, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:55:58'),
(1550, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 18:56:02'),
(1551, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:56:45'),
(1552, 156, 'LOGIN', 'Logged in successfully', '2025-05-05 18:56:49'),
(1553, 156, 'LOGIN', 'Logged in successfully', '2025-05-05 18:57:34'),
(1554, 156, 'LOGOUT', 'Logged out successfully', '2025-05-05 18:58:04'),
(1555, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 20:34:45'),
(1556, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 22:59:02'),
(1557, 154, 'LOGOUT', 'Logged out successfully', '2025-05-05 22:59:18'),
(1558, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 22:59:23'),
(1559, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:00:27'),
(1560, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:01:13'),
(1561, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 23:04:06'),
(1562, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 23:04:27'),
(1563, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:05:46'),
(1564, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:07:01'),
(1565, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:07:04'),
(1566, 154, 'LOGIN', 'Logged in successfully', '2025-05-05 23:07:07'),
(1567, 154, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:07:27'),
(1568, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:07:41'),
(1569, 104, 'User Added', 'Added account ID 157', '2025-05-05 23:08:41'),
(1570, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:08:52'),
(1571, 157, 'LOGIN', 'Logged in successfully', '2025-05-05 23:08:58'),
(1572, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:09:59'),
(1573, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:10:22'),
(1574, 157, 'LOGIN', 'Logged in successfully', '2025-05-05 23:10:25'),
(1575, 157, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:10:38'),
(1576, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:10:42'),
(1577, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:10:57'),
(1578, 157, 'LOGIN', 'Logged in successfully', '2025-05-05 23:10:59'),
(1579, 157, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:11:52'),
(1580, 104, 'LOGIN', 'Logged in successfully', '2025-05-05 23:11:55'),
(1581, 104, 'LOGOUT', 'Logged out successfully', '2025-05-05 23:12:12'),
(1582, 157, 'LOGIN', 'Logged in successfully', '2025-05-05 23:12:15');

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
(70, 40.00, 'Approve', '2025-04-28 21:01:18', 129),
(71, 500.00, 'Approve', '2025-04-28 21:43:38', 129),
(72, 500.00, 'Approve', '2025-04-28 22:15:12', 129),
(73, 500.00, 'Approve', '2025-04-28 22:15:18', 129),
(80, 5000.00, 'Approve', '2025-05-04 19:25:04', 146),
(83, 4000.00, 'Approve', '2025-05-05 12:02:27', 153),
(84, 4000.00, 'Approve', '2025-05-05 15:07:25', 154),
(85, 800.00, 'Approve', '2025-05-05 18:54:47', 156),
(86, 100.00, 'Approve', '2025-05-05 23:09:38', 157),
(87, 3000.00, 'Approve', '2025-05-05 23:10:36', 157);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_membership`
--

CREATE TABLE `tbl_membership` (
  `m_id` int(20) NOT NULL,
  `m_type` varchar(100) NOT NULL,
  `price_per_month` varchar(100) NOT NULL,
  `m_status` varchar(100) NOT NULL,
  `m_image` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_membership`
--

INSERT INTO `tbl_membership` (`m_id`, `m_type`, `price_per_month`, `m_status`, `m_image`) VALUES
(2, 'VIP1', '700', 'ACTIVE', NULL),
(11, 'VIP2', '800', 'ACTIVE', NULL),
(13, 'VIP3', '1000', 'ACTIVE', NULL),
(14, 'SILVER', '200', 'ACTIVE', NULL),
(15, 'GOLD', '300', 'SUSPENDED', NULL);

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
  `amount_to_be_paid` decimal(10,2) NOT NULL,
  `membership_type` varchar(100) NOT NULL,
  `start_datetime` text DEFAULT NULL,
  `end_datetime` text DEFAULT NULL,
  `activation_status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`t_id`, `c_id`, `m_id`, `duration`, `date`, `t_status`, `amount_to_be_paid`, `membership_type`, `start_datetime`, `end_datetime`, `activation_status`) VALUES
(93, 149, 2, '1', '05-04-2025', 'Success', 700.00, 'VIP1', '2025-05-05 11:19:16', '2025-06-04 11:19:16', 'Activated'),
(94, 150, 2, '1', '05-05-2025', 'Success', 700.00, 'VIP1', '2025-05-05 11:13:41', '2025-06-04 11:13:41', 'Activated'),
(95, 151, 11, '1', '05-05-2025', 'Success', 800.00, 'VIP2', '2025-05-05 11:04:13', '2025-06-04 11:04:13', 'Activated'),
(96, 152, 14, '3', '05-05-2025', 'Success', 600.00, 'SILVER', '2025-05-05 11:19:39', '2025-08-03 11:19:39', 'Activated'),
(97, 153, 2, '3', '05-05-2025', 'Success', 2100.00, 'VIP1', '2025-05-05 12:03:43', '2025-08-03 12:03:43', 'Activated'),
(98, 154, 13, '1', '05-05-2025', 'Success', 1000.00, 'VIP3', '2025-05-05 15:11:50', '2025-06-04 15:11:50', 'Activated'),
(99, 155, 11, '2', '05-05-2025', 'Success', 1600.00, 'VIP2', '2025-05-05 16:38:35', '2025-07-04 16:38:35', 'Activated'),
(100, 156, 2, '1', '05-05-2025', 'Success', 700.00, 'VIP1', '2025-05-05 18:56:22', '2025-06-04 18:56:22', 'Activated'),
(101, 157, 13, '1', '05-05-2025', 'Success', 1000.00, 'VIP3', '2025-05-05 23:12:04', '2025-06-04 23:12:04', 'Activated');

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
(126, 'Felanie', 'Alcala', 'felanie123@gmail.com', 'felanie', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0912381232', 'Member', 'Active', 'src/userimage/icons8-left-100.png', 100.00),
(129, 'Koshes', 'Alcala', 'koshes@gmail.com', 'koshesgwapo', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09182327015', 'Member', 'Active', 'src/userimage/icons8-log-in-64.png', 250.00),
(146, 'Jonash', 'Racaza', 'jonash@gmail.com', 'ziur', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '092382323', 'Member', 'Active', 'null', 4300.00),
(149, 'whatt', 'aweae', 'whatt@gmail.com', 'whattt', 'ZWpGyEtRJW5wsHfE8VliKSpKZ9lPINDS8cKYueN21ZI=', '091232323', 'Member', 'Active', NULL, 1300.00),
(150, 'dadad', 'adadada', 'dada@gmail.com', 'dada', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '312123123', 'Member', 'Active', NULL, 200.00),
(151, 'eqeqeqeq', 'eqeqe', 'qeqeqe@gmail.com', 'qeqeqeqe', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '3213123123', 'Member', 'Active', NULL, 100.00),
(152, 'aaa', 'adad', 'adada@gmail.com', 'dadaaa', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '0890898', 'Member', 'Active', NULL, 300.00),
(153, 'delta', 'force', 'delta@gmail.com', 'deltaa', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09123123', 'Member', 'Active', 'null', 1900.00),
(154, 'Francisco', 'Absalon', 'francisco@gmail.com', 'france', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09773229807', 'Member', 'Active', '', 3000.00),
(155, 'dadada', 'adadad', 'dad@gmail.com', 'adadadsda', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '059578463', 'Member', 'Active', NULL, 900.00),
(156, 'Tralalelo', 'Tralala', 'tralalelo@gmail.com', 'tralelotropalang', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0912382323', 'Member', 'Active', '', 1000.00),
(157, 'Jhonmark', 'Alcala', 'jhonmark@gmail.com', 'mark', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '09123128323', 'Member', 'Active', 'src/userimage/image.png', 2100.00);

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
  ADD PRIMARY KEY (`m_id`),
  ADD UNIQUE KEY `m_type` (`m_type`);

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
  MODIFY `fp_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1583;

--
-- AUTO_INCREMENT for table `tbl_member`
--
ALTER TABLE `tbl_member`
  MODIFY `mem_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;

--
-- AUTO_INCREMENT for table `tbl_membership`
--
ALTER TABLE `tbl_membership`
  MODIFY `m_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `t_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=158;

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
