package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LineTask6 {

    /*
    Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае:
     */

    public static void main(String[] args) {

        int x, y;

        System.out.print("Enter x coordinate: ");
        x = ScannerInt();
        System.out.print("Enter y coordinate: ");
        y = ScannerInt();

        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)) {
            System.out.println("true");
        }else {
            System.out.println("false");
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
}
