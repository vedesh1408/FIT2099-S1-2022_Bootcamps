package fit2099.clients;

import fit2099.Utils;

public class Client {
    private int clientId;
    private String firstName;
    private String lastName;

    //Constructors

    private Client(int newClientId, String newFirstName, String newLastName){
        this.clientId = newClientId;
        setFirstName(newFirstName);
        setLastName(newLastName);
    }

    private Client(){
        clientId=Utils.nextID();
    }


    //Mutators
    public static Client getInstance(String firstName, String lastName) {
        Client client = new Client();
        if (!(client.setFirstName(firstName) && client.setLastName(lastName)))
            client = null;
        return (client);
    }

    public boolean setFirstName(String newFirstName){
        boolean isValid = false;
        if (newFirstName.length()>= 2 && newFirstName.length()<=15) {
            isValid = true;
            this.firstName= newFirstName;
        }
        return isValid;
    }

    public boolean setLastName(String newLastName){
        boolean isValid = false;
        if (newLastName.length()>= 2 && newLastName.length()<=15) {
            isValid = true;
            this.lastName= newLastName;
        }
        return isValid;
    }


    //Accessors
    public String description(){
        return ("ID:" + clientId + " ,First Name:" + firstName + " ,Last Name: " + lastName);
    }

}
