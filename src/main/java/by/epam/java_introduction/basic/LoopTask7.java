package by.epam.java_introduction.basic;

import java.util.Scanner;

public class LoopTask7 {

    /*
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
     */

    public static void main(String[] args) {

        System.out.println("Enter m: ");
        int m = ScannerInt();
        System.out.println("Enter n: ");
        int n = ScannerInt();

        while (m <= n) {
            System.out.print("\n number: " + m);
            System.out.print(" its dividers: ");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
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
