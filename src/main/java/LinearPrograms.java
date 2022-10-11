
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class LinearPrograms {

    public static void main(String[] args) {

        task4();
        task5();
       // task6();
        task7();
        task8();
       // task12();
        task14();
      //  task15();
      //  task16();
      //  task17();
        task19();
    }

    private static void task1(double a, double b, double c){
        /*
        Найдите значение функции: z = ((a – 3 )*b/2) + c.
        */
        double z = ((a-3) * b / 2) + c;
        System.out.println("Result task1 = " + z);
    }

    private static void task2(double a, double b, double c){
        /*
        Вычислить значение выражения по формуле
        */
        double result =(b + Math.sqrt(Math.pow(b, 2) + 4 * a *c )) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Result task2 = " + result);
    }

    private static void task3(double x, double y){

        /*
        Вычислить значение выражения по формуле
        */

        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Result task3 = " + result);
    }

    private static void task4(){

        /*
        Дано действительное число R вида nnn.ddd. Поменять местами дробную и целую части числа и вывести полученное значение числа.
        */

         double init = 343.567;
         int firstPart = (int) init;
         int secondPart = (int) ((init - firstPart) * 1000);
         double viseVerse = secondPart + (firstPart * 0.001);
         System.out.println("Result task4 = " + viseVerse);
    }

    private static void task5(){

        //Дано натуральное число Т. Вывести данное значение: ННч ММмин SSc.
        int init = 3666;
        int hours = init / 3600;
        int minutes = (init - (hours * 3600)) / 60;
        int seconds = (init - (hours * 3600)) - (minutes * 60);

        System.out.println("Result task5 = " + hours +"ч " + minutes + "мин " + seconds + "c");
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

    private static double ScannerDouble(){

        Scanner init = new Scanner(System.in);
        double number;

        while (!init.hasNextDouble()){
            init.next();
            System.out.println("Not valid value. Please enter new:");
        }
        number = init.nextDouble();
        return number;
    }

    private static void task6(){
        int x, y;
        System.out.println("task6");
        System.out.print("Enter x coordinate: ");
        x = ScannerInt();
        System.out.print("Enter y coordinate: ");
        y = ScannerInt();

        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4))
            System.out.println(true);
        else System.out.println(false);


    }
    private static void task7(){
        int firstAngle, secondAngle;
        System.out.println("Ramification");
        firstAngle = 45;
        secondAngle = 90;
        System.out.println("task1");

        if (180 - (firstAngle + secondAngle) > 0 ){
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

    private static void task8(){

        System.out.println("task2");
        int a = 5;
        int b = 8;
        int c = 32;
        int d = 24;

        int result = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("Result task8 = " +result);
    }

    private static void task9(){

        //  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
        //   Определить, будут ли они расположены на одной прямой.

        int x1 = ScannerInt();
        int y1 = ScannerInt();
        int x2 = ScannerInt();
        int y2 = ScannerInt();
        int x3 = ScannerInt();
        int y3 = ScannerInt();
        //sqrt(sqr(x1-x2)+sqr(y1-y2));
    //abs(a-b)>=c)or(a+b<=c)
        System.out.println("task9");
        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("Points are lie on the straight");
        }else {
            System.out.println("No");
        }
    }

    private static void task10(){

        System.out.println("task10");
        System.out.print("Enter a side of hole A: ");
        int a = ScannerInt();
        System.out.print("Enter a side of hole B: ");
        int b = ScannerInt();
        System.out.print("Enter a coordinate of brick x: ");
        int x = ScannerInt();
        System.out.print("Enter a coordinate of brick y: ");
        int y = ScannerInt();
        System.out.print("Enter a coordinate of brick z: ");
        int z = ScannerInt();

        if (a >= y && b >= x || a >= x && b >= y)
            System.out.println("The brick is passed.");
        else
            System.out.println("The brick is not passed.");

    }
    private static void task11() {

        System.out.println("task11");
        System.out.print("Enter x: ");
        double x = ScannerDouble();

        double a,b;
        if (x <= 3){
            a = Math.pow(x,2) - 3 * x + 9;
            System.out.printf("Result 1: %.1f ", a);
        }else if (x > 3){
            b = 1 / (Math.pow(x,3) + 6);
            System.out.printf("Result 2: %.1f ", b);
        }
    }

    private static void task12() {

        System.out.println("Cycles");
        System.out.println("task12");

        while (true) {
            System.out.print("Enter a positive value: ");
            int value = ScannerInt();
            if (value > 0) {
                long sum = LongStream.range(1, value)
                        .reduce(value, Long::sum);
                System.out.println(sum);
                break;
            }
        }
    }

    private static void task13() {

        System.out.println("task13");
        System.out.println("Enter a value a: ");
        int a = ScannerInt();
        System.out.println("Enter a value b: ");
        int b = ScannerInt();
        System.out.println("Enter a step h: ");
        double h = ScannerDouble();
        System.out.println("Enter the value of x: ");
        int x = ScannerInt();

        int y;
        for(double i = a; i <= b ; i = i + h) {
            if (x > 2) y = x;
            else y = -x;
            System.out.println("Result: x = "+ x + "\n" + "y = " + y);
        }

    }

    private static void task14() {

        System.out.println("task14");
        int sum = IntStream.range(1, 101)
                .map(x -> (int)Math.pow(x,2)).sum();
        System.out.println("Result = " + sum);

    }
    private static void task15() {

        long s = 1 ;
        for (int i = 1; i <= 200; i++) { //После 33 вышло за пределы диапазона 10 раз и выдало 0 (слишком большое число)
            s =s*(i*i);
            System.out.println("s " + s);
        }
        System.out.println("Result is " + s);
//
//        BigInteger count = BigInteger.valueOf(1);
//        for (int i = 2; i <= 200; i++) {
//            count = count.multiply(BigInteger.valueOf((long) i * i));
//        }
//        System.out.println("Result = " + count);
    }

    private static void task16() {

        System.out.println("task16");
        System.out.print("Enter a positive value: ");
        double e;
        e = ScannerDouble();

        int n = 0;
        double sum = 0;
        System.out.println("Print a series of common member series: ");
        for (int i = 0; i<=10; i++) {
            ++n;
            System.out.print("\n");
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
                sum = sum + a;
            System.out.printf(" sum is %f", sum);
        }
    }

    private static void task17() {
        /*
         Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
         */

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
    }

    private static void task18() {

        System.out.println("task18");
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

    private static void task19() {

        /*
         8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
        */
        System.out.println("task19");

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

       // IntStream.range(1, (int)first).forEach(System.out::print);
        //IntStream.range(1,valueOfNumber.charAt(1)).forEach(System.out::print);


    }

}
