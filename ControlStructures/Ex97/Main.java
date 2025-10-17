
package ControlStructures.Ex97;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Classify the types of a triangle based on 3 sides");
        System.out.println();

        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        String message = "";

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter first side: ");
        side1 = inputs.nextInt();
        System.out.print("Enter second side: ");
        side2 = inputs.nextInt();
        System.out.print("Enter third side: ");
        side3 = inputs.nextInt();

        if (side1 + side2 > side3
            && side2 + side3 > side1
            && side1 + side3 > side2) {
                
                message = "scalene triangle";
                if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)
                    || Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)
                    || Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)) {
                    message = "right triangle";
                } else if (side1 == side2 && side2 == side3) {
                    message = "equilateral trianble";
                } else if (side1 == side2
                           || side2 == side3
                           || side1 == side3) {
                    message = "isosceles triangle";
                }

        } else {
            message = "invalid triangle";
        }

        System.out.println("This is a " + message);

        inputs.close();

    }

}
