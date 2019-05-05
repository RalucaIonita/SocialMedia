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




    //methods
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
}
