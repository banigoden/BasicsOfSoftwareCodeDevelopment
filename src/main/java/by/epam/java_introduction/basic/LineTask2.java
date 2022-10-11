package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LineTask2 {
    /*
    Вычислить значение выражения по формуле( все переменные принимают действительные значения)
    */

    public static void main(String[] args) {

        double a, b, c;

        System.out.println("Enter a: ");
        a = ScannerDouble();
        System.out.println("Enter b: ");
        b = ScannerDouble();
        System.out.println("Enter c: ");
        c =  ScannerDouble();


        double result =(b + Math.sqrt(Math.pow(b, 2) + 4 * a *c )) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Result task2 = " + result);
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
