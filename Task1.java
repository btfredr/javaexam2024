/*
    Write a method that takes a double value (input) as an argument and returns the biggest odd
    integer number smaller than the input number. For example:
    For input = 25.2, the method returns 25.
    For input = 7.0, the method returns 5.
    For input = -5.75, the method returns -7.
 */


public class Task1 {

    public static void main(String[] args) {
        System.out.println(biggestOddNum(25.2));
        System.out.println(biggestOddNum(7.0));
        System.out.println(biggestOddNum(-5.75));
    }

    public static int biggestOddNum(double number) {
        // Finnr største heltallet
        int floorValue = (int) Math.floor(number);

        if (floorValue == number) {
            floorValue--;
        }

        if (floorValue % 2 == 0) {
            floorValue--;
        }

        return floorValue;
    }
}