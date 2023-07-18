import java.rmi.*;
import java.rmi.registry.*;
public class SearchServer
{
    public static void main(String args[])
    {
        try
        {
            // Create an object of the interface
            // implementation class
            Search obj = new SearchQuery();
            System.setProperty("java.rmi.server.hostname", "192.168.29.41");
 
            // rmiregistry within the server JVM with
            // port number 1900
            LocateRegistry.createRegistry(1902);
 
            // Binds the remote object by the name
            // geeksforgeeks
            Naming.rebind("rmi://localhost:1902"+
                          "/geeksforgeeks",obj);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}