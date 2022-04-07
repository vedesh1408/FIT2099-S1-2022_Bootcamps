package fit2099.vehicles;

/**
 * @author vedes
 * @version 1.0
 * @see "acts as a vehicle type"
 */

/**
 * constructor for ChopperBike type
 */
public class ChopperBike extends Vehicle implements TaxableVehicle{
    public ChopperBike(String newMake, String newModel, int newModelYear) throws Exception {
        super(newMake, newModel, newModelYear);
        this.addToTaxationManager();
    }

    /**
     * calculate tax
     * @param price : bid price
     * @return tax : tax due from price
     */
    @Override
    public double calculateTaxRate(double price) {
        double tax;
        tax = (0.001* super.getModelYear());
        return  tax;
    }
}
