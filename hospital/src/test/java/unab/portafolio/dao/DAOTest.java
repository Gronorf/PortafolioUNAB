package unab.portafolio.dao;

import org.junit.Test;
import unab.portafolio.model.medico.Medico;

import java.util.List;

import static org.junit.Assert.*;

public class DAOTest extends DAO {


    @Test
    public void create() throws DAOException {

        DAOTest test = new DAOTest();

        Medico medicoTest = new Medico();
        medicoTest.setRutMedico(444);
        medicoTest.setNombreMedico("la fran");
        medicoTest.setApellidoPaternoMedico("Bettoli");
        medicoTest.setApellidoMaternoMedico("Pizzagalli");

        test.create(medicoTest);
    }

    @Test
    public void delete() throws DAOException {

        DAOTest test = new DAOTest();

        Medico medicoTest = new Medico();
        medicoTest.setIdMedico(3);
        medicoTest.setRutMedico(444);
        medicoTest.setNombreMedico("la fran");
        medicoTest.setApellidoPaternoMedico("Bettoli");
        medicoTest.setApellidoMaternoMedico("Pizzagalli");

        test.delete(medicoTest);

    }

//    @Test
//    public readAll() throws  DAOException {
//
//        DAOTest test = new DAOTest();
//
//        List<Medico> daoTestList = test.readAll();
//
//
//    }

}

//
//    @Test
//    public void update() {
//    }
//
//    @Test
//    public void GetNombreModelo() {
//    }
