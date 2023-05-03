package unab.portafolio.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import unab.portafolio.singleton.HibernateUtility;

import java.util.List;

public abstract class DAO<T> {

    private String nombreModelo;
    public  String getNombreModelo() {
        return nombreModelo;
    }

    public boolean  create(T entidad) throws DAOException {

        boolean isCreated = false;

        Session session = HibernateUtility.getSessionFactory().openSession();

        try {

            session.beginTransaction();
            session.persist(entidad);
            session.getTransaction().commit();
            isCreated = true;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            session.close();
        }
        System.out.println(getNombreModelo() + " fue ingresado: " + isCreated);
        return isCreated;
    }

    public List<T> readAll() throws DAOException {

        List<T> entidades = null;
        Session session = HibernateUtility.getSessionFactory().openSession();


        try {
            String query = "FROM " + getNombreModelo();
            Query q = session.createQuery(query);
            entidades = q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

        return entidades;
    }

    public T readById(int id) throws DAOException {
        T entidad = null;
        Session session = HibernateUtility.getSessionFactory().openSession();

        try {

            String query = "FROM " + getNombreModelo() + " WHERE " + "VALUES =";
            Query q = session.createQuery(query);



            entidad = (T) session.get(getNombreModelo(), id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

        return entidad;
    }

    public boolean  update(T entidad) throws DAOException {

        boolean isModified = false;
        Session session = HibernateUtility.getSessionFactory().openSession();

        try {

            session.beginTransaction();
            session.merge(entidad);
            session.getTransaction().commit();
            isModified = true;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            session.close();
        }
        return isModified;
    }

    public boolean  delete(T entidad) throws DAOException {

        boolean isDeleted = false;
        Session session = HibernateUtility.getSessionFactory().openSession();

        try {

            session.beginTransaction();
            session.remove(entidad);
            session.getTransaction().commit();
            isDeleted = true;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            session.close();
        }
        System.out.println(getNombreModelo() + " fue eliminado: " + isDeleted);
        return isDeleted;
    }


}

