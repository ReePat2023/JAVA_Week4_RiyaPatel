package JAVA_Week4_RiyaPatel;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Program02_MinAndMaxInputChallenge {

    public static void minmax() {

        Scanner s1 = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 0;
        boolean num = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean intNum = s1.hasNextInt();
            if (intNum) {
                int number = s1.nextInt();
                if (intNum) {
                    num = false;
                    minNum = number;
                    maxNum = number;
                }
                if (number > maxNum) {
                    maxNum = number;
                }
                if (number < minNum) {
                    minNum = number;
                }
            } else {
                break;
            }
            s1.nextLine();
        }
        System.out.println("Min = " + minNum + " , Max = " + maxNum);
        s1.close();
    }

    public static void main(String[] args) {

        minmax();
    }
}
