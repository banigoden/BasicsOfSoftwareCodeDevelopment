package by.epam.java_introduction.basic;

public class LineTask4 {
    /*
    Дано действительное число R вида nnn.ddd.
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
     */

    public static void main(String[] args) {

        double init = 343.567;

        int firstPart = (int) init;
        int secondPart = (int) ((init - firstPart) * 1000);

        double viseVerse = secondPart + (firstPart * 0.001);
        System.out.println("Result task4 = " + viseVerse);
    }
}
