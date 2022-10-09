public class work1 {
    public static void main(String[] args) {
        calculate(123, 13,167,12);
        trueOrFalse(12,21);
        positivity(-5);
        negativity(-2);
        greeting("Михаил");
        leaping(2014);


    }

    // задание 3
    static double calculate(int a,int b,int c, int d) {
        int  result;
        result = a * (b + (c / d));
        System.out.println("Answer is " + result);
        return result;
    }

    // задание 4
    static boolean trueOrFalse(int number1, int number2) {
        int resultOfPlus = number1 + number2;
        if ((resultOfPlus >= 10 && resultOfPlus <= 20)) {
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
        double q, w, e, res1, res2, res3;
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
        }
    }
}



