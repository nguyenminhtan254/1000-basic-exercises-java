package ControlStructures.Ex95;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Replace all negative numbers with their absolute values");
        System.out.println();

        double dNum1 = 0;
        double dNum2 = 0;
        double dNum3 = 0;

        Scanner inputs = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.#");

        System.out.print("Enter a = ");
        dNum1 = inputs.nextDouble();
        System.out.print("Enter b = ");
        dNum2 = inputs.nextDouble();
        System.out.print("Enter c = ");
        dNum3 = inputs.nextDouble();

        if (dNum1 < 0) dNum1 = - dNum1;
        if (dNum2 < 0) dNum2 = - dNum2;
        if (dNum3 < 0) dNum3 = - dNum3;
        
        System.out.println("|a| = " + fmt.format(dNum1));
        System.out.println("|b| = " + fmt.format(dNum2));
        System.out.println("|c| = " + fmt.format(dNum3));

        inputs.close();

    }
    
}
