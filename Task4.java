/*
    Write a Java program that reads a volume in gallons from the user and converts it to liters using the
    formula: liters = gallons * 3.785.
    For example:

    E.g. 1: If gallons is 1, the method returns 3.785.
    E.g. 2: If gallons is 5, the method returns 18.925.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount of gallons you want to convert into liters: ");
        double gallons = scanner.nextDouble();

        double conversion = gallons * 3.785;
        System.out.print(gallons + " gallons equal " + conversion + " liters.");

        scanner.close();
    }
}
