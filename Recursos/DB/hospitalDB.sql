-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema hospitaldb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hospitaldb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hospitaldb` DEFAULT CHARACTER SET utf8 ;
USE `hospitaldb` ;

-- -----------------------------------------------------
-- Table `hospitaldb`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`Medico` (
  `rutMedico` INT(10) NOT NULL,
  `nombreMedico` VARCHAR(50) NOT NULL,
  `apellidoPaternoMedico` VARCHAR(50) NULL,
  `apellidoMaternoMedico` VARCHAR(50) NULL,
  PRIMARY KEY (`rutMedico`),
  UNIQUE INDEX `rutMedico_UNIQUE` (`rutMedico` ASC) VISIBLE);


-- -----------------------------------------------------
-- Table `hospitaldb`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`Paciente` (
  `rutPaciente` INT(10) NOT NULL,
  `fechaClinica` INT(50) NOT NULL,
  `nombrePaciente` VARCHAR(50) NOT NULL,
  `apellidoPaternoPaciente` VARCHAR(50) NULL,
  `apellidoMaternoPaciente` VARCHAR(50) NULL,
  `Medico_rutMedico` INT(10) NOT NULL,
  PRIMARY KEY (`rutPaciente`, `Medico_rutMedico`),
  UNIQUE INDEX `rutPaciente_UNIQUE` (`rutPaciente` ASC) VISIBLE,
  INDEX `fk_Paciente_Medico_idx` (`Medico_rutMedico` ASC) VISIBLE,
  UNIQUE INDEX `fechaClinica_UNIQUE` (`fechaClinica` ASC) VISIBLE,
  CONSTRAINT `fk_Paciente_Medico`
    FOREIGN KEY (`Medico_rutMedico`)
    REFERENCES `hospitaldb`.`Medico` (`rutMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `hospitaldb`.`Control`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`Control` (
  `idControl` INT(10) NOT NULL,
  `fechaControl` DATE NOT NULL,
  `obsControl` VARCHAR(250) NOT NULL,
  `fechaSiguienteControl` DATE NULL,
  `Paciente_rutPaciente` INT(10) NOT NULL,
  `Paciente_Medico_rutMedico` INT(10) NOT NULL,
  PRIMARY KEY (`idControl`, `Paciente_rutPaciente`, `Paciente_Medico_rutMedico`),
  UNIQUE INDEX `idControl_UNIQUE` (`idControl` ASC) VISIBLE,
  INDEX `fk_CONTROL_Paciente1_idx` (`Paciente_rutPaciente` ASC, `Paciente_Medico_rutMedico` ASC) VISIBLE,
  CONSTRAINT `fk_CONTROL_Paciente1`
    FOREIGN KEY (`Paciente_rutPaciente` , `Paciente_Medico_rutMedico`)
    REFERENCES `hospitaldb`.`Paciente` (`rutPaciente` , `Medico_rutMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
