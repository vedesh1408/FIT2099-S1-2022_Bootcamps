public class CarAuction {
    public void printStatus(){
        System.out.println("Welcome to FIT2099 Car Auction Systems");

        // Testing Task 3
        //Car c1 = new Car ("Audi", "TT",2014);
        //System.out.println(c1.getCarDescription());

        //Task 4
        displayCar(createCars());

        System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }
    //Task 4
    public Car[] createCars(){
        Car c1 = new Car ("Audi", "TT",2014);
        Car c2 = new Car("BMW", "X7",2017);
        Car c3 = new Car("Chevrolet", "Corvette",2020);
        Car[] carArray = {c1,c2,c3};
        return carArray;
    }

    public void displayCar(Car _carArray[]){

        for (int i=0; i<_carArray.length; i++){
            System.out.println("Car (" + (i+1) + ") " + _carArray[i].getCarDescription());
        }
    }
}
