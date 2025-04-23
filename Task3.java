/*
    Write a method that takes an integer number n as an argument. If n is positive, the program should
    use a do-while loop to write a countdown from n to n-5. If n is negative, the program should print
    the absolute value of n.

    E.g. 1: for n = 6, the program should write: 6,5,4,3,2,1
    E.g. 2: for n = -7, the program should write: 7
*/


public class Task3 {
    
    public static void absoluteValue(int n) {

        if(n > 0) {
            int current = n;
            do {
                System.out.print(current + ", ");
                current--;
            }
            while (current >= n-5);
        } else {
            System.out.print(Math.abs(n));
        }
    }
}
