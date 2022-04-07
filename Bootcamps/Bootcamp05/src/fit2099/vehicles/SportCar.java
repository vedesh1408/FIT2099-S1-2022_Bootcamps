package fit2099.vehicles;

public class SportCar extends Vehicle implements TaxableVehicle{
    private int seats;
    boolean isConvertible;

    public SportCar(String newMake, String newModel, int newModelYear, int newSeats, boolean newIsConvertible) {
        super(newMake, newModel, newModelYear);
        this.seats = newSeats;
        this.isConvertible = newIsConvertible;
    }

    public SportCar(String newMake, String newModel, int newModelYear, int newVehicleId, int newSeats, boolean newIsConvertible) {
        super(newMake, newModel, newModelYear, newVehicleId);
        this.seats = newSeats;
        this.isConvertible = newIsConvertible;
    }

    @Override
    public double calculateTaxRate(double price) {
        double tax;
        if (isConvertible){
            tax= (0.01) * seats;
        }
        else {
            tax= (price * 0.02);
        }
        return tax;
    }
}
