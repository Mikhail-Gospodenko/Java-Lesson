package homework1;

public class Main {
    public static void main(String[] args) {
        int iMax = 2 ^ 32;
        int iMin = -2 ^ 32;
        short sMax = 32767;
        short sMin = -32768;
        byte bMax = 127;
        byte bMin = -128;
        long lMax = 2 ^ 64;
        long lMin = -2 ^ 64;

        System.out.println("Макcимальное значение byte = " + bMax);
        System.out.println("Минимальное значение byte = " + bMin);

        System.out.println("\nМакcимальное значение int = " + iMax);
        System.out.println("Минимальное значение int = " + iMin);

        System.out.println("\nМинимальное значени short = " + sMax);
        System.out.println("Максимальное значение short = " + sMin);

        System.out.println("\nМакcимальное значение long = " + lMax);
        System.out.println("Минимальное значение long = " + lMin);

        float f = 12.12f;
        double d = 213.421;

        System.out.println("\nЗначение float = " + f);
        System.out.println("Значение double = " + d);

        char ch = 'l';
        boolean bool = true;
        String str = "Hello, world!";

        System.out.println("\nЗначение символьного char = " + ch);
        System.out.println("Значение логического boolean = " + bool);
        System.out.println("Значение строкового String = " + str);

        int inc = 12;
        System.out.println("\n Значение int = " + inc);
        inc++;
        System.out.println("Значение int после инкремента = " + inc);

        calculate(123, 13, 167, 12);
        System.out.println(trueOrFalse(12, 21));
        positivity(-5);
        negativity(-2);
        greeting("Михаил");

        System.out.println();
        leaping(1996);
        leaping(2000);
        leaping(2100);
        leaping(2001);
        //leaping(2014);
    }

    // задание 3
    static double calculate(int a, int b, int c, int d) {
        int result;
        result = a * (b + (c / d));
        System.out.println("Answer is " + result);
        return result;
    }

    // задание 4
    static boolean trueOrFalse(int number1, int number2) {
        int resultOfPlus = number1 + number2;
        if (resultOfPlus >= 10 && resultOfPlus <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // задание 5
    static void positivity(int in) {
        if (in >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // задание 6
    static boolean negativity(int otr) {
        if (otr < 0) {
            return true;
        } else {
            return false;
        }
    }

    // задание 7
    static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // задание 8
    static void leaping(int year) {
        /*double q, w, e, res1, res2, res3;
        q = 4;
        w = 100;
        e = 400;
        res1 = year / w;
        res2 = year / q;
        res3 = year / e;
        if ((res2 % 1 == 0 && res1 % 1 != 0)) {
            System.out.println("Год високосный");
        } else if ((res2 % 1 ==0 && res1 % 1 == 0 && res3 % 1 ==0)) {
            System.out.println("Год високосный");
        } else{
            System.out.println("Год не високосный");
        }*/

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}



