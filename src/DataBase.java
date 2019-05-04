import java.sql.*;

public class DataBase
{
    private Connection dataBaseConnection;

    private static DataBase instance;

    //

    private DataBase() throws SQLException
    {
        dataBaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media?autoReconnect=true&useSSL=false", "root", "");
    }

    public static DataBase getInstance() throws SQLException
    {
        if(instance == null)
        {
            instance = new DataBase();
        }
        return instance;
    }

    //

    public void insert(User newUser) throws SQLException
    {
       PreparedStatement thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("INSERT INTO accounts (first_name, last_name, email, username, password) values (?, ?, ?, ?, ?)");
       thisStatement.setString(1, newUser.getFirstName());
       thisStatement.setString(2, newUser.getLastName());
       thisStatement.setString(3, "this");//newUser.getEmail());
       thisStatement.setString(4, newUser.getUsername());
       thisStatement.setString(5, newUser.getPassword());

       thisStatement.executeUpdate();
    }

    public void delete(String givenUsername) throws SQLException
    {
        PreparedStatement thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("DELETE FROM accounts WHERE username = givenUsername; ");
        thisStatement.executeUpdate();
    }

    public User selectByUsername(String givenUsername) throws SQLException
    {
        User resultedAccount = null;
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE username = ?");
        thisStatement.setString(1,givenUsername);
        ResultSet result = thisStatement.executeQuery();
        while(result.next())
        {
            resultedAccount = new User(result.getString("email"), result.getString("password"), result.getString("first_name"), result.getString("last_name"), result.getString("username"));
        }
        return resultedAccount;
    }

    public void selectByFirstName(String givenFirstName) throws SQLException
    {
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE first_name = ?");
        thisStatement.setString(1, givenFirstName);
        ResultSet result = thisStatement.executeQuery();
    }

    public void selectByLastName(String givenLastName) throws SQLException
    {
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE last_name = ?");
        thisStatement.setString(1, givenLastName);
        ResultSet result = thisStatement.executeQuery();
    }


    public void alterTableForPasswordChange(String newPassword, String username) throws SQLException
    {
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("UPDATE accounts SET password = ? WHERE username = ?");
        thisStatement.setString(1, newPassword);
        thisStatement.setString(2, username);
        thisStatement.executeUpdate();
    }

    public void addAdmin() throws SQLException
    {
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE id = 0");
            thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("INSERT INTO accounts (username, password) values (?, ?)");
            thisStatement.setString(1, "admin");
            thisStatement.setString(2, "admin");
          //  thisStatement.setString(3, "admin@admin.com");

            thisStatement.executeUpdate();
    }

}
