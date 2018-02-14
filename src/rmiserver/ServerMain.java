package rmiserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain extends UnicastRemoteObject
{
    protected ServerMain() throws RemoteException {
        super();
    }

    public static void main(String[] args)
    {
        try
        {
            Registry reg  = LocateRegistry.createRegistry(1099);


        }catch (Exception e)
        {

        }
    }
}
