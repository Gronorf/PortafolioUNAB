import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import unab.portafolio.model.medico.Medico;

public class Main {
    public static void main(String[] args) {

        Medico medicoTest = new Medico();
        medicoTest.setRutMedico(123);
        medicoTest.setNombreMedico("la fran");
        medicoTest.setApellidoPaternoMedico("Bettoli");
        medicoTest.setApellidoMaternoMedico("Pizzagalli");


        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Medico.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(medicoTest);

            session.getTransaction().commit();
        }
    }
}