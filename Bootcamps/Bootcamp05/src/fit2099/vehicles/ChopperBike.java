package fit2099.vehicles;

public class ChopperBike extends Vehicle implements TaxableVehicle{
    public ChopperBike(String newMake, String newModel, int newModelYear) {
        super(newMake, newModel, newModelYear);
        this.addToTaxationManager();
    }

    public ChopperBike(String newMake, String newModel, int newModelYear, int newVehicleId) {
        super(newMake, newModel, newModelYear, newVehicleId);
        this.addToTaxationManager();
    }

    @Override
    public double calculateTaxRate(double price) {
        double tax;
        tax = (0.001* super.getModelYear());
        return  tax;
    }
}
