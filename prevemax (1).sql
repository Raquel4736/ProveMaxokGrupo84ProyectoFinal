-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 21:25:00
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prevemax`
--
CREATE DATABASE IF NOT EXISTS `prevemax` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `prevemax`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `idCompras` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estadoCompra` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`idCompras`, `idProveedor`, `fecha`, `estadoCompra`) VALUES
(12, 2, '2023-10-03', 1),
(21, 1, '2023-10-18', 1),
(22, 1, '2023-10-18', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datellecompra`
--

CREATE TABLE `datellecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompras` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `datellecompra`
--

INSERT INTO `datellecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idCompras`, `idProducto`) VALUES
(2, 23, 200000, 12, 1),
(3, 1, 25000, 22, 11),
(4, 1, 20000, 22, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(30) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precioActual` double NOT NULL,
  `Stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precioActual`, `Stock`, `estado`) VALUES
(1, 'Heladera', 'Gafa HGF358 282lts Blanca', 259999, 10, 1),
(2, 'Aire Acondicionado', 'Noblex frio/calor 350w', 499900, 10, 0),
(4, 'Termotanque a Gas', 'Termotanque a gas Escorial 80 lt', 104.999, 12, 1),
(6, 'Termotanque Eléctrico', 'Termotanque Eléctrico Longvie  78 lts', 203375, 15, 1),
(7, 'Ventilador Turbo', 'Kacemaster TURBOX40', 19999, 18, 1),
(8, 'Ventilador de Pie', 'Liliana VP25M 25\"', 55999, 21, 1),
(9, 'Cocina Doble Horno', 'Electrolux 56DXQ', 460499, 11, 1),
(10, 'Cocina Electrica', 'Domec  CENG 56cm con Cajón Parrilla', 465399, 6, 1),
(11, 'Ventilador de Pie', 'Noblex ', 19999, 12, 1),
(12, 'Heladera Noblex', 'Ciclica/1 Puerta', 350000, 70, 1),
(13, 'plancha', 'elctrica ', 25000, 8, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `razonSocial` varchar(30) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `razonSocial`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'Domec ', '  Avenida Maipú 765', '333456', 0),
(2, 'Gafa', 'AV.Cotenaster 345', ' 1538950385', 1),
(3, 'Escorial', 'Hipolito Yrigoyen 834', '555798', 1),
(4, 'Longvie', 'Avenida Corrientes 594', '666856', 1),
(5, 'Liliana', 'Avenida Córdoba 458', '77796584', 1),
(6, 'Electrolux', 'Avenida de Mayo 854', '88843449', 0),
(7, 'Kacemaster', 'Avenida de los Constituyentes ', '99959547', 1),
(8, 'Noblex', 'av. Ugarte 587', '22254995', 1),
(9, 'Philips', 'Av.  Corrientes 876', '1586749474', 1),
(10, 'atma', 'Mendoza 6879', '1596860955', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`idCompras`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `datellecompra`
--
ALTER TABLE `datellecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idCompras` (`idCompras`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `idCompras` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `datellecompra`
--
ALTER TABLE `datellecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `datellecompra`
--
ALTER TABLE `datellecompra`
  ADD CONSTRAINT `datellecompra_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `datellecompra_ibfk_3` FOREIGN KEY (`idCompras`) REFERENCES `compras` (`idCompras`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
