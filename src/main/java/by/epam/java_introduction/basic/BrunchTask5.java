package by.epam.java_introduction.basic;

import java.util.Scanner;

public class BrunchTask5 {
    /*
    Вычислить значение функции:
    */

    public static void main(String[] args) {

        System.out.print("Enter x: ");
        double x = ScannerDouble();

        double a, b;
        if (x <= 3){
            a = Math.pow(x,2) - 3 * x + 9;
            System.out.printf("Result 1: %.1f ", a);
        }else if (x > 3){
            b = 1 / (Math.pow(x,3) + 6);
            System.out.printf("Result 2: %.1f ", b);
        }
    }

    private static double ScannerDouble(){

        Scanner init = new Scanner(System.in);
        double number;

        while (!init.hasNextDouble()){
            init.next();
            System.out.println("Not valid value. Please enter new:");
        }
        number = init.nextDouble();
        return number;
    }
}
