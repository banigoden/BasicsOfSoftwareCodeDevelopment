package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LoopTask8 {

    /*
    Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */

    public static void main(String[] args) {

        System.out.print("Enter а: ");
        int a = ScannerInt();
        System.out.print("Enter b: ");
        int b = ScannerInt();

        String one = String.valueOf(a);
        String two = String.valueOf(b);

        for (int i = 0; i < one.length(); i++) {
            System.out.print(one.charAt(i));
        }

        System.out.println();

        for (int i = 0; i < two.length(); i++) {
            System.out.print(two.charAt(i));
        }

        System.out.println("\n The same numbers from two lines is: ");

        for (int i = 0; i < one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {
                if (one.charAt(i) == two.charAt(j)) {
                    System.out.print("|" + two.charAt(j));
                }
            }
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
