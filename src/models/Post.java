package models;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.net.URL;
import java.util.Vector;

public class Post {

    private String description;
    private Image picture;
    private Vector<Comment> comments;
    private URL path;


    public Post(String description, URL path) throws IOException {
        this.description = description;
        this.path = path;
        this.picture = ImageIO.read(path);
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

    public Image getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }


    //Path

    public URL getPath() {
        return path;
    }

    public void setPath(URL path) {
        this.path = path;
    }


    //Buffering picture

    public Post bufferPicture() throws IOException
    {
        picture = ImageIO.read(path);
        return this;
    }
}
