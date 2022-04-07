package fit2099;

import fit2099.clients.Client;
import fit2099.taxation.TaxationManager;
import fit2099.vehicles.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vedes
 * @version 1.0
 * @see "Auction of different vehicles"
 */
public class CarAuction {
    //Car Data type Array
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    ArrayList<Client> clientArrayList = new ArrayList<>();
    TaxableVehicle theVehicleObject;

    /**
     * i/0 for user to select choices
     *
     * @throws Exception
     */
    public void printStatus() throws Exception {
        int choice;
        Scanner myObj = new Scanner(System.in);
        String ans = "Y";
        System.out.println("Welcome to FIT2099 Car Auction Systems");
        System.out.println(" ");
        System.out.println("+---------------------------------+");
        System.out.println("|       Welcome to Bootcamp       |");
        System.out.println("|              Week 5             |");
        System.out.println("+---------------------------------+\n");

        do {
            choice = selectionMenu();
            if (choice == 1) {
                createSportCar();
            } else if (choice == 2) {
                createChopperBike();
            } else if (choice == 3) {
                createBobberBike();
            } else if (choice == 4) {
                displayFleet();
            } else if (choice == 5) {
                createClient();
            } else if (choice == 6) {
                displayClients();
            } else if (choice == 7) {
                createBid();
            } else if (choice == 8) {
                System.exit(0);
            } else {
                System.out.println("Invalid choice number");
                return;
            }
            System.out.println("Do you want to continue? Y/N");
            ans = myObj.next();
            ans = ans.toUpperCase();
        } while (ans.equals("Y"));


        System.out.println("Thank you for visiting FIT2099 Car Auction System");

    }

    /**
     * method to create a new sport car
     *
     * @throws Exception
     */
    public void createSportCar() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car maker: ");
        String cMaker = scanner.next();
        System.out.print("Enter car model: ");
        String cModel = scanner.next();
        System.out.print("Enter car model year: ");
        int cYear = scanner.nextInt();
        System.out.print("Enter number of seats: ");
        int cSeats = scanner.nextInt();
        System.out.print("Is the car convertible: ");
        boolean cConvertible = scanner.nextBoolean();

        try {
            SportCar sportCar = new SportCar(cMaker, cModel, cYear, cSeats, cConvertible);
            vehicles.add(sportCar);
            System.out.println(sportCar);
        } catch (Exception e) {
            System.out.println("error has occured");
        }

    }

    /**
     * create a new Chopper Bike
     *
     * @throws Exception
     */
    public void createChopperBike() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bike maker: ");
        String cMaker = scanner.next();
        System.out.print("Enter bike model: ");
        String cModel = scanner.next();
        System.out.print("Enter bike model year: ");
        int cYear = scanner.nextInt();
        try {
            ChopperBike chopperBike = new ChopperBike(cMaker, cModel, cYear);
            vehicles.add(chopperBike);
            System.out.println(chopperBike);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    /**
     * create a new bobber bike
     *
     * @throws Exception
     */
    public void createBobberBike() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bike maker: ");
        String cMaker = scanner.next();
        System.out.print("Enter bike model: ");
        String cModel = scanner.next();
        System.out.print("Enter bike model year: ");
        int cYear = scanner.nextInt();
        try {
            BobberBike bobberBike = new BobberBike(cMaker, cModel, cYear);
            vehicles.add(bobberBike);
            System.out.println(bobberBike);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * create a new client
     */
    public void createClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Client First Name: ");
        String cFirstName = scanner.next();
        System.out.print("Enter Client Last Name: ");
        String cLastName = scanner.next();
        try {

            Client client = Client.getInstance(cFirstName, cLastName);
            clientArrayList.add(client);
            System.out.println(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * create a new bid
     */
    public void createBid() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle ID: ");
        int cID = scanner.nextInt();
        System.out.print("Enter client ID: ");
        int cLID = scanner.nextInt();
        System.out.print("Enter price: ");
        double cPrice = scanner.nextDouble();
        System.out.print("Enter Bid date: ");
        String bidDate = scanner.next();

        for (Vehicle vehicle : vehicles) {
            if (cID == vehicle.getVehicleId()) {
                vehicle.addBid(cLID, cPrice, bidDate);
            }
        }
        for (int i = 0; i < vehicles.size(); i++) {
            if (cID == vehicles.get(i).getVehicleId()) {
                if (TaxationManager.getInstance().getTaxableVehicles().contains(vehicles.get(i))) {
                    if (vehicles.get(i) instanceof ChopperBike) {
                        double Tax = ((ChopperBike) vehicles.get(i)).calculateTaxRate(cPrice);
                        System.out.println("Bid for Vehicle: " + vehicles.get(i).getVehicleId() + "| MY" + vehicles.get(i).getModelYear() + "|" + vehicles.get(i).getMake() + "|" +
                                vehicles.get(i).getMake() + "|{ buyerId =" + cLID + ", price=" + (cPrice - Tax) + ", date= " + bidDate + "} Price: " + (cPrice - Tax) + "Tax: " + Tax);
                    } else if (vehicles.get(i) instanceof BobberBike) {
                        System.out.println("Bid for Vehicle: " + vehicles.get(i).getVehicleId() + "| MY" + vehicles.get(i).getModelYear() + "|" + vehicles.get(i).getMake() + "|" +
                                vehicles.get(i).getMake() + "|{ buyerId =" + cLID + ", price=" + (cPrice) + ", date= " + bidDate + "} Price: " + (cPrice) + "Tax: NO TAX");

                    } else if (vehicles.get(i) instanceof SportCar) {
                        double Tax = ((SportCar) vehicles.get(i)).calculateTaxRate(cPrice);
                        System.out.println("Bid for Vehicle: " + vehicles.get(i).getVehicleId() + "| MY" + vehicles.get(i).getModelYear() + "|" + vehicles.get(i).getMake() + "|" +
                                vehicles.get(i).getMake() + "|{ buyerId =" + cLID + ", price=" + (cPrice - Tax) + ", date= " + bidDate + "} Price: " + (cPrice - Tax) + "Tax: " + Tax);
                    }

                } else {
                    System.out.println("Sorry try again! Vehicle not found");
                }
            }
        }
    }

    /**
     * display fleet
     */
    public void displayFleet() {

        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". Vehicle description: " + vehicles.get(i).description());
        }
    }

    /**
     * display new clients
     */
    public void displayClients() {
        for (int i = 0; i < clientArrayList.size(); i++) {
            System.out.println((i + 1) + ". Client Description: " + clientArrayList.get(i).description());
        }
    }

    /**
     * display a selection menu for the user to choose from
     *
     * @return the choice of the user from the list provided
     */
    public static int selectionMenu() {

        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("---------------------");
        System.out.println("1) New Sport Car");
        System.out.println("2) New Chopper Bike");
        System.out.println("3) New Bobber Bike");
        System.out.println("4) Display Fleet");
        System.out.println("5) Add Client");
        System.out.println("6) List Clients");
        System.out.println("7) Add Bid");
        System.out.println("8) Exit");
        System.out.print("Select an option: ");
        choice = sc.nextInt();
        return choice;

    }
}
