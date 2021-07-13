-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2021 at 12:23 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `register`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `student` varchar(100) NOT NULL,
  `course` varchar(100) NOT NULL,
  `year` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `student`, `course`, `year`, `password`) VALUES
(1, 'alpha', 'BIT', '2', '122'),
(2, 'ada', 'BAC', '324', '23'),
(3, 'alex jkaparato', 'BAC', '45', '423'),
(4, 'alex juma ', 'BAC', '123', '12'),
(5, 'juma juma', 'BAC', '12', '123'),
(6, 'Juma', 'BSP', '2020', '123'),
(7, 'mkuu', 'BAIT', '12', '123'),
(8, 'kaparo  ', 'BCS', '12', '1234'),
(9, 'mandari', 'BSP', '123', '123'),
(10, 'mandari', 'BSP', '123', '123'),
(11, 'jame jams', 'BAC', '12', '123'),
(12, 'Amina musa', 'BCS', '20012', '123'),
(13, 'hamis Musa', 'BSP', '2020', '123');

-- --------------------------------------------------------

--
-- Table structure for table `parent`
--

CREATE TABLE `parent` (
  `id` int(11) NOT NULL,
  `student` varchar(100) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `realation` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parent`
--

INSERT INTO `parent` (`id`, `student`, `fullname`, `realation`, `phone`, `email`) VALUES
(1, 'alpha', 'alpha', 'Dady', '312312', 'dasda@fasdfdf'),
(2, 'ada', 'ada', 'Uncle', '3243', 'dfdf'),
(3, 'alex jkaparato', 'alex jkaparato', 'Uncle', '3324', 'erewr'),
(4, 'alex juma ', 'alex juma ', 'Uncle', '3423', 'sdfdsf'),
(5, 'juma juma', 'juma juma', 'Dady', '1234567890', 'eqwewqe'),
(6, 'Juma', 'Juma', 'Uncle', '12345678', 'alpha@gmail.com'),
(7, 'mkuu', 'mkuu', 'Sister', '23213', '23122gdfsdf'),
(8, 'kaparo  ', 'kaparo  ', 'Dady', '123456789', 'wew@gmail'),
(9, 'mandari', 'mandari', 'Dady', '213213', 'asds@dfdf'),
(10, 'mandari', 'mandari', 'Dady', '213213', 'asds@dfdf'),
(11, 'jame jams', 'jame jams', 'Dady', '1234567890', 'eqwewqe'),
(12, 'Amina musa', 'Amina musa', 'Uncle', '1234567890', 'alpha@gmil.com'),
(13, 'hamis Musa', 'hamis Musa', 'Uncle', '2323', 'musa@gmail');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `region` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `regno` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `fullname`, `region`, `date`, `gender`, `regno`) VALUES
(1, 'alpha', 'mwanza', '2021-07-07', 'Male', 'IMCV23213'),
(2, 'ada', 'fsdf', '2021-07-07', 'Female', 'sdfdsf'),
(3, 'alex jkaparato', '434', '2021-06-30', 'Male', '34234'),
(4, 'alex juma ', 'rt', '2021-07-06', 'Male', 'rter'),
(5, 'juma juma', 'mwanza', '2021-06-30', 'Female', '123'),
(6, 'Juma', 'mwanza', '2021-07-14', 'Female', 'IMCBIT1223'),
(7, 'mkuu', 'mwanzaaa', '2021-07-16', 'Female', '123'),
(8, 'kaparo  ', 'wew', '2021-07-06', 'Female', '1234IMC'),
(9, 'mandari', 'mwanza', '2021-07-08', 'Male', 'IMC323'),
(10, 'mandari', 'mwanza', '2021-07-08', 'Male', 'IMC323'),
(11, 'jame jams', 'mwanza', '2021-06-30', 'Female', '123'),
(12, 'Amina musa', 'mahina', '2021-07-23', 'Male', 'IMVB3452'),
(13, 'hamis Musa', 'mara', '2021-07-16', 'Female', 'IMC123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `parent`
--
ALTER TABLE `parent`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `parent`
--
ALTER TABLE `parent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
