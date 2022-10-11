package by.epam.java_introduction.basic;

public class BrunchTask1 {
    /*
    Даны два угла треугольника (в градусах).
    Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
    */

    public static void main(String[] args) {

        final int SUM_OF_ANGLE_TRIANGLE = 180;
        int firstAngle, secondAngle;

        firstAngle = 45;
        secondAngle = 90;

        if (SUM_OF_ANGLE_TRIANGLE - (firstAngle + secondAngle) > 0 ){
            System.out.println("There is triangle");
            if ((firstAngle == 90) || (secondAngle == 90) || (firstAngle + secondAngle == 90)){
                System.out.println("Triangle is rectangular");
            }else {
                System.out.println("Triangle is not rectangular");
            }
        }else {
            System.out.println("There is no triangle");
        }
    }
}
