package Encapsulation;

public class Passenger {

    private String name;
    private String start;
    private String end;
    private long contact;
    private int noPass;

    public Passenger(String name, String start, String end, long contact, int noPass) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.contact = contact;
        this.noPass = noPass;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public long getContact() {
        return contact;
    }

    public int getNoPass() {
        return noPass;
    }

    // Setters
    public void setStart(String newStart) {
        this.start = newStart;
    }

    public void setEnd(String newEnd) {
        this.end = newEnd;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setContact(long newContact) {
        this.contact = newContact;
    }

    public void setNoPass(int newNoPass) {
        if (newNoPass <= 0) {
            throw new IllegalArgumentException("Number of passengers must be >= 1");
        }
        this.noPass = newNoPass;
    }
}
