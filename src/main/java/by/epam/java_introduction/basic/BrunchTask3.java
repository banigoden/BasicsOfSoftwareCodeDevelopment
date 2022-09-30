package by.epam.java_introduction.basic;

import java.util.Scanner;

public class BrunchTask3 {
    /*
    Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    Определить, будут ли они расположены на одной прямой.
     */

    public static void main(String[] args) {

        int x1 = ScannerInt();
        int y1 = ScannerInt();
        int x2 = ScannerInt();
        int y2 = ScannerInt();
        int x3 = ScannerInt();
        int y3 = ScannerInt();
        //sqrt(sqr(x1-x2)+sqr(y1-y2));
        //abs(a-b)>=c)or(a+b<=c)
        System.out.println("task9");
        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("Points are lie on the straight");
        }else {
            System.out.println("No");
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
