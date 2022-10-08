public class hello2 {

    public static void main(String[] args) {
        int i = 2 ^ 32;
        int i1 = -2 ^ 32;
        short s = 32767;
        short s1 = -32768;
        byte bMax = 127;
        byte b1 = -128;
        long l = 2 ^ 64;
          long l1 = -2 ^ 64;

        System.out.println("Макcимальное значение byte = " + bMax);
        System.out.println("Минимальное значение byte = " + b1);

         System.out.println("\nМакcимальное значение int = " + i);
        System.out.println("Минимальное значение int = " + i1);

        System.out.println("\nМинимальное значени short = " + s);
        System.out.println("Максимальное значение short = " + s1);

        System.out.println("\nМакcимальное значение long = " + l);
        System.out.println("Минимальное значение long = " + l1);

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
    }
}
