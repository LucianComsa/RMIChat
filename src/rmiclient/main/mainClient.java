package rmiclient.main;

import common.model.User;
import rmiclient.view.GUIChat;

public class mainClient {

    public static void main(String[] args)
    {
        GUIChat chat = new GUIChat(new User());
        chat.show();
    }
}
