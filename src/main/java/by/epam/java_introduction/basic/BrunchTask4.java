package by.epam.java_introduction.basic;

import java.util.Scanner;

public class BrunchTask4 {
     /*
     Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
     Определить, пройдет ли кирпич через отверстие.
     */

    public static void main(String[] args) {

        System.out.print("Enter a side of hole A: ");
        int a = ScannerInt();
        System.out.print("Enter a side of hole B: ");
        int b = ScannerInt();
        System.out.print("Enter a coordinate of brick x: ");
        int x = ScannerInt();
        System.out.print("Enter a coordinate of brick y: ");
        int y = ScannerInt();
        System.out.print("Enter a coordinate of brick z: ");
        int z = ScannerInt();

        if (a >= y && b >= x || a >= x && b >= y)
            System.out.println("The brick is passed.");
        else
            System.out.println("The brick is not passed.");
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
}
