package fit2099.vehicles;

public class ChopperBike extends Vehicle implements TaxableVehicle{
    public ChopperBike(String newMake, String newModel, int newModelYear) throws Exception {
        super(newMake, newModel, newModelYear);
        this.addToTaxationManager();
    }


    @Override
    public double calculateTaxRate(double price) {
        double tax;
        tax = (0.001* super.getModelYear());
        return  tax;
    }
}
