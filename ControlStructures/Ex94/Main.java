
package ControlStructures.Ex94;

public class Main {
   
    public static void main(String[] args) {

        System.out.println("Print out all odd numbers less than 100 except the numbers 5, 7, 93");
        System.out.println();

        for (int i = 1; i < 100; i += 2) {
            if (i != 5 && i != 7 && i != 93) {
                System.out.print(i + " ");
            }
        }

    }
    
}
