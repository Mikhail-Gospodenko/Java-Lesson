package homework4;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class practice {
    public static void main(String[] args) {
        boolean b = false;

        Scanner scan = new Scanner(System.in);
        do {
            Random rand = new Random();
            int guessNumber = rand.nextInt(9);
            System.out.println("Угадайте число от 0 до 9");

            //Change
            boolean isGuess = false;
            int tryCount = 0;

            while (isGuess != true && tryCount < 3) {
                int userNumber = scan.nextInt();
                isGuess = isGuess(userNumber, guessNumber);
                tryCount++;
            }

            System.out.println("Попробуйте ещё 1 - да");
            int again = scan.nextInt();
            if (again == 1) {
                b = true;
            }
        } while (b);
    }

    static boolean isGuess(int userNumber, int guessNumber) {
        if (userNumber == guessNumber) {
            System.out.println("Вы угадали правильное число");
            return true;
        } else if (userNumber > guessNumber) {
            System.out.println("Число меньше");
        } else if (userNumber < guessNumber) {
            System.out.println("Число больше");
        }
        return false;
    }
}
