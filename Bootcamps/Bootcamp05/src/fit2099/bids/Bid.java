package fit2099.bids;

/**
 * @author vedes
 * @version 1.0
 * @see "The class Bid has all the attributes needed for a client to create a bid"
 */
public class Bid {

    private int bidId;
    private double price;
    private String bidDate;
    private int clientId;

    // Constructors

    /**
     * Constructor to create new bid
     * @param bidId : ID of bid
     * @param client :Client ID
     * @param price : Bid price
     * @param bidDate : Bid date
     *
     */
    public Bid(int bidId, int client, double price, String bidDate) {
        this.bidId = bidId;
        this.clientId = client;
        this.price = price;
        this.bidDate = bidDate;
    }

    // setters and getters for each attributes

    /**
     * returns bid ID
     * @return ID of the Bid
     */
    public int getBidId() {
        return bidId;
    }

    /**
     * method to set a new Bid
     * @param bidId new BidID
     *
     */
    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    /**
     * method to return client ID
     * @return clientId
     */
    public int getClient() {
        return clientId;
    }

    /**
     * method to set new client
     * @param client - new client
     */
    public void setClient(int client) {
        this.clientId = client;
    }

    /**
     * method to return bid price
     * @return price : the bid price
     */
    public double getPrice() {
        return price;
    }

    /**
     * method to set new price
     * @param price : new bid price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * method to return bid date
     * @return bidDate - date on which bid was placed
     */
    public String getBidDate() {
        return bidDate;
    }

    /**
     * method to set new bid date
     * @param bidDate
     */
    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }


}
