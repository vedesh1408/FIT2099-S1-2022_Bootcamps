import java.util.ArrayList;

abstract public class Vehicle {

    // Private attributes
    private String make;
    private String model;
    private int modelYear;
    private int vehicleId;
    // instance of BidManager
    BidsManager bitMan1;



    //Constructor
    public Vehicle(String newMake, String newModel, int newModelYear){
        this.make = newMake;
        this.model=newModel;
        this.modelYear=newModelYear;
        this.vehicleId = Utils.nextID();
    }
    public Vehicle(String newMake, String newModel, int newModelYear, int newVehicleId){
        this.make = newMake;
        this.model=newModel;
        this.modelYear=newModelYear;
        this.vehicleId = newVehicleId;
    }
    //Methods

    public String description(){

        return ("MY" + modelYear + " " + make + " " + model);

    }

    //Task 6
//    public void addBid(Client newClient, double price, String date) {
//        Bid carBid = new Bid(Utils.nextID(), newClient, price, date);
//        bids.add(carBid);
//
//    }
//    public ArrayList<Bid> getBids(){
//        return bids;
//    }


}
