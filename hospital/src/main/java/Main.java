import jakarta.persistence.*;
import unab.portafolio.model.Medico;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Medico medicoTest = new Medico();
            medicoTest.setRutMedico(123);
            medicoTest.setNombreMedico("Fran");
            medicoTest.setApellidoPaternoMedico("Bettoli");
            medicoTest.setApellidoMaternoMedico("Pizzagalli");
            entityManager.persist(medicoTest);

            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
