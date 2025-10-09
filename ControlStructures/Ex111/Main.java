
package ControlStructures.Ex111;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Print a solid isosceles triangle, "
                            + "a hollow isosceles triangle, "
                            + "a solid right isosceles triangle, "
                            + "a hollow right isosceles triangle");
        System.out.println();

        int height = 0;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a side of the triangle: ");
        height = inputs.nextInt();

        System.out.println();

        // Solid isosceles triangle
        for (int row = 1; row <= height; row++) {
            int numberOfCol = height + row - 1;
            for (int col = 1; col <= numberOfCol; col++) {
                if (col <= height - row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Hollow isosceles triangle
        for (int row = 1; row <= height; row++) {
            int numberOfCol = height + row - 1;
            for (int col = 1; col <= numberOfCol; col++) {
                if (row == height
                    || col == numberOfCol
                    || col == height - row + 1) {
                        System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Solid right isosceles triangle
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Hollow right isosceles triangle
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1
                    || row == height
                    || col == row) {
                    System.out.print("* ");        
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        inputs.close();

    }

}