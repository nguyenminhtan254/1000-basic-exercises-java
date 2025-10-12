
package ControlStructures.Ex83;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Check if 2 real numbers have the same sign");
        System.out.println();

        double dNum1 = 0;
        double dNum2 = 0;
        String message = "";

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        System.out.print("Number 1 = ");
        dNum1 = inputs.nextDouble();
        System.out.print("Number 2 = ");
        dNum2 = inputs.nextDouble();

        System.out.println();
        if (dNum1 * dNum2 < 0) {
            message = "They have opposite signs";
        } else {
            message = "They have same signs";
        }

        System.out.println(message);

        inputs.close();

    }

}
