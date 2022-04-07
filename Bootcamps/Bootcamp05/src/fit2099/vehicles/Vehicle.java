package fit2099.vehicles;

import fit2099.Utils;
import fit2099.bids.BidsManager;

/**
 * @author vedes
 * @version 1.0
 * @see "base class of types of vehicles"
 */
abstract public class Vehicle {

    // Private attributes
    private String make;
    private String model;
    private int modelYear;
    private int vehicleId;

    // instance of BidManager
    BidsManager bitMan1;

    //Constructor

    /**
     * constructor of vehicle class
     * @param newMake
     * @param newModel
     * @param newModelYear
     * @throws Exception
     */
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

    /**
     *
     * @return returns description of vehicles
     */
    public String description(){

        return ("MY" + modelYear + " ,Make:" + make + " ,Model:" + model + " ,Vehicle ID:" + vehicleId);

    }

    /**
     *
     * @return ID of vehicle
     */
    public int getVehicleId(){
        return vehicleId;
    }

    /**
     *
     * @return model of car
     */
    public String getModel(){
        return model;
    }

    /**
     *
     * @return make of car
     */
    public String getMake(){
        return make;
    }
    /**
     *
     * @return year in which vehicle was made
     */
    public int getModelYear(){return modelYear;}

    /**
     * add bid on a vehicle
     * @param clientId
     * @param bidPrice
     * @param bidDate
     */
    public void addBid(int clientId, double bidPrice, String bidDate){
        bitMan1.addBid(clientId,bidPrice,bidDate);
    }

    /**
     * set new year of manufacture
     * @param newYear
     * @return isValid : boolean variable to check if input is valid
     */
    public boolean setYear(int newYear){
        boolean isValid = false;
        if (newYear >1000) {
            isValid = true;
            modelYear = newYear;
        }
        return isValid;
    }

    /**
     *  set new maker of vehicle
     * @param newMaker
     * @return isValid : boolean variable to check if input is valid
     */
    public boolean setMaker(String newMaker){
        boolean isValid = false;
        if (newMaker.length()>= 3 && newMaker.length()<=15) {
            isValid = true;
            make= newMaker;
        }
        return isValid;
    }

    /**
     * set new model of car
     * @param newModel
     * @return isValid : boolean variable to check if input is valid
     */
    public boolean setModel(String newModel){
        boolean isValid = false;
        if (newModel.length()>= 3 && newModel.length()<=15) {
            isValid = true;
            model= newModel;
        }
        return isValid;
    }

}
