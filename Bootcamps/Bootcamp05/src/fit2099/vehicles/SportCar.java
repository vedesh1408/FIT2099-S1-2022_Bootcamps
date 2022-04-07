package fit2099.vehicles;

public class SportCar extends Vehicle implements TaxableVehicle{
    private int seats;
    boolean isConvertible;

    public SportCar(String newMake, String newModel, int newModelYear, int newSeats, boolean newIsConvertible) throws Exception {
        super(newMake, newModel, newModelYear);
        setSeats(newSeats);
        this.isConvertible = newIsConvertible;
        this.addToTaxationManager();


    }



    public boolean setSeats(int newSeats){
        boolean isValid = false;
        if (newSeats >=2 && newSeats <= 5) {
            isValid = true;
            seats = newSeats;
        }
        return isValid;
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
