package by.epam.java_introduction.basic;

import java.util.Scanner;
import java.util.stream.LongStream;

public class LoopTask1 {
    /*
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
    */

    public static void main(String[] args) {

        System.out.print("Enter a positive value: ");
        int value = ScannerInt();
        int z = 0;
        for (int i = 1; i <= value; i++){
            z+=i;
        }
        System.out.println("Sum of numbers from one is " + z);

//        while (true) {
//            System.out.print("Enter a positive value: ");
//            int value = ScannerInt();
//            if (value > 0) {
//                long sum = LongStream.range(1, value)
//                        .reduce(value, Long::sum);
//                System.out.println(sum);
//                break;
//            }
//        }
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
