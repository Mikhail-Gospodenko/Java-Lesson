package homework4;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class practice {
    public static void main(String[] args) {
        boolean b = false;

        Scanner scan = new Scanner(System.in);
        /*do {
            Random rand = new Random();
            int guessNumber = rand.nextInt(9);
            System.out.println("Угадайте число от 0 до 9");

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
      */
        //* Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
        // "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы

        Random rand = new Random();
        System.out.println("Угадайте слово");
        int i = 0;
        int guessNumber = rand.nextInt(9);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guessWord = words[guessNumber];

        do{
            String userWord = scan.nextLine();
        if (userWord == words[guessNumber] ) {
                System.out.println("Вы угадали правильное слово");
            } else {
                System.out.println("Вы не угадали правильное слово, вот первые символы: " + guessWord.charAt(0) + guessWord.charAt(1) + "##########");
            }
        } while(true);
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

