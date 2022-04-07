package fit2099.taxation;
import fit2099.vehicles.TaxableVehicle;
import fit2099.vehicles.Vehicle;

import java.util.ArrayList;

public class TaxationManager {
    private ArrayList<TaxableVehicle> taxableVehicleList;

    private static TaxationManager instance;

    private TaxationManager() { // 1-  private to prevent anyone else from instantiating
        taxableVehicleList = new ArrayList<>();
    }

    public static TaxationManager getInstance() {
        if (instance == null) {
            instance = new TaxationManager();
        }
        return instance;
    }

    public void appendTaxableItem(TaxableVehicle item) {
        this.taxableVehicleList.add(item);
    }

    public ArrayList<TaxableVehicle> getTaxableVehicles() {
        return new ArrayList<TaxableVehicle>(this.taxableVehicleList);
    }

    public TaxableVehicle getTaxableVehicle(Vehicle vehicleObj){
        for(TaxableVehicle vehicle : taxableVehicleList){
            if(vehicle.equals(vehicleObj)) {
                return vehicle;
            }
        }
        return null;
    }
}