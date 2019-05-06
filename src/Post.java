import java.awt.image.BufferedImage;
import java.util.Vector;

public class Post {

    private String description;
    private BufferedImage picture;
    private Vector<Comment> comments;


    //Description

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    //Comments

    public Vector<Comment> getComments() {
        return comments;
    }

    public void setComments(Vector<Comment> comments) {
        this.comments = comments;
    }


    //Images

    public BufferedImage getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }
}
