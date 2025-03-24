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
public class simplecalculator {
    public static int AddNum(int a, int b) {
        return a + b;
    }

    public static int SubNum(int a, int b) {
        return a - b;
    }

    public static int MultNum(int a, int b) {
        return a * b;
    }

    public static double DivNum(double a, double b) {
        return a / b;
    }

    public static double PercentNum(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();

        int R = 29, N = 18;
        System.out.println("The Addition: " + AddNum(R, N));
        System.out.println("The Subtraction: " + SubNum(R, N));
        System.out.println("The Multiplication: " + MultNum(R, N));
        System.out.println("The Division: " + DivNum(R, N));
        System.out.println("The Percentage: " + PercentNum(R, N));
    }

}
