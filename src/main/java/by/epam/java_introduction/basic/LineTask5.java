package by.epam.java_introduction.basic;

public class LineTask5 {
    /*
    Дано натуральное число Т. Вывести данное значение: ННч ММмин SSc.
     */

    public static void main(String[] args) {

        int init = 3666;
        int hours = init / 3600;
        int minutes = (init - (hours * 3600)) / 60;
        int seconds = (init - (hours * 3600)) - (minutes * 60);

        System.out.println("Result task5 = " + hours +"ч " + minutes + "мин " + seconds + "c");
    }
}
