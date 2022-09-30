package by.epam.java_introduction.basic;

public class LoopTask4 {
    /*
    Составить программу нахождения произведения квадратов первых двухсот чисел.
     */

    public static void main(String[] args) {

        long sum = 1 ;
        for (int i = 1; i <= 200; i++) { //После 33 вышло за пределы диапазона 10 раз и выдало 0 (слишком большое число)
            sum = sum * (i * i);
        }
        System.out.println("Result is " + sum);
//
//        BigInteger count = BigInteger.valueOf(1);
//        for (int i = 2; i <= 200; i++) {
//            count = count.multiply(BigInteger.valueOf((long) i * i));
//        }
//        System.out.println("Result = " + count);
    }
}
