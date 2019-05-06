import java.util.Vector;

public class Network
{
    Integer usersIDVector[];
    Byte adiacencyMatrix[][];
    Integer size;

    Network() //This crap needs to be singleton too
    {
        //size = ID;
        adiacencyMatrix = new Byte[size][size];

        //Initialization with 0
        for(int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                adiacencyMatrix[i][j] = 0;


        for(int i = 0; i < size; i++) //Might need to get rid of this thingy (might)
        {
            usersIDVector[i] = i + 1;
        }
    }

    void addNewFriendRelationship(User firstUser, User secondUser)
    {
        if(adiacencyMatrix[firstUser.getID()][secondUser.getID()] == 0)
            adiacencyMatrix[firstUser.getID()][secondUser.getID()] = 1;
    }

    void removeFriendRelationship(User firstUser, User secondUser)
    {
        if(adiacencyMatrix[firstUser.getID()][secondUser.getID()] == 1)
            adiacencyMatrix[firstUser.getID()][secondUser.getID()] = 0;
    }

}
