package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LoopTask5 {
    /*
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид:   a =  1/2^n + 1/3^n;
     */

    public static void main(String[] args) {

        System.out.print("Enter a positive value: ");
        double e;
        e = ScannerDouble();

        int n = 0;
        double sum = 0;
        System.out.println("Print a series of common member series: ");
        for (int i = 0; i <= 10; i++) {
            ++n;
            System.out.println();
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
                sum = sum + a;
            System.out.printf(" sum is %f", sum);
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
