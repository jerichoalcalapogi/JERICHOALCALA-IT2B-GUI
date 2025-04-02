-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2025 at 08:49 AM
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
-- Table structure for table `tbl_forgotpass`
--

CREATE TABLE `tbl_forgotpass` (
  `fp_id` int(20) NOT NULL,
  `c_id` int(20) NOT NULL,
  `fp_question` varchar(255) NOT NULL,
  `fp_answer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_forgotpass`
--

INSERT INTO `tbl_forgotpass` (`fp_id`, `c_id`, `fp_question`, `fp_answer`) VALUES
(1, 102, 'What was your mother\'s maiden name?', 'XgcEEXO4IRNd5inWVoCLhCC9ln5VzX605TXzr9qnve0='),
(2, 103, 'What was your mother\'s maiden name?', '8fs6nbAtzNJJmQOS+T8ML55RMLyyH59QOgvILye9jbw='),
(3, 104, 'What city were you born in?', 'RlkxwXrz5rzxwIVemQT92UgeWa10DQTXyP2ygDs1YUc='),
(4, 105, 'What is your favorite book?', 'c80bFsT7gwYa0YoLKblkOmjUZAB1pGbcnlFoL4SoR/U='),
(5, 106, 'What was your mother\'s maiden name?', 'VA5K9pR49yCa8IHpJqEXh8MF0ihy4PEC/YnccBP0FDY='),
(6, 107, 'What was your mother\'s maiden name?', 'VA5K9pR49yCa8IHpJqEXh8MF0ihy4PEC/YnccBP0FDY=');

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
(144, 105, 'LOGIN', 'Logged in successfully', '2025-03-30 18:57:53'),
(145, 105, 'LOGIN', 'Logged in successfully', '2025-03-30 18:59:41'),
(146, 105, 'LOGIN', 'Logged in successfully', '2025-03-30 19:00:55'),
(147, 105, 'LOGOUT', 'Logged out successfully', '2025-03-30 19:01:11'),
(148, 105, 'LOGIN', 'Logged in successfully', '2025-03-30 19:01:39'),
(149, 105, 'LOGOUT', 'Logged out successfully', '2025-03-30 19:01:42'),
(150, 105, 'LOGIN', 'Logged in successfully', '2025-03-30 19:02:44'),
(151, 105, 'LOGOUT', 'Logged out successfully', '2025-03-30 19:02:46'),
(152, 106, 'LOGIN', 'Logged in successfully', '2025-03-30 19:06:42'),
(153, 106, 'LOGOUT', 'Logged out successfully', '2025-03-30 19:07:07'),
(154, 105, 'LOGIN', 'Logged in successfully', '2025-03-30 19:08:04'),
(155, 105, 'LOGOUT', 'Logged out successfully', '2025-03-30 19:08:05'),
(156, 106, 'LOGIN', 'Logged in successfully', '2025-04-02 13:59:25'),
(169, 106, 'LOGIN', 'Logged in successfully', '2025-04-02 14:36:14'),
(170, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:37:51'),
(171, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:38:21'),
(172, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:38:46'),
(173, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:38:50'),
(174, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:40:05'),
(175, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:40:07'),
(176, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:41:21'),
(177, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:41:27'),
(178, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:41:48'),
(179, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:41:49'),
(180, 104, 'LOGIN', 'Logged in successfully', '2025-04-02 14:43:07'),
(181, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:44:51'),
(182, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:45:14'),
(183, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:45:28'),
(184, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:45:30'),
(185, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:47:31'),
(186, 107, 'LOGOUT', 'Logged out successfully', '2025-04-02 14:48:12'),
(187, 107, 'LOGIN', 'Logged in successfully', '2025-04-02 14:48:21');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_member`
--

CREATE TABLE `tbl_member` (
  `m_id` int(20) NOT NULL,
  `m_fname` varchar(255) NOT NULL,
  `m_lname` varchar(255) NOT NULL,
  `m_email` varchar(255) NOT NULL,
  `m_contact` varchar(255) DEFAULT NULL,
  `m_status` varchar(255) DEFAULT NULL,
  `m_username` varchar(50) NOT NULL,
  `m_type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`c_id`, `fname`, `lname`, `email`, `username`, `password`, `contactnum`, `type`, `status`) VALUES
(28, 'Aaron', 'Ruiz', 'aaronruizz@yahoo.com', 'aaron', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '09182327015', 'Admin', 'Active'),
(46, 'jerics', 'alcala', 'jericho@gmail.com', 'ahh', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '123123123', 'Member', 'Active'),
(47, 'felanie', 'alcala', 'felaniee@gmail.com', 'feaa', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09211818', 'Admin', 'Active'),
(51, 'eko', 'gwapo', 'ekogwapoo@gmail.com', 'ekooo', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '123123123', 'Admin', 'Active'),
(92, 'james', 'andrew', 'james@gmail.com', 'james', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09123123', 'Member', 'Active'),
(93, 'francisco', 'alcala', 'frans@gmail.com', 'franssss', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0912321323', 'Member', 'Pending'),
(94, 'mama', 'amam', 'amam@gmail.com', 'mamama', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '312312321', 'Member', 'Pending'),
(95, 'eqwe', 'qwewewe', 'edada@gmail.com', 'weqeqwe', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '312313', 'Member', 'Pending'),
(96, 'dada', 'dada', 'dadada@gmail.com', 'dadadwwd', '7zA1/Au3PlFNzr7y9i0h0WfHl5uqvH4KVYxIBoP3C4Y=', '093123123', 'Member', 'Active'),
(97, 'jinny', 'canoy', 'jinny@gmail.com', 'jinnycute', 'aw2R9MJOhFx2BBIXaPaTW68/kNo/WXDYmXZZUSmVp/I=', '0918232607', 'Member', 'Active'),
(102, 'waawa', 'aaa', 'wadew@gmail.com', 'dadadada', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '3123123123', 'Member', 'Active'),
(103, 'felanies', 'alcalass', 'feada@gmail.com', 'pelanie', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '312312323', 'Member', 'Active'),
(104, 'Maylord', 'Rico', 'maylordrico321@gmail.com', 'eloynes', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09077955120', 'Admin', 'Active'),
(105, 'francisco', 'alcala', 'francisco@gmail.com', 'frans', '0sqoLNtaCjP0K4Egg8SkxRlYBfW+IFjNnorsmrZYm7o=', '09773229807', 'Member', 'Active'),
(106, 'jericho', 'alcala', 'dadaa@gmail.com', 'jerichoo', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '32131231232', 'Member', 'Active'),
(107, 'Lanie', 'Alcala', 'mader@gmail.com', 'maderrr', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '3131231232', 'Member', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_forgotpass`
--
ALTER TABLE `tbl_forgotpass`
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
  ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`c_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_forgotpass`
--
ALTER TABLE `tbl_forgotpass`
  MODIFY `fp_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=188;

--
-- AUTO_INCREMENT for table `tbl_member`
--
ALTER TABLE `tbl_member`
  MODIFY `m_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=108;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_forgotpass`
--
ALTER TABLE `tbl_forgotpass`
  ADD CONSTRAINT `tbl_forgotpass_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `tbl_user` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD CONSTRAINT `tbl_log_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `tbl_user` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
