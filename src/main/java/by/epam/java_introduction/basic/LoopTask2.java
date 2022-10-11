package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LoopTask2 {
    /*
    Вычислить значения функции на отрезке [а,b] c шагом h:
    */

    public static void main(String[] args) {

        System.out.println("Enter a value a: ");
        int a = ScannerInt();
        System.out.println("Enter a value b: ");
        int b = ScannerInt();
        System.out.println("Enter a step h: ");
        double h = ScannerDouble();
        System.out.println("Enter the value of x: ");
        int x = ScannerInt();

        int y = 0;
        for(double i = a; i <= b ; i = i + h) {
            if (x > 2) y = x;
            else y = -x;
            System.out.println("Result: x = "+ x + "\n" + "y = " + y);
        }
    }

    private static int ScannerInt(){

        Scanner init = new Scanner(System.in);
        int number;
        while (!init.hasNextInt()){
            init.next();
            System.out.println("Not valid value. Please enter new:");
        }
        number = init.nextInt();
        return number;
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
