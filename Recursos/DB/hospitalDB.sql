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
-- Table `hospitaldb`.`paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`paciente` (
  `rutPaciente` INT NOT NULL,
  `fechaClinica` INT NOT NULL,
  `nombrePaciente` VARCHAR(50) NOT NULL,
  `apellidoPaternoPaciente` VARCHAR(50) NULL DEFAULT NULL,
  `apellidoMaternoPaciente` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`rutPaciente`),
  UNIQUE INDEX `rutPaciente_UNIQUE` (`rutPaciente` ASC) VISIBLE,
  UNIQUE INDEX `fechaClinica_UNIQUE` (`fechaClinica` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hospitaldb`.`medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospitaldb`.`medico` (
  `rutMedico` INT NOT NULL,
  `nombreMedico` VARCHAR(50) NOT NULL,
  `apellidoPaternoMedico` VARCHAR(50) NULL DEFAULT NULL,
  `apellidoMaternoMedico` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`rutMedico`),
  UNIQUE INDEX `rutMedico_UNIQUE` (`rutMedico` ASC) VISIBLE)
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
  `paciente_rutPaciente` INT NOT NULL,
  `medico_rutMedico` INT NOT NULL,
  PRIMARY KEY (`idControl`, `paciente_rutPaciente`, `medico_rutMedico`),
  UNIQUE INDEX `idControl_UNIQUE` (`idControl` ASC) VISIBLE,
  INDEX `fk_control_paciente_idx` (`paciente_rutPaciente` ASC) VISIBLE,
  INDEX `fk_control_medico1_idx` (`medico_rutMedico` ASC) VISIBLE,
  CONSTRAINT `fk_control_paciente`
    FOREIGN KEY (`paciente_rutPaciente`)
    REFERENCES `hospitaldb`.`paciente` (`rutPaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_control_medico1`
    FOREIGN KEY (`medico_rutMedico`)
    REFERENCES `hospitaldb`.`medico` (`rutMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
