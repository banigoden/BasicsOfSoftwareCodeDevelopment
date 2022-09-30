package by.epam.java_introduction.basic;

public class LoopTask6 {
    /*
    Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    */

    public static void main(String[] args) {

        //Unicode 65,536
        System.out.println("task17");
        char charsSign = '\u0000';
        for (int i = 0; i < 65536; i++) {
            System.out.println("Result task17  sign: " + (char) i + "  number: " + i);
        }
        //ASCII 256
        for (int i = 0; i < 256; i++) {
            System.out.println("Result task17 sign: " + (char) i + "  number: " +  i);
        }

        char charsSigns  = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i<= 10000; i++){
            charsSigns++;
            charsNumber++;
            System.out.println("sign: " + charsSigns + "  number: " + charsNumber);
        }
    }
}
