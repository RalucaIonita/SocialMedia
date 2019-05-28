//import models.Admin;
//import models.DataBase;
//import models.User;

import models.*;

import java.net.URL;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Hello World!");
        User thisCrap = new User("this", "this", "this", "this", "this");
        try
        {
            DataBase.getInstance().addAdmin();
            Admin.getInstance().addUser(thisCrap);
            //models.Admin.getInstance().addUser(thisCrap);
            Admin.getInstance().searchByFirstName(thisCrap.getFirstName());
            Admin.getInstance().searchByLastName(thisCrap.getLastName());
            Admin.getInstance().searchByUsername("banane");
            Admin.getInstance().changeAccountPassword("banane", thisCrap);


            User newCrap = new User("email", "password", "firstName", "lastName", "username");
            Admin.getInstance().addUser(newCrap);

            FriendRequest smth = new FriendRequest(thisCrap, newCrap);

            smth.addFriendRequest();



            //Admin.getInstance().emptyDataBase();
            DataBase.getInstance().closeConnection();
            URL newURL = new URL("https://www.google.ro/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&ved=&url=https%3A%2F%2Fqz.com%2F1269997%2Fscientists-puzzled-by-pandas-black-eye-patches-turning-white%2F&psig=AOvVaw1zBtgM_wqFxUYX1mqTbKvf&ust=1557270015269727");
          //  models.Post newPost = new models.Post("smth", newURL);
          //  thisCrap.addPicture(newPost);
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}