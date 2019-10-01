import java.rmi.*;

public class ClientHello {
    public static void main(String args[]) {
        try {
            Hello h = (Hello) Naming.lookup("objecthello");
            String messageRecu = h.ditBonjour();
            System.out.println(messageRecu);
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}
