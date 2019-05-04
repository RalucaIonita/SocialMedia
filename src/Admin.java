import java.sql.SQLException;

class Admin extends Account
{
 // private DataBase dataBase;
    protected Network network;

    private static Admin adminInstance;

    private Admin() throws SQLException //take care of this shit
    {
        adminInstance.password = "admin";
        adminInstance.username = "admin";
    }

    public static Admin getIntance() throws SQLException //and this shit
    {
        if(adminInstance == null)
        {
            adminInstance = new Admin();
        }

        return adminInstance;
    }




    //methods
    public static void addUser(User newUser) throws SQLException
    {
        DataBase.getInstance().insert(newUser);
    }

    public void deleteUser(String username) throws SQLException
    {
        DataBase.getInstance().delete(username);
    }

    public void changeAccountPassword(String newPassword, Account givenAccount) throws SQLException
    {
        DataBase.getInstance().alterTableForPasswordChange(newPassword, givenAccount.username);
        changeAccountPassword(newPassword, givenAccount);
    }

}
