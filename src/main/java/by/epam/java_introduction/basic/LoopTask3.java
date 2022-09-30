package by.epam.java_introduction.basic;

import java.util.stream.IntStream;

public class LoopTask3 {
    /*
    Найти сумму квадратов первых ста чисел.
     */

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++ ){
            sum += i * i;
        }

        System.out.println("Sum is " + sum);

//        int sum = IntStream.range(1, 101)
//                .map(x -> (int)Math.pow(x,2)).sum();
//        System.out.println("Result = " + sum);
    }
}
