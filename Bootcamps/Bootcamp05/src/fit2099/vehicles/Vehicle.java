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
    BidsManager bitMan1;

    //Constructor
    public Vehicle(String newMake, String newModel, int newModelYear) throws Exception{
        setMaker(newMake);
        setModel(newModel);
        setYear(newModelYear);
        this.vehicleId = Utils.nextID();

        if (setMaker(newMake) && setModel(newModel) && setYear((newModelYear))) {
            bitMan1 = new BidsManager();
            this.vehicleId = Utils.nextID();
        } else {
            throw new Exception("Incorrect Vehicle's Maker, Model or Make/Model Year ");
        }
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

    public boolean setYear(int newYear){
        boolean isValid = false;
        if (newYear >1000) {
            isValid = true;
            modelYear = newYear;
        }
        return isValid;
    }

    public boolean setMaker(String newMaker){
        boolean isValid = false;
        if (newMaker.length()>= 3 && newMaker.length()<=15) {
            isValid = true;
            make= newMaker;
        }
        return isValid;
    }

    public boolean setModel(String newModel){
        boolean isValid = false;
        if (newModel.length()>= 3 && newModel.length()<=15) {
            isValid = true;
            model= newModel;
        }
        return isValid;
    }

}
