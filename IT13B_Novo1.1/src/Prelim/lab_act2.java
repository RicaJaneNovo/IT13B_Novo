/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class lab_act2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Input the first number: ");
        num1 = in.nextInt();

        System.out.println("input second number: ");
        num2 = in.nextInt();

        System.out.println("input third number: ");
        num3 = in.nextInt();

        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;

        }
        System.out.println("The greatest number is: " + greatest);

    }
}

