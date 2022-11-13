package homework4;

import java.util.Scanner;
import java.util.Random;

public class GuessWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Угадайте слово");
        Random rand = new Random();
        int guessNumber = rand.nextInt(words.length);
        String guessWord = words[guessNumber];
        System.out.println(guessWord);

        boolean isGuess = false;
        do {
            String userWord = scan.nextLine();
        if (userWord.equals(guessWord)) {
                isGuess = true;
                System.out.println("Вы угадали правильное слово");
            } else {
                checkWorld(guessWord, userWord);
            }
        } while(!isGuess);
    }

    private static void checkWorld(String guessWord, String userWord) {
        System.out.println("Вы не угадали");
        for (int i = 0; i < guessWord.length(); i++) {
            if (userWord.length() > i && guessWord.charAt(i) == userWord.charAt(i)) {
                System.out.print(guessWord.charAt(i));
            } else {
                System.out.print("#");
            }
        }
        System.out.println();
    }
}

