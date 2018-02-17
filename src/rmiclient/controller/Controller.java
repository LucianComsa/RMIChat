package rmiclient.controller;

import common.model.User;
import common.model.UserList;
import rmiclient.view.GUIChat;

import java.util.ArrayList;

public class Controller
{
    private UserList contacts;
    private User currentUser;
    private ArrayList<GUIChat> chatsList;
    public static Controller instance;

    private Controller()
    {
        contacts = new UserList();
        chatsList = new ArrayList<>();
    }
    public static Controller getInstance()
    {
        if(instance == null)
        {
            instance = new Controller();
        }
        return instance;
    }
    public void openChat(User contact)
    {
        //opens chat
    }
    public void openChatForMessage(String message, User sender)
    {
        GUIChat chat = null;
        for(int i =0 ;i < chatsList.size(); i++)
        {
            if(chatsList.get(i).getChatContact().equals(sender))
            {
               chat = chatsList.get(i);
               break;
            }
        }
        if(chat != null)
        {
            int counter = 5;
            while(!tryAppend(chat, message) && counter >0){counter--;}
        }else
        {
            //open new chat for sender(the argument)
            //add chat to the chat list
        }

    }
    private boolean tryAppend(GUIChat appendToThis, String message)
    {
        return appendToThis.appendMessage(message);
    }
    public void closeChat(User contact)
    {
        for(int i =0; i < chatsList.size(); i++)
        {
            if(contact.equals(chatsList.get(i).getChatContact()))
            {
                // close this chat
            }
        }
    }
    //instances of all the gui's
    //methods to open them
    //whatever else
}
