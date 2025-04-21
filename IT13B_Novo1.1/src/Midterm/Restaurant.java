
package restaurant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Restaurant {
        
    static final String USER_FILE = "C:\\Users\\Dell\\Desktop\\NDSL Restaurant.txt";
    static final int SHIFT = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n---Welcome to NDSL Restaurant---");
            System.out.println("1. Create an Account");
            System.out.println("2. Log In");
            System.out.println("3. Exit");

            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> register();
                case 2 -> {
                    if (login()) {
                        placeOrder();
                    }
                }
                case 3 -> {
                    System.out.println("Thank you. Please, come again!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void register() {
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        String encryptUser = encrypt(username);
        String encryptPass = encrypt(password);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            bw.write(encryptUser + "," + encryptPass);
            bw.newLine();
            System.out.println("Registration successful! Now you can order from our restaurant.");
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

    static boolean login() {
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        String encryptUser = encrypt(username);
        String encryptPass = encrypt(password);

        try (BufferedReader br = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials.length == 2 && credentials[0].equals(encryptUser) && credentials[1].equals(encryptPass)) {
                    System.out.println("Log in successfully.");
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error logging in: " + e.getMessage());
        }
        System.out.println("Invalid credentials.");
        return false;
    }

    static void placeOrder() {
        String[] menu = {"Burger", "Pizza", "Pasta", "Salad", "Fries", "Mango Float", "Coke", "Cake", "Cupcake"};
        int[] prices = {120, 250, 200, 150, 100, 150, 95, 350, 150};
        int[] orderQty = new int[menu.length];

        while (true) {
            System.out.println("\n--- Menu ---");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - Php. " + prices[i]);
            }
            System.out.println((menu.length + 1) + ". Checkout");
            System.out.println("Select item number to order:");
            int item = sc.nextInt();

            if (item == menu.length + 1) {
                break;
            }

            if (item > 0 && item <= menu.length) {
                System.out.println("Enter Quantity:");
                int qty = sc.nextInt();
                orderQty[item - 1] += qty;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("\n--- Order Summary ---");
        int total = 0;
        for (int i = 0; i < menu.length; i++) {
            if (orderQty[i] > 0) {
                int cost = orderQty[i] * prices[i];
                System.out.println(menu[i] + " x " + orderQty[i] + " = Php. " + cost);
                total += cost;
            }
        }
        System.out.println("Total Bill: Php. " + total);
        System.out.println("Thank you for ordering from our restaurant!");
    }

    static String encrypt(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            sb.append((char) (ch + SHIFT));
        }
        return sb.toString();
    }
}

