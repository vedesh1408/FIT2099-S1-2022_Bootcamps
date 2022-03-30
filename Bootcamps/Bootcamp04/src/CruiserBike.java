public class CruiserBike extends Vehicle{
    private CruiseBikeType type;

    public CruiserBike(String newMake, String newModel, int newModelYear, CruiseBikeType newType) {
        super(newMake, newModel, newModelYear);
        this.type = newType;
    }

    public CruiserBike(String newMake, String newModel, int newModelYear, int newVehicleId, CruiseBikeType newType) {
        super(newMake, newModel, newModelYear, newVehicleId);
        this.type = newType;
    }
}
