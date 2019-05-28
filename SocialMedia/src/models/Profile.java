package models;

import java.io.IOException;
import java.util.Vector;

public class Profile {

    //private models.User user;
    private Post profilePicture;
    private Vector<Post> album;

    Profile()
    {
//        profilePicture = new models.Post();
//        album = new Vector<>();
    }

    //Album

    public Vector<Post> getAlbum() {
        return album;
    }

    public void setAlbum(Vector<Post> album) {
        this.album = album;
    }


    //models.Profile picture

    public Post getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Post profilePicture) {
        this.profilePicture = profilePicture;
    }


    //Adding pictures
    public void addPost(Post newPost)
    {
        album.add(newPost);
    }
}