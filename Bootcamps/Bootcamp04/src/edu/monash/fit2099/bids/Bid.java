package edu.monash.fit2099.bids;

public class Bid {

    private int bidId;

    private double price;
    private String bidDate;
    private int clientId;

    // Constructors
    public Bid(int bidId, int client, double price, String bidDate) {
        this.bidId = bidId;
        this.clientId = client;
        this.price = price;
        this.bidDate = bidDate;
    }

    // setters and getters for each attributes
    public int getBidId() {
        return bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public int getClient() {
        return clientId;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }


}
