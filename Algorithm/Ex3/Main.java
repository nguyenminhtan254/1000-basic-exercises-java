
package Algorithm.Ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculate S(n) = 1 + 1/2 + 1/3 + ... + 1/n");

        double sum = 0;
        int limit = 0;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter n: ");
        limit = inputs.nextInt();

        for (int i = 1; i <= limit; i++) {
            sum += 1.0 / i;
        }

        System.out.println("S(" + limit + ") = " + sum);

        inputs.close();

    }

}