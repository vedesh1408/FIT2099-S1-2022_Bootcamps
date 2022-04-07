package fit2099.taxation;
import fit2099.vehicles.TaxableVehicle;
import fit2099.vehicles.Vehicle;

import java.util.ArrayList;

/**
 * @author vedes
 * @version 1.0
 */
public class TaxationManager {
    private ArrayList<TaxableVehicle> taxableVehicleList;

    private static TaxationManager instance;

    /**
     * creates new arrayList of type Taxablevehicle
     */
    private TaxationManager() { // 1-  private to prevent anyone else from instantiating
        taxableVehicleList = new ArrayList<>();
    }

    /**
     *  creates new instances of TaxationManager if non is found
     * @return instance
     */
    public static TaxationManager getInstance() {
        if (instance == null) {
            instance = new TaxationManager();
        }
        return instance;
    }

    /**
     * append new items to the array list
     * @param item : instance of type TaxableVehicle
     */
    public void appendTaxableItem(TaxableVehicle item) {
        this.taxableVehicleList.add(item);
    }

    /**
     * Returns new arrayList of type taxableVehicle
     * @return arraylist of type TaxableVehicle
     */
    public ArrayList<TaxableVehicle> getTaxableVehicles() {
        return new ArrayList<TaxableVehicle>(this.taxableVehicleList);
    }

    /**
     * returns vehicle if vehicleObj matches
     * @param vehicleObj : instance of TaxableVehicle
     * @return vehicle : instance of class vehicle that matches with vehicleObj
     */
    public TaxableVehicle getTaxableVehicle(Vehicle vehicleObj){
        for(TaxableVehicle vehicle : taxableVehicleList){
            if(vehicle.equals(vehicleObj)) {
                return vehicle;
            }
        }
        return null;
    }
}