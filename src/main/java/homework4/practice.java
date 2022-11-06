package homework4;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class practice {
    public static void main(String[] args) {
        boolean b;

        Scanner scan = new Scanner(System.in);
        int[] randomNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        do {
            System.out.println("Угадайте число от 0 до 9");
            int try1 = scan.nextInt();
            Random rand = new Random();
            int x = rand.nextInt(9);
            if (try1 == randomNum[x]) {
                System.out.println("Вы вы угадали правильное число");
            } else if (try1 > randomNum[x]) {
                System.out.println("Число меньше");
            } else if (try1 < randomNum[x]) {
                System.out.println("Число больше");
            }
            int try2 = scan.nextInt();
            if (try2 == randomNum[x]) {
                System.out.println("Вы вы угадали правильное число");
            } else if (try2 > randomNum[x]) {
                System.out.println("Число меньше");
            } else if (try2 < randomNum[x]) {
                System.out.println("Число больше");
            }
            int try3 = scan.nextInt();
            if (try3 == randomNum[x]) {
                System.out.println("Вы вы угадали правильное число");
            } else if (try3 > randomNum[x]) {
                System.out.println("Вы не угадали");
            } else if (try3 < randomNum[x]) {
                System.out.println("Вы не угадали");
            }
            System.out.println("Попробуйте ещё 1 - да");
            int again = scan.nextInt();
            if (again == 1) {
                b = true;
            }
            while (!b) ;
        }
    }
}
