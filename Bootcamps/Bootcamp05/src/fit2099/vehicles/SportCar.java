package fit2099.vehicles;

/**
 * @author vedes
 * @version 1.0
 * @see "acts as a vehicle type"
 */
public class SportCar extends Vehicle implements TaxableVehicle{
    private int seats;
    boolean isConvertible;

    /**
     * constructor for SportCar class
     * @param newMake : new make
     * @param newModel : new model of car
     * @param newModelYear : new year in which car was manufacturer
     * @param newSeats : new number of seats
     * @param newIsConvertible : whether car is compatible
     * @throws Exception
     */
    public SportCar(String newMake, String newModel, int newModelYear, int newSeats, boolean newIsConvertible) throws Exception {
        super(newMake, newModel, newModelYear);
        setSeats(newSeats);
        this.isConvertible = newIsConvertible;
        this.addToTaxationManager();


    }

    /**
     * set new number of seats
     * @param newSeats : new numbner of seats
     * @return isValid : boolean variable to check if input is correct
     */
    public boolean setSeats(int newSeats){
        boolean isValid = false;
        if (newSeats >=2 && newSeats <= 5) {
            isValid = true;
            seats = newSeats;
        }
        return isValid;
    }
    /**
     * calculate tax
     * @param price : bid price
     * @return tax : tax due from price
     */
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
