import java.util.ArrayList;

public class Car {

    // Private attributes
    private String make;
    private String model;
    private int modelYear;


    ArrayList<Bid> bids = new ArrayList<Bid>();


    //Constructor
    public Car(String newMake, String newModel, int newModelYear){
        this.make = newMake;
        this.model=newModel;
        this.modelYear=newModelYear;
    }
    //Methods

    public String description(){

        return ("MY" + modelYear + " " + make + " " + model);

    }

    //Task 6
    public void addBid(Client newClient, double price, String date) {
        Bid carBid = new Bid(Utils.nextID(), newClient, price, date);
        bids.add(carBid);
    }

    public ArrayList<Bid> getBids(){
        return bids;
    }


}
