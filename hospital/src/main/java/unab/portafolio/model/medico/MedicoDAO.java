package unab.portafolio.model.medico;

import org.hibernate.Session;
import org.hibernate.query.Query;
import unab.portafolio.dao.DAO;
import unab.portafolio.dao.DAOException;
import unab.portafolio.singleton.HibernateUtility;

import java.util.List;

public class MedicoDAO extends DAO<Medico> {
    @Override
    public String getNombreModelo() {
        return "Medico";
    }
}