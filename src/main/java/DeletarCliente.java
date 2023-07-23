import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class DeletarCliente {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o nome do id a ser excluído: ");
        Cliente cliente = em.find(Cliente.class, scanner.nextInt());

        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
    }
}