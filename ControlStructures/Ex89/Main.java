
package ControlStructures.Ex89;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculate the sum of positive odd values less than N");
        System.out.println();

        int sum = 0;
        int n;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = inputs.nextInt();

        for (int i = 1; i < n; i+=2) {
            sum += i;
        }

        System.out.println("Result n = " + sum);

        inputs.close();

    }
    
}
