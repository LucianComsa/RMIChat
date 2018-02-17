package common.clientServer;

import common.model.User;
import common.model.UserList;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote
{
    public boolean RegisterUser(User toRegister) throws RemoteException;
    public void UnregisterUser(User toUnregister) throws RemoteException;
    public UserList getOnlineUsers() throws RemoteException;

}
