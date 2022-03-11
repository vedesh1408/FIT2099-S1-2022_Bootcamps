public class CarAuction {
    //Car Data type Array
    Car[] cars = new Car[3];

    public void printStatus(){
        System.out.println("Welcome to FIT2099 Car Auction Systems");

        // Testing Task 3
        //Car c1 = new Car ("Audi", "TT",2014);
        //System.out.println(c1.getCarDescription());

        //Task 4
        createCars();
        displayCar();
        System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }
    //Task 4
    public void createCars(){
       cars[0] = new Car ("Audi", "TT",2014);
       cars[1] = new Car("BMW", "X7",2017);
       cars[2] = new Car("Chevrolet", "Corvette",2020);
    }

    public void displayCar(){

        for (int i=0; i<cars.length; i++){
            System.out.println("Car (" + (i+1) + ") " + cars[i].getCarDescription());
        }
    }
}
