package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LineTask3 {

    /*
   Вычислить значение выражения по формуле( все переменные принимают действительные значения)
   */

    public static void main(String[] args) {

        double x, y;

        System.out.println("Enter x: ");
        x = ScannerDouble();
        System.out.println("Enter y: ");
        y = ScannerDouble();

        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Result task3 = " + result);
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
