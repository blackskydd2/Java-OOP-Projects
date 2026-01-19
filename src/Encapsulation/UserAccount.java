package Encapsulation;

 class UserAccount {

    private String username;
    private int pin;
    private double balance;
    private long adhar;

    UserAccount(String username, int pin, double balance, long adhar){
        this.username = username;
        this.pin = pin;
        this.balance = balance;
        this.adhar = adhar;
    }

    public String getUsername(){
        return  username;
    }
    public void setUsername(String newUsername){
        username = newUsername;
    }

    public int getPin(){
        return pin;
    }

    public void setPin(int newPin){
        pin = newPin;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public double getAdhar(){
        return adhar;
    }

    public void setAdhar(long newAadhar){
        adhar = newAadhar;
    }





}
