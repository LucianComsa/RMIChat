package common.ClientP2P;

import common.model.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterfaceP2P extends Remote {

    public void sendMessage(String message, User sender) throws RemoteException;
}
