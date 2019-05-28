package models;

import java.sql.SQLException;

public class Account
{
    //Data
    protected Integer ID;
    protected String password;
    protected String username;

    //webMethods.Methods

    //Constructors
    Account()
    {};


    Account(Integer ID, String givenUsername, String givenPassword)
    {
        this.ID = ID;
        username = givenUsername;
        password = givenPassword;
    }

    Account(String givenUsername, String givenPassword)
    {
        username = givenUsername;
        password = givenPassword;
    }

    Account(Account givenAccount)
    {
        ID = givenAccount.ID;
        password = givenAccount.password;
    }


    //Username

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    //ID

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

//    public Integer getTableID() throws SQLException
//    { }

    //Password

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
