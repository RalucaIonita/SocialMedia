import java.sql.SQLException;

public class Account
{
    //Data
    protected static Integer ID;
    protected String password;
  //  protected String email;
    protected String username;

    //Methods

    //Constructors
    Account() {};


    Account(String givenUsername, String givenPassword)
    {
        username = givenUsername;
        password = givenPassword;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    Account(Account givenAccount)
    {
        ID = givenAccount.ID;
        password = givenAccount.password;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
