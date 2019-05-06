public class Comment {
    protected User owner;
    protected String content;


    //Owner

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    //Content

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
