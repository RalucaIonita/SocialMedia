import java.util.Vector;

public class Profile {

    private User user;
    private Vector<Post> album;


    public Vector<Post> getAlbum() {
        return album;
    }

    public void setAlbum(Vector<Post> album) {
        this.album = album;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}