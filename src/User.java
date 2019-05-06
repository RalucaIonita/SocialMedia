public class User extends Account
{
    private String firstName;
    private String lastName;
    private String email;


    protected Profile profile;


    public User(String email, String password, String firstName, String lastName, String username)
    {
        super(username, password);
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //First name

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }


    //Last name

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    //Email

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    //Profile

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }


    //To String

    public String userToString()
    {
        String result = email + " "+ firstName + " " + lastName;
        return result;
    }



    public void addDescriptionToPicture(String description) //Asta momentan e bullshit, dar o sa fie ceva
    {
        //get some kind of input

        //set description to the image
    }

}
