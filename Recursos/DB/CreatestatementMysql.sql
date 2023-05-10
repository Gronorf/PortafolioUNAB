CREATE TABLE `control` (
  `idControl` int NOT NULL,
  `fechaControl` date NOT NULL,
  `obsControl` varchar(250) NOT NULL,
  `fechaSiguienteControl` date DEFAULT NULL,
  `medico_idMedico` int NOT NULL,
  `paciente_idPaciente` int NOT NULL,
  PRIMARY KEY (`idControl`),
  UNIQUE KEY `idControl_UNIQUE` (`idControl`),
  KEY `fk_control_medico_idx` (`medico_idMedico`),
  KEY `fk_control_paciente1_idx` (`paciente_idPaciente`),
  CONSTRAINT `fk_control_medico` FOREIGN KEY (`medico_idMedico`) REFERENCES `medico` (`idMedico`),
  CONSTRAINT `fk_control_paciente1` FOREIGN KEY (`paciente_idPaciente`) REFERENCES `paciente` (`idPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `medico` (
  `idMedico` int NOT NULL AUTO_INCREMENT,
  `rutMedico` int NOT NULL,
  `nombreMedico` varchar(50) DEFAULT NULL,
  `apellidoPaternoMedico` varchar(50) DEFAULT NULL,
  `apellidoMaternoMedico` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idMedico`),
  UNIQUE KEY `rutMedico_UNIQUE` (`rutMedico`),
  UNIQUE KEY `idMedico_UNIQUE` (`idMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;

CREATE TABLE `paciente` (
  `idPaciente` int NOT NULL AUTO_INCREMENT,
  `rutPaciente` int NOT NULL,
  `fichaClinica` int NOT NULL,
  `nombrePaciente` varchar(50) NOT NULL,
  `apellidoPaternoPaciente` varchar(50) DEFAULT NULL,
  `apellidoMaternoPaciente` varchar(50) DEFAULT NULL,
  `ingresoPaciente` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idPaciente`),
  UNIQUE KEY `rutPaciente_UNIQUE` (`rutPaciente`),
  UNIQUE KEY `fechaClinica_UNIQUE` (`fichaClinica`),
  UNIQUE KEY `idPaciente_UNIQUE` (`idPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb3;

CREATE TABLE `rol` (
  `idRol` int NOT NULL AUTO_INCREMENT,
  `nombreRol` varchar(250) NOT NULL,
  `id_rol` int NOT NULL,
  `nombre_rol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRol`),
  UNIQUE KEY `idRol_UNIQUE` (`idRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `usuario` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(50) NOT NULL,
  `emailUsuario` varchar(250) NOT NULL,
  `claveUsuario` varchar(50) NOT NULL,
  `rolUsuario` varchar(50) NOT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `idusuario_UNIQUE` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb3;

CREATE TABLE `usuario_rol` (
  `usuario_idusuario` int NOT NULL,
  `rol_idRol` int NOT NULL,
  KEY `fk_usuario_rol_usuario1_idx` (`usuario_idusuario`),
  KEY `fk_usuario_rol_rol1_idx` (`rol_idRol`),
  CONSTRAINT `fk_usuario_rol_rol1` FOREIGN KEY (`rol_idRol`) REFERENCES `rol` (`idRol`),
  CONSTRAINT `fk_usuario_rol_usuario1` FOREIGN KEY (`usuario_idusuario`) REFERENCES `usuario` (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
