import java.awt.image.BufferedImage;
import java.sql.SQLException;

class Admin extends Account
{
    //private DataBase dataBase;
    protected Network network;

    private static Admin adminInstance;

    private Admin()
    {
        password = "admin";
        username = "admin";
    }

    public static Admin getInstance()
    {
        if(adminInstance == null)
        {
            adminInstance = new Admin();
        }
        return adminInstance;
    }




    //Methods

    public void addUser(User newUser) throws SQLException
    {
        DataBase.getInstance().insert(newUser);
    }

    public void deleteUser(User user) throws SQLException
    {
        DataBase.getInstance().delete(user.getUsername());
        DataBase.getInstance().resetAutoIncrement();
    }

    public void changeAccountPassword(String newPassword, Account givenAccount) throws SQLException
    {
        DataBase.getInstance().updateTableForPasswordChange(newPassword, givenAccount.getUsername());
    }

    public void emptyDataBase() throws SQLException
    {
        DataBase.getInstance().emptyDataBase();
        DataBase.getInstance().resetAutoIncrement();
    }

    public void searchByFirstName(String firstName) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectByFirstName(firstName);
        System.out.println(resultedUser.userToString()); //will not use sout in future versions
    }

    public void searchByLastName(String lastName) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectByLastName(lastName);
        System.out.println(resultedUser.userToString()); //will not use sout in future versions
    }

    public void searchByUsername(String username) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectByUsername(username);
        System.out.println(resultedUser.userToString()); //will not use sout in future versions
    }

    public void searchByID(Integer ID) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectByID(ID);
        System.out.println(resultedUser.userToString()); //will not use sout in future versions
    }

}
