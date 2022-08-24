-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-08-2022 a las 21:14:29
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_bvc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_events`
--

CREATE TABLE `tb_events` (
  `id_event` int(10) UNSIGNED NOT NULL,
  `event` varchar(400) NOT NULL,
  `date_event` date NOT NULL,
  `quantity` int(10) DEFAULT NULL,
  `cost` varchar(20) NOT NULL,
  `platform` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_events`
--

INSERT INTO `tb_events` (`id_event`, `event`, `date_event`, `quantity`, `cost`, `platform`) VALUES
(1, 'Compras', '2022-08-23', 2, '1000', 'pasarela de compras'),
(2, 'Compras Homecenter', '2022-08-23', 5, '15000', 'pasarela de pagos'),
(3, 'Compras Homecenter', '2022-08-23', 5, '15000', 'pasarela de pagos'),
(4, 'Compras Homecenter', '2022-08-24', 5, '75000', 'pasarela de pagos');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_events`
--
ALTER TABLE `tb_events`
  ADD PRIMARY KEY (`id_event`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_events`
--
ALTER TABLE `tb_events`
  MODIFY `id_event` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
