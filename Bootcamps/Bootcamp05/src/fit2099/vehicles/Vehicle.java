package fit2099.vehicles;

import fit2099.Utils;
import fit2099.bids.BidsManager;

abstract public class Vehicle {

    // Private attributes
    private String make;
    private String model;
    private int modelYear;
    private int vehicleId;

    // instance of BidManager
    BidsManager bitMan1 = new BidsManager();

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

        return ("MY" + modelYear + " ,Make:" + make + " ,Model:" + model + " ,Vehicle ID:" + vehicleId);

    }

    public int getVehicleId(){
        return vehicleId;
    }

    public int getModelYear(){return modelYear;}
    public void addBid(int clientId, double bidPrice, String bidDate){
        bitMan1.addBid(clientId,bidPrice,bidDate);
    }


}
