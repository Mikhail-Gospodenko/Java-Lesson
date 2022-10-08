public class work1 {
    public static void main(String[] args) {
        calculate();
        trueOrFalse();
        negativity();
        positivity();
        negativity();
        greeting();
        leaping();


    }

    // задание 3
    static double calculate() {
        int a, b, c, d, result;
        a = 123;
        b = 672;
        c = 1290;
        d = 12;
        result = a * (b + (c / d));
        System.out.println("Answer is " + result);
        return result;
    }

    // задание 4
    static boolean trueOrFalse() {
        int number1 = 12;
        int number2 = 21;
        int resultOfPlus = number1 + number2;
        if ((resultOfPlus >= 10 && resultOfPlus <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    // задание 5
    static void positivity() {
        int in = -5;
        if (in >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // задание 6
    static boolean negativity() {
        int otr = -2;
        if (otr < 0) {
            return true;
        } else {
            return false;
        }
    }

    // задание 7
    static void greeting() {
        String name = "Михаил";
        System.out.println("Привет, " + name + "!");
    }

    // задание 8
    static void leaping() {
        double year, q, w, e, res1, res2, res3;
        year = 2024;
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



