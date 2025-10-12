
package ControlStructures.Ex85;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Indicate which month of the year is in which quarter");
        System.out.println();

        int month = 0;
        int quarter = 0;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        month = inputs.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
                quarter = 1;
                break;
            case 4:
            case 5:
            case 6:
                quarter = 2;
                break;
            case 7:
            case 8:
            case 9:
                quarter = 3;
                break;
            case 10:
            case 11:
            case 12:
                quarter = 4;
        }

        System.out.println();
        if (quarter == 0) {
            System.out.println("Invalid month! Please enter a number between 1 and 12.");
        } else {
            System.out.println("Month " + month + " is in the Quarter " + quarter);
        }

        inputs.close();

    }
    
}
