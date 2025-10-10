
package ControlStructures.Ex112;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Print a solid rectangle and a hollow rectangle\n");

        int length;
        int width;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = inputs.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        width = inputs.nextInt();

        // Solid rectangle
        System.out.println();
        for (int row = 1; row <= width; row++) {
            for (int col = 1; col <= length; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Hollow rectangle
        System.out.println();
        for (int row = 1; row <= width; row++) {
            for (int col = 1; col <= length; col++) {
                if (row == 1
                    || row == width
                    || col == 1
                    || col == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        inputs.close();

    }
    
}