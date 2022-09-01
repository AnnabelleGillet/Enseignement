import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.net.*;
import java.rmi.*;

public class ImpServeurHello extends UnicastRemoteObject implements Hello {
    public ImpServeurHello() throws RemoteException {
        super();
    }
    
    public String ditBonjour() throws RemoteException {
        return "Bonjour à tous.";
    }
    
    public static void main(String args[]) {
        try {
            ImpServeurHello s = new ImpServeurHello();
            String nom = "objecthello";
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind(nom, s); // enregistrement
            System.out.println("Serveur enregistré.");
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}
