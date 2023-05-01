package unab.portafolio.dao;

import java.util.List;

public interface DAO<T, K> {
    void insertar(T t) throws DAOException;

    void modificar(T t) throws DAOException;

    void eliminar(T t) throws DAOException;

    List<T> obtenerTodos() throws DAOException;

    T obtener(K id) throws DAOException;
}

