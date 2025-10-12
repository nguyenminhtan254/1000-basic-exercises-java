
package ControlStructures.Ex82;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Find the largest number of 3 real numbers a, b, c");
        System.out.println();

        double[] dNums = new double[3];
        double largest = 0;

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + " = ");
            dNums[i] = inputs.nextDouble();
        }

        largest = dNums[0];
        for (int i = 1; i < 3; i++) {
            if (dNums[i] > largest) {
                largest = dNums[i];
            }
        }

        System.out.println();
        System.out.println("The largest number is " + largest);

        inputs.close();

    }

}
