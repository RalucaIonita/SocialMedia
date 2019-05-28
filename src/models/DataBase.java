package models;

import java.sql.*;

public class DataBase
{
    private Connection dataBaseConnection;

    private static DataBase dataBaseInstance;


    private DataBase() throws SQLException
    {
        dataBaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media?autoReconnect=true&useSSL=false", "root", "");
    }

    public static DataBase getInstance() throws SQLException
    {
        if(dataBaseInstance == null)
        {
            dataBaseInstance = new DataBase();
        }
        return dataBaseInstance;
    }

    public Connection getDataBaseConnection() {
        return dataBaseConnection;
    }

    //webMethods.Methods

    public void insertUser(User newUser) throws SQLException
    {
       PreparedStatement thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("INSERT INTO accounts (first_name, last_name, email, username, password) values (?, ?, ?, ?, ?)");
       thisStatement.setString(1, newUser.getFirstName());
       thisStatement.setString(2, newUser.getLastName());
       thisStatement.setString(3, newUser.getEmail());
       thisStatement.setString(4, newUser.getUsername());
       thisStatement.setString(5, newUser.getPassword());

       thisStatement.executeUpdate();
    }

    public void deleteUser(String username) throws SQLException
    {
        PreparedStatement thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("DELETE FROM accounts WHERE username = ?");
        thisStatement.setString(1, username);
        thisStatement.executeUpdate();
    }

    public User selectByUsername(String username) throws SQLException
    {
        User resultedAccount = null;
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE username = ?");
        thisStatement.setString(1, username);
        ResultSet result = thisStatement.executeQuery();
        while(result.next())
        {
            resultedAccount = new User(result.getInt("ID"),result.getString("email"), result.getString("password"), result.getString("first_name"), result.getString("last_name"), result.getString("username"));
        }
        return resultedAccount;
    }

    public User selectByFirstName(String firstName) throws SQLException
    {
        User resultedUser = null;
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE first_name = ?");
        thisStatement.setString(1, firstName);
        ResultSet result = thisStatement.executeQuery();
        while(result.next())
        {
            resultedUser = new User(result.getInt("ID"), result.getString("email"), result.getString("password"), result.getString("first_name"), result.getString("last_name"), result.getString("username"));
        }
        return resultedUser;
    }

    public User selectByLastName(String lastName) throws SQLException
    {
        User resultedUser = null;
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE last_name = ?");
        thisStatement.setString(1, lastName);
        ResultSet result = thisStatement.executeQuery();
        while(result.next())
        {
            resultedUser = new User(result.getInt("ID"), result.getString("email"), result.getString("password"), result.getString("first_name"), result.getString("last_name"), result.getString("username"));
        }
        return resultedUser;
    }

    public User selectUserByID(Integer ID) throws SQLException
    {
        User resultedUser = null;
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE ID = ?");
        thisStatement.setInt(1, ID);
        ResultSet result = thisStatement.executeQuery();
        while(result.next())
        {
            resultedUser = new User(result.getInt("ID"), result.getString("email"), result.getString("password"), result.getString("first_name"), result.getString("last_name"), result.getString("username"));
        }
        return resultedUser;
    }

    public User selectUserByEmail(String email) throws SQLException
    {
        User resultedUser = null;
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT * from accounts WHERE email = ?");
        thisStatement.setString(1, email);
        ResultSet result = thisStatement.executeQuery();
        while(result.next())
        {
            resultedUser = new User(result.getString("email"), result.getString("password"), result.getString("first_name"), result.getString("last_name"), result.getString("username"));
        }
        return resultedUser;
    }

    public void updateUsers(String newPassword, String username) throws SQLException
    {
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("UPDATE accounts SET password = ? WHERE username = ?");
        thisStatement.setString(1, newPassword);
        thisStatement.setString(2, username);
        thisStatement.executeUpdate();
    }

    public void addAdmin() throws SQLException
    {
            PreparedStatement thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("INSERT INTO accounts (username, password) values (?, ?)");
            thisStatement.setString(1, Admin.getInstance().getUsername());
            thisStatement.setString(2, Admin.getInstance().getPassword());

            thisStatement.executeUpdate();
    }

    public void resetAutoIncrement() throws SQLException
    {
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SET @number := 0");
        thisStatement.executeUpdate();

        thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("UPDATE accounts SET ID = @number := (@number + 1)");
        thisStatement.executeUpdate();

        thisStatement = DataBase.getInstance().dataBaseConnection.prepareStatement("ALTER TABLE accounts AUTO_INCREMENT =1");
        thisStatement.executeUpdate();
    }

    public void emptyDataBase() throws SQLException
    {
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("DELETE FROM accounts");
        thisStatement.executeUpdate();
    }


    //  posts


    // photos



    // comments


    //friendships

    public Boolean selectFriendshipByUserID(Integer ID) throws SQLException
    {
        //Integer result = null;
        PreparedStatement thisStatement = dataBaseConnection.prepareStatement("SELECT friendship from friendships WHERE ID = ?");
        thisStatement.setInt(1, ID);
        ResultSet result = thisStatement.executeQuery();
        if(result != null)
            return true;
        else
            return false;
    }











    public void closeConnection() throws SQLException
    {
        dataBaseConnection.close();
    }
}
