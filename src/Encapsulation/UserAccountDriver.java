package Encapsulation;

public class UserAccountDriver {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("Aayush", 1234, 99.99, 572821524949l);
        System.out.println("User name : " + user.getUsername());
        System.out.println("Balance : " + user.getBalance());
        System.out.println("pin : " + user.getPin());
        System.out.println("Adhar no : " + user.getAdhar());

        user.setBalance(112.3600);
        System.out.println("===============================================================================");
        UserAccount user2 = new UserAccount("Naresh", 6369, 7298546.0215874d, 36587412985l);
        System.out.println("User name : " + user2.getUsername());
        System.out.println("Balance : " + user2.getBalance());
        System.out.println("pin : " + user2.getPin());
        System.out.println("Adhar no : " + user2.getAdhar());
        user2.setUsername("Naresh");
        user2.setPin(6369);
        user2.setBalance(8989.6547);
        user2.setAdhar(123478545698l);

    }
}