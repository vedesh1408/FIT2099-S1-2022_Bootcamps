package fit2099.vehicles;

import fit2099.taxation.TaxationManager;

public interface TaxableVehicle {
    public double calculateTaxRate(double price);
    default void addToTaxationManager(){
        TaxationManager.getInstance().appendTaxableItem(this);
    }
}

