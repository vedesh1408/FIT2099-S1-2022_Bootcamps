import java.util.HashMap;

public class BidsManager {
    HashMap<Integer, Bid> bidList;

    public BidsManager(){
        bidList = new HashMap<>();
    }

    public void addBit (int clientID, double bidPrice, String bidDate){
        Client c1 = new Client(clientID);
        Bid b1 = new Bid(Utils.nextID(),c1,bidPrice,bidDate);
        bidList.put(clientID,b1);
    }



}