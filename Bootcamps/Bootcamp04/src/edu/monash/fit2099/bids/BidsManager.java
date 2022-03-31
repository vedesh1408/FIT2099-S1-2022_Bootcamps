package edu.monash.fit2099.bids;

import edu.monash.fit2099.Utils;

import java.util.HashMap;

public class BidsManager {
    HashMap<Integer, Bid> bidList;

    public BidsManager(){
        bidList = new HashMap<>();
    }

    public void addBid(int clientID, double bidPrice, String bidDate){
        Bid b1 = new Bid(Utils.nextID(),clientID,bidPrice,bidDate);
        bidList.put(clientID,b1);
    }



}