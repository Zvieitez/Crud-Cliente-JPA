import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class ListarCliente {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente cliente = em.find(Cliente.class, 3);
        System.out.println(" O nome do cliente é: " + cliente.getNome());
    }
}
