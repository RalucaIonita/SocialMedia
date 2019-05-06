import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class Post {

    private String description;
    private BufferedImage picture;
    private Vector<Comment> comments;
    private String path;

    public Post(String description, String path) throws IOException {
        this.description = description;
        this.path = path;
        this.picture = ImageIO.read(new File(path));
    }

    Post(){};

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


    //Path

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    //Buffering picture

    public Post bufferPicture() throws IOException
    {
        picture = ImageIO.read(new File(path));
        return this;
    }
}
