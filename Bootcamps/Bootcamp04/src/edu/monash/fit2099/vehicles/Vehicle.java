package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.BidsManager;
import edu.monash.fit2099.Utils;

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
//    public void addBid(edu.monash.fit2099.clients.Client newClient, double price, String date) {
//        edu.monash.fit2099.bids.Bid carBid = new edu.monash.fit2099.bids.Bid(edu.monash.fit2099.Utils.nextID(), newClient, price, date);
//        bids.add(carBid);
//
//    }
//    public ArrayList<edu.monash.fit2099.bids.Bid> getBids(){
//        return bids;
//    }


}
