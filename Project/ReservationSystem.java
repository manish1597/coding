package Project;
import java.util.Scanner;

public class ReservationSystem {
    static Scanner sc = new Scanner(System.in);
    static String username, password;
    static boolean isLoggedIn = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Reservation System!");
        makeReservation();
        login();
        if (isLoggedIn) {
            System.out.println("Welcome, " + username + "!");
            int choice;
            do {
                System.out.println("What would you like to do?");
                System.out.println("1. Make a reservation");
                System.out.println("2. Cancel a reservation");
                System.out.println("3. Logout");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline character

                switch (choice) {
                    case 1:
                        makeReservation();
                        break;
                    case 2:
                        cancelReservation();
                        break;
                    case 3:
                        System.out.println("Logging out...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 3);
        } else {
            System.out.println("Invalid login. Please try again.");
        }
    }

    static void login() {
        boolean isExistingUser = false;
        do {
            System.out.print("Enter your username: ");
            username = sc.nextLine();
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            // perform authentication here, e.g. compare with database
            if (username.equals("admin") && password.equals("password")) {
                isLoggedIn = true;
                isExistingUser = true;
            } else {
                System.out.print("Username does not exist. Do you want to create a new account? (Y/N): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("Y")) {
                    System.out.print("Enter a new username: ");
                    username = sc.nextLine();
                    System.out.print("Enter a new password: ");
                    password = sc.nextLine();
                    System.out.println("New account created!");
                    isLoggedIn = true;
                    isExistingUser = true;
                }
            }
        } while (!isExistingUser);
    }

    static void makeReservation() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the date of the reservation (MM/DD/YYYY): ");
        String date = sc.nextLine();
        System.out.print("Enter the time of the reservation (HH:MM AM/PM): ");
        String time = sc.nextLine();
        // save reservation to database or data structure
        System.out.println("Reservation made for " + name + " on " + date + " at " + time + ".");
    }

    static void cancelReservation() {
        System.out.print("Enter the name on the reservation: ");
        String name = sc.nextLine();
        System.out.print("Enter the date of the reservation (MM/DD/YYYY): ");
        String date = sc.nextLine();
        System.out.print("Enter the time of the reservation (HH:MM AM/PM): ");
        String time = sc.nextLine();
        // delete reservation from database or data structure
        System.out.println("Reservation for " + name + " on " + date + " at " + time + " cancelled.");
    }
}
