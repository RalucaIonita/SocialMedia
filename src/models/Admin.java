package models;

import java.sql.SQLException;

public class Admin extends Account
{

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




    //webMethods.Methods

    public void addUser(User newUser) throws SQLException
    {
        DataBase.getInstance().insertUser(newUser);
    }

    public void deleteUser(User user) throws SQLException
    {
        DataBase.getInstance().deleteUser(user.getUsername());
        DataBase.getInstance().resetAutoIncrement();
    }

    public void changeAccountPassword(String newPassword, Account givenAccount) throws SQLException
    {
        DataBase.getInstance().updateUsers(newPassword, givenAccount.getUsername());
    }

    public void emptyDataBase() throws SQLException
    {
        DataBase.getInstance().emptyDataBase();
        DataBase.getInstance().resetAutoIncrement();
    }

    public Boolean searchByFirstName(String firstName) throws SQLException //Vector(?)
    {
        User resultedUser = DataBase.getInstance().selectByFirstName(firstName);
        if(resultedUser == null)
            return false;
        else
        {
            System.out.println(resultedUser.userToString()); //will not use sout in future versions
            return true; //gen, gasit
        }
    }

    public Boolean searchByLastName(String lastName) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectByLastName(lastName);
        if(resultedUser == null)
            return false;
        else
        {
            System.out.println(resultedUser.userToString()); //will not use sout in future versions
            return true; //gen, gasit
        }
    }

    public Boolean searchByUsername(String username) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectByUsername(username);
        if(resultedUser == null)
            return false;
        else
        {
            System.out.println(resultedUser.userToString()); //will not use sout in future versions
            return true; //gen, gasit
        }
    }

    public Boolean searchByID(Integer ID) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectUserByID(ID);
        if(resultedUser == null)
            return false;
        else
        {
            System.out.println(resultedUser.userToString()); //will not use sout in future versions
            return true; //gen, gasit
        }
    }

    public Boolean searchByEmail(String email) throws SQLException
    {
        User resultedUser = DataBase.getInstance().selectUserByEmail(email);
        if(resultedUser == null)
            return false;
        else
        {
            System.out.println(resultedUser.userToString()); //will not use sout in future versions
            return true; //gen, gasit
        }
    }

    public void checkDuplicateUsername(String username) throws SQLException
    {
        if(searchByUsername(username) != true)
        {
            System.out.println("Username is already in use. Try again:");
            //read some data
        }
    }

    public void checkDuplicateEmail(String email) throws SQLException
    {
        if(searchByEmail(email) != true)
        {
            System.out.println("Email is already in use. Try again:");
            //read some data
        }
    }



}
