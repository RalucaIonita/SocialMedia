import java.io.IOException;

public class User extends Account
{
    private String firstName;
    private String lastName;
    private String email;


    private Profile profile;

    User()
    {
        this.firstName = new String();
        this.lastName = new String();
        this.email = new String();
        this.profile = new Profile();
    }

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


    public void addProfilePicture(String path) //get back to it
    {
       // vezi input, cauta in vector si apeleaza setter-ul de profile picture din profile
    }

    public void addPicture(Post newPost) throws IOException
    {
        profile.addPost(newPost);
        System.out.println("Merge");
    }

    public void addDescriptionToPicture(String description) //Asta momentan e bullshit, dar o sa fie ceva
    {
        //get some kind of input

        //set description to the image
    }



}
