package unab.portafolio.model.usuario;

import unab.portafolio.dao.DAOException;

import java.util.List;

public class UsuarioDAOImpl extends UsuarioDAO {
    @Override
    public boolean create(Usuario entidad) throws DAOException {
        return super.create(entidad);
    }

    @Override
    public List<Usuario> readAll() throws DAOException {
        return super.readAll();
    }

    @Override
    public boolean update(Usuario entidad) throws DAOException {
        return super.update(entidad);
    }

    @Override
    public boolean delete(Usuario entidad) throws DAOException {
        return super.delete(entidad);
    }

    @Override
    public Usuario readId(int id) throws DAOException {
        return super.readId(id);
    }
}
