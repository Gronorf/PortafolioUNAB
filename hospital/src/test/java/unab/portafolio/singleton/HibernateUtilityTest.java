package unab.portafolio.singleton;

import org.junit.Test;
import org.hibernate.SessionFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class HibernateUtilityTest {

    // TEST DE CONEXION SINGLETON.
    @Test
    public void getSessionFactory() {
        SessionFactory sessionFactory1 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 1: " + sessionFactory1.hashCode());

        SessionFactory sessionFactory2 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 2: " + sessionFactory2.hashCode());

        SessionFactory sessionFactory3 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 3: " + sessionFactory3.hashCode());

        SessionFactory sessionFactory4 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 4: " + sessionFactory4.hashCode());

        SessionFactory sessionFactory5 = HibernateUtility.getSessionFactory();
        System.out.println("Session Factory 5: " + sessionFactory5.hashCode());

        assertEquals(sessionFactory1.hashCode(), sessionFactory2.hashCode());
        assertEquals(sessionFactory1.hashCode(), sessionFactory3.hashCode());
        assertEquals(sessionFactory1.hashCode(), sessionFactory4.hashCode());
        assertEquals(sessionFactory1.hashCode(), sessionFactory5.hashCode());
        assertEquals(sessionFactory2.hashCode(), sessionFactory3.hashCode());
        assertEquals(sessionFactory2.hashCode(), sessionFactory4.hashCode());
        assertEquals(sessionFactory2.hashCode(), sessionFactory5.hashCode());
        assertEquals(sessionFactory3.hashCode(), sessionFactory4.hashCode());
        assertEquals(sessionFactory3.hashCode(), sessionFactory5.hashCode());
        assertEquals(sessionFactory4.hashCode(), sessionFactory5.hashCode());
    }

}