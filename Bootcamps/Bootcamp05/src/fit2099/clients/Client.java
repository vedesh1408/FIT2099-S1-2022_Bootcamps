package fit2099.clients;

import fit2099.Utils;

/**
 * @author vedes
 * @version 1.0
 * @see "Class that contains attributes to create clients"
 */
public class Client {
    private int clientId;
    private String firstName;
    private String lastName;

    //Constructors

    /**
     * Constructor that creates ClientID automatically
     */
    private Client(){
        clientId=Utils.nextID();
    }


    //Mutators

    /**
     * Static factory method to create new instance of a class
     * @param firstName : first name of client
     * @param lastName : last name of client
     * @return client : instance of client
     */
    public static Client getInstance(String firstName, String lastName) {
        Client client = new Client();
        if (!(client.setFirstName(firstName) && client.setLastName(lastName)))
            client = null;
        return (client);
    }

    /**
     * method to set first name of client
     * @param newFirstName : first name of client
     * @return isValid : variable to indicate if input is valid
     */
    public boolean setFirstName(String newFirstName){
        boolean isValid = false;
        if (newFirstName.length()>= 2 && newFirstName.length()<=15) {
            isValid = true;
            this.firstName= newFirstName;
        }
        return isValid;
    }

    /**
     * method to set last name of client
     * @param newLastName : last name of client
     * @return isValid : variable to indicate if input is valid
     */
    public boolean setLastName(String newLastName){
        boolean isValid = false;
        if (newLastName.length()>= 2 && newLastName.length()<=15) {
            isValid = true;
            this.lastName= newLastName;
        }
        return isValid;
    }


    //Accessors

    /**
     * method to get description of each client
     * @return description of each client
     */
    public String description(){
        return ("ID:" + clientId + " ,First Name:" + firstName + " ,Last Name: " + lastName);
    }

}
