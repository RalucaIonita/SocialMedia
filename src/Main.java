public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Hello World!");
        User thisCrap = new User("this", "this", "this", "this", "this");
        try
        {
            DataBase.getInstance().addAdmin(); //Alooo, nenea Adminu'. Sunteti prea fancy sa intrati in db?
            Admin.addUser(thisCrap);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}