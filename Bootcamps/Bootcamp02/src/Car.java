public class Car {

    // Private attributes
    private String make;
    private String model;
    private int modelYear;

    //Constructor
    public Car(String _make, String _model, int _modelYear){
        this.make = _make;
        this.model=_model;
        this.modelYear=_modelYear;
    }
    //Methods

    public String getCarDescription(){

        return ("MY" + modelYear + " " + make + " " + model);

    }
}
