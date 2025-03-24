/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

public class Novo_multi_dimentionary_array {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},};

        for (int r = 0; r < numbers.length; r++) {
            System.out.print("The Elements in Row" + (r + 1) + ": ");
            for (int n = 0; n < numbers[r].length; n++) {
                System.out.print(numbers[r][n] + " ");

            }
            System.out.println();
        }
    }
}
