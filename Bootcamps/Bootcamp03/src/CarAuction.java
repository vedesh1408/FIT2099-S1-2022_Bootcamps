import java.util.ArrayList;

public class CarAuction {
    //Car Data type Array
    ArrayList<Car> cars = new ArrayList<Car>();

    public void printStatus(){
        System.out.println("Welcome to FIT2099 Car Auction Systems");

        // Testing Task 3
        //Car c1 = new Car ("Audi", "TT",2014);
        //System.out.println(c1.description());

        //Task 4
        createCars();
        displayCar();
        System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }
    //Task 4
    public void createCars(){
        cars.add(new Car("Audi", "TT",2014));
        cars.add(new Car("BMW", "X7",2017));
        cars.add(new Car("Chevrolet", "Corvette",2020));

    }

    public void displayCar(){

        for (int i=0; i<cars.size(); i++){
            System.out.println("Car (" + (i+1) + ") " + cars.get(i).description());
        }
    }
}
