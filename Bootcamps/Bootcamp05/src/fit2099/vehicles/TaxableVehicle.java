package fit2099.vehicles;

import fit2099.taxation.TaxationManager;

/**
 * @author vedes
 * @version 1.0
 * @see "interface for TaxableVehicle"
 */
public interface TaxableVehicle {
    public double calculateTaxRate(double price);
    default void addToTaxationManager(){
        TaxationManager.getInstance().appendTaxableItem(this);
    }
}

