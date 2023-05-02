package unab.portafolio.model.medico;

import org.junit.Test;
import unab.portafolio.dao.DAO;
import unab.portafolio.dao.DAOException;

public class MedicoDAOTest extends DAO<Medico> {

    @Test
    public void testCreate() throws DAOException {

        MedicoDAO medicoDAO = new MedicoDAO();

        Medico medicoTest = new Medico();
        medicoTest.setRutMedico(149950901);
        medicoTest.setNombreMedico("Andrea");
        medicoTest.setApellidoPaternoMedico("Gutierrez");
        medicoTest.setApellidoMaternoMedico("Ulloa");

        medicoDAO.create(medicoTest);

    }

    @Test
    public void testReadAll() throws DAOException {

        MedicoDAO medicoDAO = new MedicoDAO();

        for (Medico medicoTest: medicoDAO.readAll()) {
            System.out.println(medicoTest.getNombreMedico());
        }

    }

    @Test
    public void testUpdate() throws DAOException {

        MedicoDAO medicoDAO = new MedicoDAO();

        Medico medicoTest = new Medico();
        medicoTest.setIdMedico(1);
        medicoTest.setRutMedico(179950901);
        medicoTest.setNombreMedico("Mauricio");
        medicoTest.setApellidoPaternoMedico("Gutierrez");
        medicoTest.setApellidoMaternoMedico("Ulloa");

        medicoDAO.update(medicoTest);
    }

    @Test
    public void testDelete() throws DAOException {

        MedicoDAO medicoDAO = new MedicoDAO();

        Medico medicoTest = new Medico();
        medicoTest.setIdMedico(2);

        medicoDAO.delete(medicoTest);
    }

}