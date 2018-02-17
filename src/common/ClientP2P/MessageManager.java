package common.ClientP2P;

import common.model.User;
import rmiclient.controller.Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageManager extends UnicastRemoteObject implements ClientInterfaceP2P {

    private Controller controller;
    public MessageManager() throws RemoteException {
        super();
        controller = Controller.getInstance();
    }
    @Override
    public void sendMessage(String message, User sender) throws RemoteException {
        controller.openChatForMessage(message, sender);
    }
}
