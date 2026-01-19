package Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class SvaraiDriver {

    static ArrayList<CabDriver> listcab = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample drivers
        CabDriver obj1 = new CabDriver("Ramesh", 9876543210L, "Sedan", "MH12AA1234", 123412341234L);
        CabDriver obj2 = new CabDriver("Suresh", 741258963L, "Hatchback", "MH18AV7852", 74125896321L);
        CabDriver obj3 = new CabDriver("Mahesh", 7412258652L, "SUV", "MH18BQ3689", 785421659832L);

        listcab.add(obj1);
        listcab.add(obj2);
        listcab.add(obj3);

        while (true) {
            System.out.println();
            System.out.println("============= Welcome to Savari ============");
            System.out.println();

            // Take passenger details
            System.out.println("+++++ BOOK A RIDE +++++");
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter start destination: ");
            String start = sc.nextLine();

            System.out.print("Enter end destination: ");
            String end = sc.nextLine();

            System.out.print("Enter contact: ");
            long contact = sc.nextLong();

            System.out.print("Enter number of passengers: ");
            int nopass = sc.nextInt();
            sc.nextLine();

            Passenger pass = new Passenger(name, start, end, contact, nopass);

            System.out.println();
            System.out.println("Available cabs: ");

            boolean anyAvailable = false;
            for (CabDriver driver : listcab) {
                if (driver.getStatus().equals("Available")) {
                    driver.displayCabDriver();
                    anyAvailable = true;
                }
            }

            if (!anyAvailable) {
                System.out.println("No cabs available right now. Please try again later.");
            } else {
                System.out.println();
                System.out.print("Enter a Booking Id to select cab: ");
                int bookId = sc.nextInt();
                sc.nextLine();

                CabDriver selectedDriver = null;
                for (CabDriver driver : listcab) {
                    if (bookId == driver.getId() && driver.getStatus().equals("Available")) {
                        selectedDriver = driver;
                        break;
                    }
                }

                if (selectedDriver == null) {
                    System.out.println("Invalid booking id or cab not available.");
                } else {
                    selectedDriver.setStatus("Occupied");
                    selectedDriver.displayCabDriverAfterBooking();
                    System.out.println();
                    System.out.println("Your ride has been booked for passenger: " + pass.getName());
                    System.out.println("From " + pass.getStart() + " to " + pass.getEnd());
                }
            }

            System.out.println();
            System.out.print("Do you want to book another ride? (y/n): ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using Savari!");
                break;
            }
        }

        sc.close();
    }
}
