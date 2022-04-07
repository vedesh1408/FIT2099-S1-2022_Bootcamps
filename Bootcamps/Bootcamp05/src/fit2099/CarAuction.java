package fit2099;

import fit2099.clients.Client;
import fit2099.vehicles.BobberBike;
import fit2099.vehicles.ChopperBike;
import fit2099.vehicles.SportCar;
import fit2099.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class CarAuction {
    //Car Data type Array
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    ArrayList<Client> clientArrayList = new ArrayList<>();

    public void printStatus() {
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
                createCruiseBike();
            } else if (choice == 3) {
                displayFleet();
            } else if (choice == 4) {
                createClient();
            } else if (choice == 5) {
                displayClients();
            } else if (choice == 6) {
                createBid();
            } else if (choice == 7) {
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



    public void createSportCar() {
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
        SportCar sportCar = new SportCar(cMaker, cModel, cYear, cSeats, cConvertible);
        vehicles.add(sportCar);
    }

    public void createCruiseBike() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bike maker: ");
        String cMaker = scanner.next();
        System.out.print("Enter bike model: ");
        String cModel = scanner.next();
        System.out.print("Enter bike model year: ");
        int cYear = scanner.nextInt();
        System.out.print("Enter type: ");
        String type = scanner.next();

        if (type.equals("CHOPPER")) {
            ChopperBike chopperBike = new ChopperBike(cMaker,cModel,cYear);
            vehicles.add(chopperBike);
        } else if (type.equals("BOBBER")) {
            BobberBike bobberBike = new BobberBike(cMaker,cModel,cYear);
            vehicles.add(bobberBike);
        } else {
            System.out.println("Invalid type");
            return;
        }

    }

    public void createClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Client First Name: ");
        String cFirstName = scanner.next();
        System.out.print("Enter Client Last Name: ");
        String cLastName = scanner.next();
        System.out.print("Enter Client ID: ");
        int cId = scanner.nextInt();
        Client client = new Client(cId, cFirstName, cLastName);
        clientArrayList.add(client);
    }

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

    }

    public void displayFleet() {

        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". Vehicle description: " + vehicles.get(i).description());
        }
    }

    public void displayClients() {
        for (int i = 0; i < clientArrayList.size(); i++) {
            System.out.println((i + 1) + ". Client Description: " + clientArrayList.get(i).description());
        }
    }

    public static int selectionMenu() {

        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("---------------------");
        System.out.println("1) New Sport Car");
        System.out.println("2) New Cruiser Bike");
        System.out.println("3) Display Fleet");
        System.out.println("4) Add Client");
        System.out.println("5) List Clients");
        System.out.println("6) Add Bid");
        System.out.println("7) Exit");
        System.out.print("Select an option: ");
        choice = sc.nextInt();
        return choice;

    }
}
