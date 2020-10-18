package practice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerException {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int a = scanner.nextInt();
        int b;
        System.out.println("Insert second number: ");
        try {
            b = scanner.nextInt();
        } catch (InputMismatchException e) {
            b = scanner.nextInt();
            System.out.println("Please try again to insert second integer: ");
        }
        int c = a + b;
        System.out.println("Total is: "+c);
    }
}
