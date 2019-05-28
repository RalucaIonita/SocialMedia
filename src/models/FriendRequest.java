package models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FriendRequest {
    private User sender;
    private User receiver;

    public FriendRequest(User sender, User receiver)
    {
        this.sender = sender;
        this.receiver = receiver;
    }

    public void deleteFriendRequest() throws SQLException
    {
        //check if friend request was answered, then delete the entry
        PreparedStatement thisStatement = DataBase.getInstance().getDataBaseConnection().prepareStatement("DELETE FROM friend_requests WHERE receiverID = ? and senderID = ?");
        thisStatement.setInt(1, this.receiver.getID());
        thisStatement.setInt(2, this.sender.getID());

        thisStatement.executeUpdate();
    }

    public void addFriendRequest() throws SQLException
    {

        PreparedStatement thisStatement = DataBase.getInstance().getDataBaseConnection().prepareStatement("INSERT INTO friend_requests (receiverID, senderID) values (?, ?)");
        thisStatement.setInt(1, DataBase.getInstance().selectByUsername(receiver.getUsername()).getID());
        thisStatement.setInt(2, DataBase.getInstance().selectByUsername(sender.getUsername()).getID());
        thisStatement.executeUpdate();
    }

}
