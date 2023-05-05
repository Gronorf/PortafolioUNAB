package unab.portafolio.model.medico;

import unab.portafolio.dao.DAOException;

import java.util.List;

public class MedicoDAOImpl extends MedicoDAO {
    @Override
    public boolean create(Medico entidad) throws DAOException {
        return super.create(entidad);
    }

    @Override
    public List<Medico> readAll() throws DAOException {
        return super.readAll();
    }

    @Override
    public boolean update(Medico entidad) throws DAOException {
        return super.update(entidad);
    }

    @Override
    public boolean delete(Medico entidad) throws DAOException {
        return super.delete(entidad);
    }

    @Override
    public Medico readId(int id) throws DAOException {
        return super.readId(id);
    }
}
