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
            Admin.getInstance().addUser(thisCrap);
            Admin.getInstance().deleteUser(thisCrap);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}