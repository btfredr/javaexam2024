/*
    Write a Java program that uses two for loops to print out a pyramid of numbers. The pyramid
    should have a number of rows equal to the height specified by the user. Each row should display
    incrementing numbers starting from 1. For example, if the user specifies a height of 4, the pyramid
    printed should look like this:
        1
        1 2
        1 2 3
        1 2 3 4
    The program should prompt the user to enter the desired height and then output the pyramid
    accordingly. Each level of the pyramid should have increasing numbers starting from 1, up to the
    number of the row.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String [] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter height of the pyramid: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            System.out.println();

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }

        scanner.close();
    }
}
