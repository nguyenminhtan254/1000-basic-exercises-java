
package ControlStructures.Ex91;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Printing all odd positive number less than 100");
        System.out.println();

        Scanner inputs = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            System.out.print((2 * i - 1) + " ");
        }

        inputs.close();

    }

}
