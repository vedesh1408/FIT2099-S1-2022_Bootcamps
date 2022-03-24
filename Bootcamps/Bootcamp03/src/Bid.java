public class Bid {

    private int bidId;
    private Client client;
    private double price;
    private String bidDate;

    // Constructors
    public Bid(int bidId, Client client, double price, String bidDate) {
        this.bidId = bidId;
        this.client = client;
        this.price = price;
        this.bidDate = bidDate;
    }

    // setters and getters for each attributes
    public int getBidId() {
        return this.bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBidDate() {
        return this.bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }


}
