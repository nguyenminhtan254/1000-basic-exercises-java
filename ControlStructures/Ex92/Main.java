
package ControlStructures.Ex92;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Greatest Common Divisor (GCD) of 2 positive integers");
        System.out.println();

        int first;
        int second;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = inputs.nextInt();

        System.out.print("Enter the second number: ");
        second = inputs.nextInt();

        // Euclidean Algorithm
        while (second != 0) {
            int temp = first % second;
            first = second;
            second = temp;
        }

        System.out.println("GCD: " + first);

        inputs.close();

    }

}
