/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Act1palindrome {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter a word:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Error:Input cannot be empty.");
        } else {
            String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
            String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

            if (cleanedInput.equals(reversedInput)) {
                System.out.println("The word is Palindrome.");
            } else {
                System.out.println("The word is not Palindrome.");

            }
        }

        scanner.close();

    }
}
