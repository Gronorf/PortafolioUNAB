package unab.portafolio.singleton;

import org.junit.Test;
import org.hibernate.SessionFactory;


public class HibernateUtilityTest {

    // TEST DE CONEXION SINGLETON.
    @Test
    public void getSessionFactory() {

        SessionFactory sessionFactory1 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 1 : " + sessionFactory1.hashCode());

        SessionFactory sessionFactory2 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 2 : " + sessionFactory2.hashCode());

        SessionFactory sessionFactory3 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 3 : " + sessionFactory3.hashCode());

        SessionFactory sessionFactory4 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 3 : " + sessionFactory3.hashCode());

        SessionFactory sessionFactory5 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 3 : " + sessionFactory3.hashCode());
    }
}