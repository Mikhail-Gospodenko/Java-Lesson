package homework5;

/* Крестики-нолики в процедурном стиле
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
*/

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int fieldSize = 5;         // размер игрового поля
    public static final int dotsToWin = 4;        // сколько ячеек нужно подряд заполнить, чтобы победить

    public static final char emptyDot = '.';       // заполнитель для пустой ячейки
    public static final char humanTurn = 'X';
    public static final char ioTurn = 'O';
    public static Scanner scan = new Scanner(System.in);
    public static char[][] gameField;               // игровое поле - в виде двумерного массива символов

    public static void initGameField() {
        gameField = new char[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                gameField[i][j] = emptyDot;
            }
        }
    }

    public static void printGameField() {
        for (int i = 0; i <= gameField.length; i++) {    // горизонтальная шапка
            System.out.print(i == 0 ? "  " : i + " ");   // замена 0 двумя пробелами
        }
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + " ");            // шапка по координате Y
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellAvailable(int x, int y) {
        if(x >= 0 && x < fieldSize && y >= 0 && y < fieldSize && gameField[y][x] == emptyDot){
            return true;
        }
        return false;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.print("Введите координаты хода через пробел в формате X Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!isCellAvailable(x, y));
        gameField[y][x] = humanTurn;
    }

    public static void ioTurn() {
        int x, y;
        do {
            x = new Random().nextInt(fieldSize);
            y = new Random().nextInt(fieldSize);
        } while (!isCellAvailable(x, y));
        System.out.println("ИИ походил в ячейку " + (x + 1) + " " + (y + 1));
        gameField[y][x] = ioTurn;
    }

    public static boolean isWin(char playerDot) {
        int hor, ver;
        int diagMain, diagSecond;
        for (int i = 0; i < fieldSize; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < fieldSize; j++) {
                if (gameField[i][j] == playerDot) {                          // горизонтальная линия
                    hor++;
                } else if (gameField[i][j] != playerDot && hor < dotsToWin) {
                    hor = 0;
                }
                if (gameField[j][i] == playerDot) {                          // вертикальная линия
                    ver++;
                }   else if (gameField[j][i] != playerDot && ver < dotsToWin) {
                    ver = 0;
                }
            }
            if (hor >= dotsToWin || ver >= dotsToWin) {
                return true;
            }
        }

        for (int j = 0; j < fieldSize; j++) {
            diagMain = 0;
            for (int i = 0; i < fieldSize; i++) {
                int k = j + i;
                if (k < fieldSize) {
                    if (gameField[i][k] == playerDot) {                      // главная диагональ
                        diagMain++;
                    } else if (gameField[i][k] != playerDot && diagMain < dotsToWin) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= dotsToWin) {
                    return true;
                }
            }
        }
        for (int j = 1; j < fieldSize; j++) {
            diagMain = 0;
            for (int i = 0; i < fieldSize; i++) {
                int k = j + i;
                if (k < fieldSize) {
                    if (gameField[k][i] == playerDot) {
                        diagMain++;
                    } else if (gameField[k][i] != playerDot && diagMain < dotsToWin) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= dotsToWin) {
                    return true;
                }
            }
        }
        for (int j = 0; j < fieldSize; j++) {
            diagSecond = 0;
            for (int i = 0; i < fieldSize; i++) {
                int k = (fieldSize - 1) - i;
                int l = j + i;
                if (k >= 0 && l < fieldSize) {
                    if (gameField[l][k] == playerDot) {                     // вторая диагональ
                        diagSecond++;
                    } else if (gameField[l][k] != playerDot && diagSecond < dotsToWin) {
                        diagSecond = 0;
                    }
                }
                if (diagSecond >= dotsToWin) {
                    return true;
                }
            }
        }
        for (int j = 1; j < fieldSize; j++) {
            diagSecond = 0;
            for (int i = 0; i < fieldSize; i++) {
                int k = (fieldSize - 1) - j - i;
                if (k >= 0) {
                    if (gameField[i][k] == playerDot) {
                        diagSecond++;
                    } else if (gameField[i][k] != playerDot && diagSecond < dotsToWin) {
                        diagSecond = 0;
                    }
                }
                if (diagSecond >= dotsToWin) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw() {                            // ничья
        for (char[] aGameField : gameField) {
            for (int j = 0; j < gameField.length; j++) {
                if (aGameField[j] == emptyDot) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initGameField();
        printGameField();

        switch (new Random().nextInt(2)) {
            case 0: {
                System.out.println("Ваш ход ");
                while (true) {
                    humanTurn();
                    printGameField();
                    if (isWin(humanTurn)) {
                        System.out.println("Вы победили");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    ioTurn();
                    printGameField();
                    if (isWin(ioTurn)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
                break;
            }
            case 1: {
                System.out.println("Ход ИИ!");
                while (true) {
                    ioTurn();
                    printGameField();
                    if (isWin(ioTurn)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    humanTurn();
                    printGameField();
                    if (isWin(humanTurn)) {
                        System.out.println("Вы победили");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
            }
        }
    }
}