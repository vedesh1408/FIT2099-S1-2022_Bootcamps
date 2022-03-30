public class SportCar extends Vehicle{
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
}
