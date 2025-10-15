package ControlStructures.Ex90;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Find the largest positive number m so that 1 + 2 + ... + m < N");
        System.out.println();

        int m = 0;
        int n = 0;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter N = ");
        n = inputs.nextInt();

        int count = 0;
        int sum = 0;
        while (sum < n) {
            count++;
            sum += count;
        }
        m = count - 1;

        System.out.println("Reuslt m = " + m);

        inputs.close();

    }

}
