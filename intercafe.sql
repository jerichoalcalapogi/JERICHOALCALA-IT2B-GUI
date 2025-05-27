-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2025 at 03:07 PM
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
(18, 157, 'What was the name of your first school?\"', 'BOd7+Plcs+GjalnR6ThXxBGTDbZGtGwhigNS5DICPPI='),
(19, 158, 'What was your mother\'s maiden name?', 'VA5K9pR49yCa8IHpJqEXh8MF0ihy4PEC/YnccBP0FDY='),
(20, 159, 'What was your mother\'s maiden name?', 'lsrjXOipsCRBeL8o5JZsLOG4OFcjqWprg4hYzdbKCh4='),
(21, 160, 'What was your mother\'s maiden name?', 'KCX08jhpCEfC0jASJf7E5zPZxMerIN6suTwxB+EnegY='),
(22, 161, 'What was your mother\'s maiden name?', 'VA5K9pR49yCa8IHpJqEXh8MF0ihy4PEC/YnccBP0FDY='),
(23, 162, 'What was your mother\'s maiden name?', 'nY19y49tTXH/yCd+SopDJsk9ojnKzjddR8SjWDCz6Is=');

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
(1582, 157, 'LOGIN', 'Logged in successfully', '2025-05-05 23:12:15'),
(1583, 154, 'LOGIN', 'Logged in successfully', '2025-05-07 21:59:35'),
(1584, 154, 'LOGOUT', 'Logged out successfully', '2025-05-07 21:59:44'),
(1585, 104, 'LOGIN', 'Logged in successfully', '2025-05-07 21:59:47'),
(1586, 104, 'LOGIN', 'Logged in successfully', '2025-05-17 11:32:51'),
(1587, 157, 'LOGIN', 'Logged in successfully', '2025-05-17 11:33:29'),
(1588, 157, 'LOGIN', 'Logged in successfully', '2025-05-17 13:29:53'),
(1589, 157, 'LOGIN', 'Logged in successfully', '2025-05-19 13:22:44'),
(1590, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:32:33'),
(1591, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:36:15'),
(1592, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:45:08'),
(1593, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:46:26'),
(1594, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:47:07'),
(1595, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:49:44'),
(1596, 157, 'LOGIN', 'Logged in successfully', '2025-05-19 13:50:16'),
(1597, 157, 'LOGOUT', 'Logged out successfully', '2025-05-19 13:51:08'),
(1598, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:51:12'),
(1599, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 13:58:47'),
(1600, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:00:53'),
(1601, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:01:27'),
(1602, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:01:33'),
(1603, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:02:51'),
(1604, 157, 'LOGIN', 'Logged in successfully', '2025-05-19 14:05:39'),
(1605, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:07:02'),
(1606, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:07:48'),
(1607, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:09:39'),
(1608, 104, 'User Added', 'Added account ID 158', '2025-05-19 14:10:26'),
(1609, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:10:35'),
(1610, 158, 'LOGIN', 'Logged in successfully', '2025-05-19 14:10:39'),
(1611, 158, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:10:57'),
(1612, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:11:02'),
(1613, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:11:14'),
(1614, 158, 'LOGIN', 'Logged in successfully', '2025-05-19 14:11:17'),
(1615, 158, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:11:45'),
(1616, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:11:48'),
(1617, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:15:19'),
(1618, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:15:52'),
(1619, 158, 'LOGIN', 'Logged in successfully', '2025-05-19 14:16:00'),
(1620, 158, 'LOGIN', 'Logged in successfully', '2025-05-19 14:16:40'),
(1621, 158, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:16:49'),
(1622, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:16:52'),
(1623, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:30:18'),
(1624, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:31:07'),
(1625, 158, 'LOGIN', 'Logged in successfully', '2025-05-19 14:31:11'),
(1626, 158, 'LOGOUT', 'Logged out successfully', '2025-05-19 14:31:16'),
(1627, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:31:20'),
(1628, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:33:18'),
(1629, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:34:49'),
(1630, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:35:54'),
(1631, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:40:16'),
(1632, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:43:55'),
(1633, 104, 'LOGIN', 'Please enter a message', '2025-05-19 14:47:00'),
(1634, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 14:47:47'),
(1635, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:03:28'),
(1636, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:04:03'),
(1637, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:04:24'),
(1638, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:04:46'),
(1639, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:04:49'),
(1640, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:05:42'),
(1641, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:05:45'),
(1642, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:05:47'),
(1643, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:05:49'),
(1644, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:05:57'),
(1645, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:06:01'),
(1646, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:07:16'),
(1647, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:12:25'),
(1648, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:12:56'),
(1649, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:13:14'),
(1650, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:13:21'),
(1651, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:13:24'),
(1652, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:13:52'),
(1653, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:13:59'),
(1654, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:14:03'),
(1655, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:14:08'),
(1656, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:15:08'),
(1657, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:15:12'),
(1658, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:15:27'),
(1659, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:15:30'),
(1660, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:16:34'),
(1661, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:21:06'),
(1662, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:21:23'),
(1663, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:21:33'),
(1664, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:21:44'),
(1665, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:22:17'),
(1666, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:22:20'),
(1667, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:24:19'),
(1668, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:24:24'),
(1669, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:24:27'),
(1670, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:24:53'),
(1671, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:24:56'),
(1672, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:26:30'),
(1673, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:26:37'),
(1674, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:26:44'),
(1675, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:28:10'),
(1676, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:28:14'),
(1677, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:28:33'),
(1678, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:28:38'),
(1679, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:28:47'),
(1680, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:28:52'),
(1681, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:29:39'),
(1682, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:33:52'),
(1683, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:34:44'),
(1684, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:39:07'),
(1685, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:39:51'),
(1686, 155, 'LOGIN', 'Logged in successfully', '2025-05-19 15:40:05'),
(1687, 155, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:40:10'),
(1688, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:40:14'),
(1689, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:43:49'),
(1690, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:44:18'),
(1691, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:46:47'),
(1692, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:48:40'),
(1693, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:49:51'),
(1694, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:50:25'),
(1695, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:50:40'),
(1696, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 15:50:43'),
(1697, 154, 'LOGOUT', 'Logged out successfully', '2025-05-19 15:51:05'),
(1698, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:51:09'),
(1699, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:53:06'),
(1700, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:54:43'),
(1701, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:55:30'),
(1702, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:58:24'),
(1703, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 15:59:31'),
(1704, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:00:03'),
(1705, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:00:11'),
(1706, 154, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:00:17'),
(1707, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:00:20'),
(1708, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:00:42'),
(1709, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:00:45'),
(1710, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:03:01'),
(1711, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:03:07'),
(1712, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:03:10'),
(1713, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:06:33'),
(1714, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:06:56'),
(1715, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:06:59'),
(1716, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:10:23'),
(1717, 154, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:10:34'),
(1718, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:10:37'),
(1719, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:11:02'),
(1720, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:11:17'),
(1721, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:11:23'),
(1722, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:14:15'),
(1723, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:14:44'),
(1724, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:15:08'),
(1725, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:15:10'),
(1726, 104, 'LOGIN', 'Logged in successfully', '2025-05-19 16:17:23'),
(1727, 104, 'LOGOUT', 'Logged out successfully', '2025-05-19 16:21:15'),
(1728, 154, 'LOGIN', 'Logged in successfully', '2025-05-19 16:21:17'),
(1729, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 13:21:01'),
(1730, 154, 'LOGOUT', 'Logged out successfully', '2025-05-21 13:21:08'),
(1731, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 13:21:11'),
(1732, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 13:21:31'),
(1733, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 13:21:35'),
(1734, 154, 'LOGOUT', 'Logged out successfully', '2025-05-21 13:21:42'),
(1735, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 13:27:17'),
(1736, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 13:32:16'),
(1737, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 13:34:02'),
(1738, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 13:35:16'),
(1739, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 13:36:19'),
(1740, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 13:36:29'),
(1741, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 13:41:38'),
(1742, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 13:52:59'),
(1743, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 13:58:03'),
(1744, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 14:01:55'),
(1745, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 14:04:34'),
(1746, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 14:04:57'),
(1747, 157, 'LOGIN', 'Logged in successfully', '2025-05-21 14:05:55'),
(1748, 158, 'LOGIN', 'Logged in successfully', '2025-05-21 14:06:22'),
(1749, 157, 'LOGIN', 'Logged in successfully', '2025-05-21 14:09:10'),
(1750, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 14:25:13'),
(1751, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:25:40'),
(1752, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:27:53'),
(1753, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:29:31'),
(1754, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:39:46'),
(1755, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:39:53'),
(1756, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:39:57'),
(1757, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:40:08'),
(1758, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 14:40:14'),
(1759, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:40:37'),
(1760, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:40:40'),
(1761, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:41:54'),
(1762, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 14:41:56'),
(1763, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:42:34'),
(1764, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:42:37'),
(1765, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:43:46'),
(1766, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 14:43:49'),
(1767, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:44:13'),
(1768, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:44:16'),
(1769, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:44:46'),
(1770, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 14:44:50'),
(1771, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:47:09'),
(1772, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:47:12'),
(1773, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:47:26'),
(1774, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:47:32'),
(1775, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:48:50'),
(1776, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 14:48:54'),
(1777, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:49:51'),
(1778, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:55:54'),
(1779, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:57:21'),
(1780, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:57:51'),
(1781, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 14:57:57'),
(1782, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 14:58:04'),
(1783, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 14:58:11'),
(1784, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 15:01:16'),
(1785, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:01:19'),
(1786, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:01:23'),
(1787, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:01:43'),
(1788, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 15:01:50'),
(1789, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:01:59'),
(1790, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:02:02'),
(1791, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:02:36'),
(1792, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:04:10'),
(1793, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:07:05'),
(1794, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:07:47'),
(1795, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:08:08'),
(1796, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 15:08:12'),
(1797, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:08:32'),
(1798, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:08:35'),
(1799, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:09:25'),
(1800, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:09:56'),
(1801, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:10:31'),
(1802, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:12:01'),
(1803, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:12:33'),
(1804, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:13:20'),
(1805, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:20:54'),
(1806, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:21:44'),
(1807, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:22:04'),
(1808, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 15:22:08'),
(1809, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:24:26'),
(1810, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:24:42'),
(1811, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 15:24:44'),
(1812, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:24:53'),
(1813, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:24:56'),
(1814, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:25:11'),
(1815, 159, 'LOGIN', 'Logged in successfully', '2025-05-21 15:25:15'),
(1816, 159, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:26:33'),
(1817, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:31:45'),
(1818, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:33:29'),
(1819, 160, 'LOGIN', 'Logged in successfully', '2025-05-21 15:33:33'),
(1820, 160, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:33:53'),
(1821, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:33:56'),
(1822, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:34:09'),
(1823, 160, 'LOGIN', 'Logged in successfully', '2025-05-21 15:34:13'),
(1824, 160, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:34:18'),
(1825, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:34:24'),
(1826, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:35:27'),
(1827, 160, 'LOGIN', 'Logged in successfully', '2025-05-21 15:35:30'),
(1828, 160, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:35:34'),
(1829, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:35:40'),
(1830, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:39:08'),
(1831, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:39:31'),
(1832, 160, 'LOGIN', 'Logged in successfully', '2025-05-21 15:39:36'),
(1833, 160, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:39:47'),
(1834, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:39:50'),
(1835, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:42:23'),
(1836, 160, 'LOGIN', 'Logged in successfully', '2025-05-21 15:45:18'),
(1837, 160, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:45:30'),
(1838, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:45:33'),
(1839, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:47:46'),
(1840, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:48:19'),
(1841, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:49:47'),
(1842, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 15:49:51'),
(1843, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 15:51:02'),
(1844, 154, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:51:16'),
(1845, 104, 'LOGIN', 'Logged in successfully', '2025-05-21 15:51:19'),
(1846, 104, 'LOGOUT', 'Logged out successfully', '2025-05-21 15:51:33'),
(1847, 154, 'LOGIN', 'Logged in successfully', '2025-05-21 15:51:37'),
(1848, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 14:30:31'),
(1849, 160, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:30:46'),
(1850, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 14:30:50'),
(1851, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:31:06'),
(1852, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 14:31:09'),
(1853, 160, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:31:55'),
(1854, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 14:31:59'),
(1855, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:32:48'),
(1856, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 14:32:50'),
(1857, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 14:33:15'),
(1858, 160, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:33:41'),
(1859, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 14:33:46'),
(1860, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:34:00'),
(1861, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 14:34:02'),
(1862, 160, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:38:01'),
(1863, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 14:38:04'),
(1864, 160, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:38:47'),
(1865, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 14:38:51'),
(1866, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:39:10'),
(1867, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 14:39:13'),
(1868, 160, 'LOGOUT', 'Logged out successfully', '2025-05-26 14:39:50'),
(1869, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 14:40:00'),
(1870, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 14:57:52'),
(1871, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:01:53'),
(1872, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:02:39'),
(1873, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:03:36'),
(1874, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:06:03'),
(1875, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:06:55'),
(1876, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:13:51'),
(1877, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:15:28'),
(1878, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:16:46'),
(1879, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:18:45'),
(1880, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 15:20:56'),
(1881, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:22:15'),
(1882, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:23:59'),
(1883, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:25:12'),
(1884, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:25:59'),
(1885, 160, 'LOGIN', 'Logged in successfully', '2025-05-26 15:26:04'),
(1886, 160, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:26:15'),
(1887, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:26:18'),
(1888, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:27:29'),
(1889, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:28:12'),
(1890, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:28:18'),
(1891, 104, 'User Added', 'Added account ID 161', '2025-05-26 15:28:50'),
(1892, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:29:14'),
(1893, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:29:16'),
(1894, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:29:26'),
(1895, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:29:30'),
(1896, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:29:48'),
(1897, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:29:51'),
(1898, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:30:16'),
(1899, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:30:50'),
(1900, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:30:53'),
(1901, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:31:29'),
(1902, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:31:38'),
(1903, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:31:42'),
(1904, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:32:17'),
(1905, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:32:26'),
(1906, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:32:29'),
(1907, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:32:38'),
(1908, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:32:42'),
(1909, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:33:03'),
(1910, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:33:07'),
(1911, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:33:16'),
(1912, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:33:20'),
(1913, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:33:53'),
(1914, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:33:56'),
(1915, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:35:42'),
(1916, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:35:58'),
(1917, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 15:36:01'),
(1918, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:36:10'),
(1919, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:36:13'),
(1920, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:36:25'),
(1921, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:36:28'),
(1922, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:36:30'),
(1923, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 15:36:33'),
(1924, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:36:56'),
(1925, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:36:59'),
(1926, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:37:04'),
(1927, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:37:10'),
(1928, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:37:50'),
(1929, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:37:52'),
(1930, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:38:01'),
(1931, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:38:05'),
(1932, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 15:39:29'),
(1933, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:41:33'),
(1934, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:42:35'),
(1935, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:43:12'),
(1936, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:44:57'),
(1937, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:47:46'),
(1938, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:48:38'),
(1939, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:48:51'),
(1940, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 15:48:54'),
(1941, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:49:03'),
(1942, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:49:06'),
(1943, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:49:14'),
(1944, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 15:49:17'),
(1945, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:49:27'),
(1946, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:49:30'),
(1947, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:49:41'),
(1948, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 15:49:44'),
(1949, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:49:50'),
(1950, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:49:54'),
(1951, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:50:36'),
(1952, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 15:50:38'),
(1953, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:50:49'),
(1954, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:50:52'),
(1955, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:51:04'),
(1956, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 15:51:09'),
(1957, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:53:05'),
(1958, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:53:14'),
(1959, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 15:53:17'),
(1960, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 15:58:34'),
(1961, 126, 'LOGIN', 'Logged in successfully', '2025-05-26 15:59:10'),
(1962, 126, 'LOGOUT', 'Logged out successfully', '2025-05-26 15:59:13'),
(1963, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:04:58'),
(1964, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:10:44'),
(1965, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:12:32'),
(1966, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 16:12:35'),
(1967, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 16:19:36'),
(1968, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:19:47'),
(1969, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:19:51'),
(1970, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:20:18'),
(1971, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 16:20:22'),
(1972, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:24:22'),
(1973, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:24:36'),
(1974, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 16:24:40'),
(1975, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:25:01'),
(1976, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:25:05'),
(1977, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:26:44'),
(1978, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:35:53'),
(1979, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:36:39'),
(1980, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:37:20'),
(1981, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:38:30'),
(1982, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:38:58'),
(1983, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 16:39:32'),
(1984, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:39:52'),
(1985, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:39:57'),
(1986, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:40:40'),
(1987, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:40:43'),
(1988, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:40:51'),
(1989, 161, 'LOGIN', 'Logged in successfully', '2025-05-26 16:40:54'),
(1990, 161, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:41:01'),
(1991, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:41:03'),
(1992, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:41:12'),
(1993, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 16:41:15'),
(1994, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:41:39'),
(1995, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:41:43'),
(1996, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:41:55'),
(1997, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 16:41:58'),
(1998, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:48:11'),
(1999, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:48:32'),
(2000, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 16:48:37'),
(2001, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:48:42'),
(2002, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:48:48'),
(2003, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:49:25'),
(2004, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:49:34'),
(2005, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 16:49:37'),
(2006, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:49:45'),
(2007, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:49:48'),
(2008, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:50:19'),
(2009, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:51:41'),
(2010, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 16:51:55'),
(2011, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 16:52:05'),
(2012, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:07:53'),
(2013, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:14:15'),
(2014, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:14:49'),
(2015, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:15:29'),
(2016, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:16:25'),
(2017, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:17:11'),
(2018, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:18:22'),
(2019, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:19:02'),
(2020, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:19:59'),
(2021, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:22:40'),
(2022, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:23:43'),
(2023, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:24:40'),
(2024, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:25:35'),
(2025, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:26:11'),
(2026, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:27:23'),
(2027, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:27:37'),
(2028, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:28:41'),
(2029, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:28:59'),
(2030, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:39:29'),
(2031, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:39:58'),
(2032, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:40:23'),
(2033, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:40:26'),
(2034, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:41:33'),
(2035, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:42:27'),
(2036, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:42:41'),
(2037, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:42:55'),
(2038, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:47:22'),
(2039, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:53:16'),
(2040, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:53:19'),
(2041, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:53:22'),
(2042, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:54:33'),
(2043, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:55:44'),
(2044, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:56:13'),
(2045, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:56:16'),
(2046, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:56:51'),
(2047, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:56:55'),
(2048, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:57:43'),
(2049, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:57:47'),
(2050, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:57:54'),
(2051, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:57:57'),
(2052, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:58:02'),
(2053, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:58:06'),
(2054, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:58:16'),
(2055, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 17:58:19'),
(2056, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:58:39'),
(2057, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:58:43'),
(2058, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:59:13'),
(2059, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 17:59:19'),
(2060, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 17:59:40'),
(2061, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:01:49'),
(2062, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:01:56'),
(2063, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:01:59'),
(2064, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:02:06'),
(2065, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:02:10'),
(2066, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:03:45'),
(2067, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:04:34'),
(2068, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:04:41'),
(2069, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:04:46'),
(2070, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:05:45'),
(2071, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:05:49'),
(2072, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:06:00'),
(2073, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:06:03'),
(2074, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:07:32'),
(2075, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:08:38'),
(2076, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:08:44'),
(2077, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:09:48'),
(2078, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:11:03'),
(2079, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:11:30'),
(2080, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:11:34'),
(2081, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:12:10'),
(2082, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:12:19'),
(2083, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:12:25'),
(2084, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:12:30'),
(2085, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:12:33'),
(2086, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:13:09'),
(2087, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:13:13'),
(2088, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:15:50'),
(2089, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:16:54'),
(2090, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:16:58'),
(2091, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:17:00'),
(2092, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:18:31'),
(2093, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:19:54'),
(2094, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:19:57'),
(2095, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:19:59'),
(2096, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:20:31'),
(2097, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:20:45'),
(2098, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:20:54'),
(2099, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:20:58'),
(2100, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:21:22'),
(2101, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:21:26'),
(2102, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:23:37'),
(2103, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:23:54'),
(2104, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:23:57'),
(2105, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:24:50'),
(2106, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:25:02'),
(2107, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:26:10'),
(2108, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:26:13'),
(2109, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 18:26:16'),
(2110, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:26:18'),
(2111, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:26:22'),
(2112, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:28:25'),
(2113, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:30:05'),
(2114, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:31:18'),
(2115, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:31:22'),
(2116, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:31:25'),
(2117, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:32:05'),
(2118, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:32:08'),
(2119, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:32:19'),
(2120, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:32:22'),
(2121, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:32:40'),
(2122, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:32:45'),
(2123, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:34:17'),
(2124, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:34:54'),
(2125, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:35:06'),
(2126, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:35:09'),
(2127, 154, 'LOGIN', 'Logged in successfully', '2025-05-26 18:35:32'),
(2128, 154, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:35:36'),
(2129, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:35:40'),
(2130, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:35:51'),
(2131, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 18:35:54'),
(2132, 162, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:35:59'),
(2133, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:36:02'),
(2134, 104, 'LOGOUT', 'Logged out successfully', '2025-05-26 18:36:17'),
(2135, 162, 'LOGIN', 'Logged in successfully', '2025-05-26 18:36:20'),
(2136, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:36:42'),
(2137, 104, 'LOGIN', 'Logged in successfully', '2025-05-26 18:37:41'),
(2138, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:30:02'),
(2139, 104, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:31:10'),
(2140, 162, 'LOGIN', 'Logged in successfully', '2025-05-27 20:31:14'),
(2141, 162, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:31:45'),
(2142, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:31:49'),
(2143, 104, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:32:09'),
(2144, 162, 'LOGIN', 'Logged in successfully', '2025-05-27 20:32:13'),
(2145, 162, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:32:23'),
(2146, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:32:27'),
(2147, 104, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:32:48'),
(2148, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 20:32:51'),
(2149, 154, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:33:19'),
(2150, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:33:24'),
(2151, 104, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:33:33'),
(2152, 162, 'LOGIN', 'Logged in successfully', '2025-05-27 20:33:37'),
(2153, 162, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:33:42'),
(2154, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:33:47'),
(2155, 104, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:34:14'),
(2156, 162, 'LOGIN', 'Logged in successfully', '2025-05-27 20:34:17'),
(2157, 162, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:34:25'),
(2158, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:34:28'),
(2159, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:35:55'),
(2160, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:39:29'),
(2161, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 20:40:36'),
(2162, 104, 'LOGOUT', 'Logged out successfully', '2025-05-27 20:40:52'),
(2163, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 20:40:57'),
(2164, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 20:48:35'),
(2165, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 20:49:10'),
(2166, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 20:59:10'),
(2167, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 21:01:34'),
(2168, 104, 'LOGIN', 'Logged in successfully', '2025-05-27 21:02:53'),
(2169, 104, 'LOGOUT', 'Logged out successfully', '2025-05-27 21:02:55'),
(2170, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 21:02:58'),
(2171, 154, 'LOGIN', 'Logged in successfully', '2025-05-27 21:06:23'),
(2172, 154, 'LOGOUT', 'Logged out successfully', '2025-05-27 21:06:46'),
(2173, 162, 'LOGIN', 'Logged in successfully', '2025-05-27 21:06:52'),
(2174, 162, 'LOGOUT', 'Logged out successfully', '2025-05-27 21:06:57');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_member`
--

CREATE TABLE `tbl_member` (
  `mem_id` int(20) NOT NULL,
  `balance` decimal(10,2) NOT NULL,
  `c_date` datetime NOT NULL DEFAULT current_timestamp(),
  `c_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_member`
--

INSERT INTO `tbl_member` (`mem_id`, `balance`, `c_date`, `c_id`) VALUES
(70, 40.00, '2025-04-28 21:01:18', 129),
(71, 500.00, '2025-04-28 21:43:38', 129),
(72, 500.00, '2025-04-28 22:15:12', 129),
(73, 500.00, '2025-04-28 22:15:18', 129),
(80, 5000.00, '2025-05-04 19:25:04', 146),
(83, 4000.00, '2025-05-05 12:02:27', 153),
(84, 4000.00, '2025-05-05 15:07:25', 154),
(85, 800.00, '2025-05-05 18:54:47', 156),
(86, 100.00, '2025-05-05 23:09:38', 157),
(87, 3000.00, '2025-05-05 23:10:36', 157),
(88, 1000.00, '2025-05-19 13:45:26', 157),
(89, 10.00, '2025-05-19 13:50:02', 157),
(90, 322.00, '2025-05-19 14:01:53', 157),
(91, 30.00, '2025-05-19 14:07:52', 157),
(92, 3000.00, '2025-05-19 14:11:06', 158),
(93, 3000.00, '2025-05-19 15:34:53', 155),
(94, 3000.00, '2025-05-21 14:40:06', 159),
(95, 3000.00, '2025-05-21 15:01:40', 159),
(96, 3000.00, '2025-05-21 15:33:27', 160),
(97, 2000.00, '2025-05-26 14:33:56', 160),
(98, 3000.00, '2025-05-26 15:29:11', 161),
(99, 5000.00, '2025-05-26 15:32:23', 161),
(100, 3000.00, '2025-05-26 15:49:11', 162),
(101, 3000.00, '2025-05-26 16:49:31', 154),
(102, 3000.00, '2025-05-27 20:32:02', 162);

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
  `activation_status` varchar(100) NOT NULL,
  `cancel_reason` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`t_id`, `c_id`, `m_id`, `duration`, `date`, `t_status`, `amount_to_be_paid`, `membership_type`, `start_datetime`, `end_datetime`, `activation_status`, `cancel_reason`) VALUES
(123, 161, 13, '1', '05-26-2025', 'Success', 1000.00, 'VIP3', '2025-05-26 16:41:06', '2025-06-25 16:41:06', 'Activated', NULL),
(127, 154, 2, '1', '05-26-2025', 'Success', 700.00, 'VIP1', '2025-05-26 17:55:48', '2025-05-26 17:55:58', 'Expired', NULL),
(129, 154, 11, '1', '05-26-2025', 'Success', 800.00, 'VIP2', '2025-05-26 17:56:59', '2025-05-26 17:57:09', 'Expired', NULL),
(130, 154, 14, '2', '05-26-2025', 'Success', 400.00, 'SILVER', '2025-05-26 17:58:25', '2025-05-26 17:58:35', 'Expired', NULL),
(133, 154, 13, '1', '05-26-2025', 'Success', 1000.00, 'VIP3', '2025-05-26 18:12:39', '2025-05-26 18:12:49', 'Expired', NULL),
(134, 154, 11, '1', '05-26-2025', 'Success', 800.00, 'VIP2', '2025-05-26 18:21:03', '2025-05-26 18:21:13', 'Expired', NULL),
(135, 154, 14, '1', '05-26-2025', 'Success', 200.00, 'SILVER', '2025-05-26 18:34:31', '2025-06-25 18:34:31', 'Expired', NULL),
(136, 162, 11, '1', '05-27-2025', 'Success', 800.00, 'VIP2', '2025-05-27 20:32:33', '2025-06-26 20:32:33', 'Cancelled', 'Abusive Activity');

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
(154, 'Francisco', 'Absalon', 'francisco@gmail.com', 'france', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '09773229807', 'Member', 'Active', '', 1000.00),
(155, 'dadada', 'adadad', 'dad@gmail.com', 'adadadsda', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', '059578463', 'Member', 'Active', NULL, 3100.00),
(156, 'Tralalelo', 'Tralala', 'tralalelo@gmail.com', 'tralelotropalang', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0912382323', 'Member', 'Active', '', 1000.00),
(157, 'Jhonmark', 'Alcala', 'jhonmark@gmail.com', 'mark', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '09123128323', 'Member', 'Active', 'src/userimage/image.png', 3462.00),
(158, 'Jeric', 'Testingg', 'testing@gmail.com', 'tesst', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '091232323', 'Member', 'Active', 'null', 600.00),
(159, 'haga', 'awada', 'err@gmail.com', 'dadad', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0923123', 'Member', 'Active', NULL, 1400.00),
(160, 'Jericho', 'Alcala', 'dadada@gmail.com', 'addad', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0912321321', 'Member', 'Active', '', 500.00),
(161, 'Shaine', 'Franza', 'shaine@gmail.com', 'shaine', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '0923182323', 'Member', 'Active', 'null', 3400.00),
(162, 'Johnlen', 'Amaro', 'johnlen@gmail.com', 'len', 'hmfD7Go+m8JbK4RhyJYsj3iEWMyyRnZEmohKf5t6lYA=', '09123235441', 'Member', 'Active', NULL, 2300.00);

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
  MODIFY `fp_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2175;

--
-- AUTO_INCREMENT for table `tbl_member`
--
ALTER TABLE `tbl_member`
  MODIFY `mem_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `tbl_membership`
--
ALTER TABLE `tbl_membership`
  MODIFY `m_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `t_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=137;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=163;

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
