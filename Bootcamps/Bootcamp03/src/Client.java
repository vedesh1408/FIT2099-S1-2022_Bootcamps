public class Client {
    private int clientId;
    private String firstName;
    private String lastName;

    //Constructors
    public Client (int newClientId){
        this.clientId = newClientId;
    }

    public Client(int newClientId, String newFirstName, String newLastName){
        this.clientId = newClientId;
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }

    //Mutators
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    //Accessors
    public String description(){
        return (clientId + " " + firstName + " " + lastName);
    }




}
