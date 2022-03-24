import java.util.ArrayList;

public class CarAuction {
    //Car Data type Array
    ArrayList<Car> cars = new ArrayList<Car>();

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Car Auction Systems");
        System.out.println(" ");

        // Testing Task 3
        //Car c1 = new Car ("Audi", "TT",2014);
        //System.out.println(c1.description());

        //Task 4
        createCars();
        displayCar();
        System.out.println("Thank you for visiting FIT2099 Car Auction System");
    }

    //Task 4
    public void createCars() {
        Car cr1 = new Car("Audi", "TT", 2014);
        Car cr2 = (new Car("BMW", "X7", 2017));
        Car cr3 = (new Car("Chevrolet", "Corvette", 2020));

        // creating clients and bids
        Client c1 = new Client(Utils.nextID(), "Sam", "Johnson");
        Client c2 = new Client(Utils.nextID(), "Robert", "Jones");
        cr1.addBid(c1, 10000.25, "20/03/2022");
        cr1.addBid(c2, 10500.25, "24/03/2022");
        cars.add(cr1);
        cars.add(cr2);
        cars.add(cr3);
    }

    public void displayCar() {

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car (" + (i + 1) + ") " + cars.get(i).description());
            // Display clients and bids
            System.out.print("Bids :\n");
            for (Bid item : cars.get(i).getBids()) {
                System.out.print("bidID = {" + item.getBidId() + "}, Clients = {clientsID= " + item.getClient().getClientId()
                        + ", first Names= '" + item.getClient().getFirstName() + "', last Names = " + item.getClient().getLastName() +
                        "'} price = " + item.getPrice() + ", date = " + item.getBidDate() + "}\n");

            }
            System.out.println(" ");

        }


    }
}
