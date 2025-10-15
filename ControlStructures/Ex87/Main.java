
package ControlStructures.Ex87;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Find the smallest positive integer n so that 1 + 2 + ... + n > 10000");
        System.out.println();

        int n = 0;
        int sum = 0;

        Scanner inputs = new Scanner(System.in);

        int count = 0;
        while (sum <= 10000) {
            sum += ++count;
        }
        
        n = count;

        System.out.println("Result n = " + n);

        inputs.close();

    }

}