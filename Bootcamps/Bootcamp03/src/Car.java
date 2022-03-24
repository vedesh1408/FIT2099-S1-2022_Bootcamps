public class Car {

    // Private attributes
    private String make;
    private String model;
    private int modelYear;
    //Constructor
    public Car(String newMake, String newModel, int newModelYear){
        this.make = newMake;
        this.model=newModel;
        this.modelYear=newModelYear;
    }
    //Methods

    public String description(){

        return ("MY" + modelYear + " " + make + " " + model);

    }
}
