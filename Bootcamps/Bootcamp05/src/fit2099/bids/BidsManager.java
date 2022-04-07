package fit2099.bids;

import fit2099.Utils;

import java.util.HashMap;

/**
 * @author vedes
 * @version  1.0
 * @see "class that sorts bid of each clients on each vehicles"
 */
public class BidsManager {
    HashMap<Integer, Bid> bidList;

    /**
     * method to create new hashmap to store bids
     */
    public BidsManager(){
        bidList = new HashMap<>();
    }

    /**
     * method to add bit to hashmap
     * @param clientID : ID of client
     * @param bidPrice : Bid price
     * @param bidDate : date on which bid was placed
     */
    public void addBid(int clientID, double bidPrice, String bidDate){
        Bid b1 = new Bid(Utils.nextID(),clientID,bidPrice,bidDate);
        bidList.put(clientID,b1);
    }



}