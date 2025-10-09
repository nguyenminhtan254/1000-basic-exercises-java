
package AlgorithmFlowchart.Ex1;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        
        System.out.println("Calculate S(n) = 1 + 2 + 3 + ... + n");

        int sum = 0;
        int limit = 0;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter n: ");
        limit = inputs.nextInt();

        for (int i =  1; i <= limit; i++) {
            sum += i;
        }

        System.out.println("S(n) = " + sum);

        inputs.close();

    }
    
}