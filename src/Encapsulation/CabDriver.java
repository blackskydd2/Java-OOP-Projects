package Encapsulation;

public class CabDriver {
    private static int driverIdCounter = 741;

    private int id;
    private String name;
    private long contact;
    private String type;
    private String car;
    private long account;
    private String status = "Available";

    public CabDriver(String name, long contact, String type, String car, long account) {
        this.name = name;
        this.contact = contact;
        this.type = type;
        this.car = car;
        this.account = account;
        this.id = driverIdCounter++; // unique ID for each driver
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getContact() {
        return contact;
    }

    public String getType() {
        return type;
    }

    public String getCar() {
        return car;
    }

    public long getAccount() {
        return account;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setContact(long newContact) {
        this.contact = newContact;
    }

    public void setCar(String newCar) {
        this.car = newCar;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setAccount(long newAccount) {
        this.account = newAccount;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    public void displayCabDriver() {
        System.out.println();
        System.out.println(" ===== CAB DETAILS ===== ");
        System.out.println("Booking Id : " + this.id);
        System.out.println("Driver Name : " + this.getName());
        System.out.println("Contact : " + this.getContact());
        System.out.println("Type Of Car : " + this.getType());
        System.out.println("Car Number : " + this.getCar());
        System.out.println("Account Number : " + this.getAccount());
        System.out.println("Status : " + this.getStatus());
    }

    public void displayCabDriverAfterBooking() {
        System.out.println();
        System.out.println(" ===== CAB DETAILS (BOOKED) ===== ");
        System.out.println("Booking Id : " + this.id);
        System.out.println("Driver Name : " + this.getName());
        System.out.println("Contact : " + this.getContact());
        System.out.println("Type Of Car : " + this.getType());
        System.out.println("Car Number : " + this.getCar());
        System.out.println("Account Number : " + this.getAccount());
        System.out.println("Status : " + this.getStatus());
    }
}
