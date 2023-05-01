package medico;

import org.junit.Test;
import unab.portafolio.dao.DAOException;
import unab.portafolio.model.medico.Medico;
import unab.portafolio.model.medico.MedicoDAO;

import static org.junit.Assert.*;

public class MedicoDAOTest {

    @Test
    public void obtenerTodos() throws DAOException {

        MedicoDAO medico = new MedicoDAO();
        System.out.println(medico.obtenerTodos());

    }
}