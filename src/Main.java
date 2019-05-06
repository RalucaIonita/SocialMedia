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
            //Admin.getInstance().addUser(thisCrap);
            Admin.getInstance().searchByFirstName(thisCrap.getFirstName());
            Admin.getInstance().searchByLastName(thisCrap.getLastName());
            Admin.getInstance().searchByUsername(thisCrap.getUsername());
       //       Admin.getInstance().emptyDataBase();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}