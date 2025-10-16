
package ControlStructures.Ex93;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Check for prime number");
        System.out.println();

        int num = 0;
        boolean isPrime = false;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        num = inputs.nextInt();

        if (num <= 1) {
            isPrime = false;
        } else if (num <= 3) {
            isPrime = true;
        } else if (num % 2 == 0) {
            isPrime = false;
        } else {
            isPrime = true;
            int limit = (int) Math.sqrt(num);
            for (int i = 3; i <= limit; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        inputs.close();

    }
    
}
