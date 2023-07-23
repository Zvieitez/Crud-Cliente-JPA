import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class AtualizarCliente {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        System.out.println("Informe o id do cliente a ser atualizado: ");
        cliente.setId(scanner.nextInt());
        System.out.println("Informe o novo nome do cliente: ");
        cliente.setNome(scanner.next());

        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
    }
}
