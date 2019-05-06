import java.awt.image.BufferedImage;
import java.util.Vector;

public class Profile {

    private User user;
    private Post profilePicture;
    private Vector<Post> album;

    //Album

    public Vector<Post> getAlbum() {
        return album;
    }

    public void setAlbum(Vector<Post> album) {
        this.album = album;
    }


    //User

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    //Profile picture

    public Post getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Post profilePicture) {
        this.profilePicture = profilePicture;
    }

}