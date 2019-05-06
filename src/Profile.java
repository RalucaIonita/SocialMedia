import java.io.IOException;
import java.util.Vector;

public class Profile {

    //private User user;
    private Post profilePicture;
    private Vector<Post> album;

    Profile()
    {
        profilePicture = new Post();
        album = new Vector<>();
    }

    //Album

    public Vector<Post> getAlbum() {
        return album;
    }

    public void setAlbum(Vector<Post> album) {
        this.album = album;
    }


    //Profile picture

    public Post getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Post profilePicture) {
        this.profilePicture = profilePicture;
    }


    //Adding pictures
    public void addPost(Post newPost) throws IOException
    {
        album.add(newPost);
    }
}