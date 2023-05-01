package unab.portafolio.model.medico;

import org.hibernate.Session;
import org.hibernate.query.Query;
import unab.portafolio.dao.DAO;
import unab.portafolio.dao.DAOException;
import unab.portafolio.singleton.HibernateUtility;

import java.util.List;

public class MedicoDAO extends DAO {

    //@Override
    public void insertar(Object o) throws DAOException {

    }

    //@Override
    public void modificar(Object o) throws DAOException {

    }

    //@Override
    public void eliminar(Object o) throws DAOException {

    }

    //@Override
    public List<Medico> obtenerTodos() throws DAOException {

        List<Medico> medicos = null;
        Session session = HibernateUtility.getSessionFactory().openSession();

        try {
            String query = "FROM Medico";
            Query q = session.createQuery(query);
            medicos = q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

        return medicos;
    }

    //@Override
    public Object obtener(Object id) throws DAOException {
        return null;
    }
}