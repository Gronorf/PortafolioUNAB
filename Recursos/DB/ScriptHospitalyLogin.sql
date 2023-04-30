-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema hospitaldb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hospitaldb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hospitaldb` DEFAULT CHARACTER SET utf8mb3 ;
USE `hospitaldb` ;

-- -----------------------------------------------------
-- Table `hospitaldb`.`medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`medico` (
  `idMedico` INT NOT NULL AUTO_INCREMENT,
  `rutMedico` INT NOT NULL,
  `nombreMedico` VARCHAR(50) NULL,
  `apellidoPaternoMedico` VARCHAR(50) NULL DEFAULT NULL,
  `apellidoMaternoMedico` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`idMedico`),
  UNIQUE INDEX `rutMedico_UNIQUE` (`rutMedico` ASC) VISIBLE,
  UNIQUE INDEX `idMedico_UNIQUE` (`idMedico` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hospitaldb`.`paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`paciente` (
  `idPaciente` INT NOT NULL AUTO_INCREMENT,
  `rutPaciente` INT NOT NULL,
  `fichaClinica` INT NOT NULL,
  `nombrePaciente` VARCHAR(50) NOT NULL,
  `apellidoPaternoPaciente` VARCHAR(50) NULL DEFAULT NULL,
  `apellidoMaternoPaciente` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`idPaciente`),
  UNIQUE INDEX `rutPaciente_UNIQUE` (`rutPaciente` ASC) VISIBLE,
  UNIQUE INDEX `fechaClinica_UNIQUE` (`fichaClinica` ASC) VISIBLE,
  UNIQUE INDEX `idPaciente_UNIQUE` (`idPaciente` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hospitaldb`.`control`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`control` (
  `idControl` INT NOT NULL,
  `fechaControl` DATE NOT NULL,
  `obsControl` VARCHAR(250) NOT NULL,
  `fechaSiguienteControl` DATE NULL DEFAULT NULL,
  `medico_idMedico` INT NOT NULL,
  `paciente_idPaciente` INT NOT NULL,
  PRIMARY KEY (`idControl`),
  UNIQUE INDEX `idControl_UNIQUE` (`idControl` ASC) VISIBLE,
  INDEX `fk_control_medico_idx` (`medico_idMedico` ASC) VISIBLE,
  INDEX `fk_control_paciente1_idx` (`paciente_idPaciente` ASC) VISIBLE,
  CONSTRAINT `fk_control_medico`
    FOREIGN KEY (`medico_idMedico`)
    REFERENCES `hospitaldb`.`medico` (`idMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_control_paciente1`
    FOREIGN KEY (`paciente_idPaciente`)
    REFERENCES `hospitaldb`.`paciente` (`idPaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hospitaldb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nombreUsuario` VARCHAR(50) NOT NULL,
  `emailUsuario` VARCHAR(250) NOT NULL,
  `claveUsuario` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE INDEX `idusuario_UNIQUE` (`idusuario` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospitaldb`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`rol` (
  `idRol` INT NOT NULL AUTO_INCREMENT,
  `nombreRol` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`idRol`),
  UNIQUE INDEX `idRol_UNIQUE` (`idRol` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospitaldb`.`usuario_rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`usuario_rol` (
  `usuario_idusuario` INT NOT NULL,
  `rol_idRol` INT NOT NULL,
  INDEX `fk_usuario_rol_usuario1_idx` (`usuario_idusuario` ASC) VISIBLE,
  INDEX `fk_usuario_rol_rol1_idx` (`rol_idRol` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_rol_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `hospitaldb`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_rol_rol1`
    FOREIGN KEY (`rol_idRol`)
    REFERENCES `hospitaldb`.`rol` (`idRol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
