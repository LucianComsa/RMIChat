package rmiserver;

import common.clientServer.ServerInterface;
import common.model.User;
import common.model.UserList;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain extends UnicastRemoteObject implements ServerInterface
{
    private UserList registeredUsers;
    protected ServerMain() throws RemoteException {
        super();
        registeredUsers = new UserList();
    }

    public static void main(String[] args)
    {
        try
        {
            Registry reg  = LocateRegistry.createRegistry(1099);
            ServerInterface rmiServer = new ServerMain();
            Naming.rebind("Server", rmiServer);
            System.out.println("Starting Server...");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public boolean RegisterUser(User toRegister) throws RemoteException {
        if(registeredUsers.getUserByName(toRegister.getName()) == null)
        {
            registeredUsers.addUser(toRegister);
            return true;
        }else
        {
            return false;
        }
    }

    @Override
    public void UnregisterUser(User toUnregister) throws RemoteException {
        registeredUsers.removeUser(toUnregister.getName());
    }

    @Override
    public UserList getOnlineUsers() throws RemoteException {
        return registeredUsers;
    }


}
