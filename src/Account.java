
public class Account
{
    //Data
    private static Integer ID;
    protected String password;
    protected String username;

    //Methods

    //Constructors
    Account() {};


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


    //Password

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
