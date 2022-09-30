package by.epam.java_introduction.basic;

public class BrunchTask2 {
    /*
    Найти max{min(a, b), min(c, d)}
    */

    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int c = 32;
        int d = 24;

        int result = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("Result task8 = " +result);
    }
}
