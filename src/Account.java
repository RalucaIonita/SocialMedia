
public class Account
{
    //Data
    protected static Integer ID;
    protected String password;
    public String email;

    //Methods

    //Constructors
    Account() {};

    Account(int givenID, String givenEmail, String givenPassword)
    {
        ID = givenID;
        email = givenEmail;
        password = givenPassword;
    }
    Account(Account givenAccount)
    {
        ID = givenAccount.ID;
        email = givenAccount.email;
        password = givenAccount.password;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
