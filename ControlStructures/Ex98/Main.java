
package ControlStructures.Ex98;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Solving a linear system:");
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");
        System.out.println();

        double a, b, c, d, e, f;
        double x, y;
        String message = "";

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = inputs.nextDouble();
        System.out.print("Enter b: ");
        b = inputs.nextDouble();
        System.out.print("Enter c: ");
        c = inputs.nextDouble();
        System.out.print("Enter d: ");
        d = inputs.nextDouble();
        System.out.print("Enter e: ");
        e = inputs.nextDouble();
        System.out.print("Enter f: ");
        f = inputs.nextDouble();

        System.out.println();
        System.out.println("Solving the problem:");
        System.out.println(a + "x + " + b + "y = " + c);
        System.out.println(d + "x + " + e + "y = " + f);

        // Crammer's Rule
        double D = a * e - d * b;
        double Dx = c * e - f * b;
        double Dy = a * f - d * c;

        if (D != 0) {
            x = Dx / D;
            y = Dy / D;
            message = "\n    x = " + x + "\n    y = " + y;
        } else {
            if (Dx != 0 && Dy != 0) {
                message = "No solution";
            } else {
                message = "Infinitely many solutions";
            }
        }

        System.out.println();
        System.out.println("Solution: " + message);
        
        inputs.close();

    }
    
}
