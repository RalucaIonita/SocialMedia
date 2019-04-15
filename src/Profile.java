import java.util.Vector;

public class Profile {

    protected String lastName;
    protected String firstName;

    protected Vector<Post> album;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Vector<Post> getAlbum() {
        return album;
    }

    public void setAlbum(Vector<Post> album) {
        this.album = album;
    }
}