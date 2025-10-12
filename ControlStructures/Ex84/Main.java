
package ControlStructures.Ex84;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Solve and argue the linear equation ax + b = 0");
        System.out.println();

        double a = 0;
        double b = 0;
        double x = 0;
        String solution;

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter the equation: ");
        System.out.print("a = ");
        a = inputs.nextDouble();
        System.out.print("b = ");
        b = inputs.nextDouble();

        System.out.println();
        System.out.println("Equation: " + a + "x + (" + b + ") = 0");

        if (a == 0) {
            if (b == 0) {
                solution = "Infinite solutions (all real number)";
            } else {
                solution = "No solution";
            }            
        } else {
            x = -b / a;
            solution = "x = " + x;
        }

        System.out.println();
        System.out.println("Solution: " + solution);

        inputs.close();
        
    }

}