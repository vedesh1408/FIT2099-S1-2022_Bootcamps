import java.util.ArrayList;
import java.util.Scanner;

public class CarAuction {
    //Car Data type Array
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

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
        Vehicle cr1 = new Vehicle("Audi", "TT", 2014);
        Vehicle cr2 = (new Vehicle("BMW", "X7", 2017));
        Vehicle cr3 = (new Vehicle("Chevrolet", "Corvette", 2020));

        // creating clients and bids
//        Client c1 = new Client(Utils.nextID(), "Sam", "Johnson");
//        Client c2 = new Client(Utils.nextID(), "Robert", "Jones");
//        Client c3 = new Client(Utils.nextID(), "John", "Doe");
//
//        Bid b1 = new Bid(Utils.nextID(), c1, 100000, "20/03/2022");
//        Bid b2 = new Bid(Utils.nextID(), c2, 100250, "24/03/2022");
//        Bid b3 = new Bid(Utils.nextID(), c3, 101250, "18/03/2022");
//
//        cr1.addBid(c1, b1.getPrice(), b1.getBidDate());
//        cr1.addBid(c2, b2.getPrice(), b2.getBidDate());
//        cr2.addBid(c3, b3.getPrice(), b3.getBidDate());
//
//        cr1.addBid(c1, 10000.25, "20/03/2022");
//        cr1.addBid(c2, 10500.25, "24/03/2022");
//        cr2.addBid(c3, 120000.75, "18/03/2022");
//
        vehicles.add(cr1);
        vehicles.add(cr2);
        vehicles.add(cr3);

        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter Client First Name: ");
        String cFirstName = scanner.next();
        System.out.print("Enter Client Last Name: ");
        String cLastName = scanner.next();
        System.out.print("Enter Client ID: ");
        int cId = scanner.nextInt();

        Client newClient = new Client(cId, cFirstName, cLastName);

        System.out.print("Enter Bid price: ");
        double bidPrice = scanner.nextDouble();
        System.out.print("Enter Bid date: ");
        String bidDate = scanner.next();

        Bid newBid = new Bid(Utils.nextID(), newClient, bidPrice, bidDate);
        vehicles.get(0).addBid(newClient, bidPrice, bidDate);


    }

    public void displayCar() {

        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("Car (" + (i + 1) + ") " + vehicles.get(i).description());
            // Display clients and bids
            System.out.print("Bids :\n");
            for (Bid item : vehicles.get(i).getBids()) {
                System.out.print("bidID = {" + item.getBidId() + "}, Clients = {" + item.getClient().description() + "} ,{price = " + item.getPrice() + "}, {date = " + item.getBidDate() + "}\n");

            }
            System.out.println(" ");

        }


    }

    // Task 8 is in text file on git
}
