package gianmarte;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
        // Qui non metti @Id o @Entity. Qui scrivi il codice che USA quelle classi.

        System.out.println("avvio JPA...");

        // Assicurati che il nome qui sotto sia uguale a quello nel persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
        EntityManager em = emf.createEntityManager();
        System.out.println("Connessione riuscita!");

        em.close();
        emf.close();
    }
}