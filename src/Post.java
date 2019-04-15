import java.util.Vector;

public class Post {

    protected String description;
    //imagine (?)
    protected Vector<Comment> comments;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vector<Comment> getComments() {
        return comments;
    }

    public void setComments(Vector<Comment> comments) {
        this.comments = comments;
    }
}
