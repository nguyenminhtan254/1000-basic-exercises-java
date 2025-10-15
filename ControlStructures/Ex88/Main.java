
package ControlStructures.Ex88;

public class Main {

    public static void main(String[] args) {

        System.out.println("Print all characters from A to Z");
        System.out.println();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();

        char c = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (c + i) + " ");
        }

    }
    
}
