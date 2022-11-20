package homework5;

/* Крестики-нолики в процедурном стиле
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
*/

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int FIELD_SIZE = 3;         // размер игрового поля
    public static final int DOTS_TO_WIN = 3;        // сколько ячеек нужно подряд заполнить, чтобы победить

    public static final char EMPTY_DOT = '.';       // заполнитель для пустой ячейки
    public static final char HUMAN_TURN = 'X';
    public static final char IO_TURN = 'O';
    public static Scanner scan = new Scanner(System.in);
    public static char[][] gameField;               // игровое поле - в виде двумерного массива символов

    public static void initGameField() {
        gameField = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                gameField[i][j] = EMPTY_DOT;
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
        if(x >= 0 && x < FIELD_SIZE && y >= 0 && y < FIELD_SIZE && gameField[y][x] == EMPTY_DOT){
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
        gameField[y][x] = HUMAN_TURN;
    }

    public static void ioTurn() {
        int x, y;
        do {
            x = new Random().nextInt(FIELD_SIZE);
            y = new Random().nextInt(FIELD_SIZE);
        } while (!isCellAvailable(x, y));
        System.out.println("ИИ походил в ячейку " + (x + 1) + " " + (y + 1));
        gameField[y][x] = IO_TURN;
    }

    public static boolean isWin(char playerDot) {
        int hor, ver;
        int diagMain, diagSecond;
        for (int i = 0; i < FIELD_SIZE; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (gameField[i][j] == playerDot) {                          // горизонтальная линия
                    hor++;
                } else if (gameField[i][j] != playerDot && hor < DOTS_TO_WIN) {
                    hor = 0;
                }
                if (gameField[j][i] == playerDot) {                          // вертикальная линия
                    ver++;
                }   else if (gameField[j][i] != playerDot && ver < DOTS_TO_WIN) {
                    ver = 0;
                }
            }
            if (hor >= DOTS_TO_WIN || ver >= DOTS_TO_WIN) {
                return true;
            }
        }

        for (int j = 0; j < FIELD_SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = j + i;
                if (k < FIELD_SIZE) {
                    if (gameField[i][k] == playerDot) {                      // главная диагональ
                        diagMain++;
                    } else if (gameField[i][k] != playerDot && diagMain < DOTS_TO_WIN) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        for (int j = 1; j < FIELD_SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = j + i;
                if (k < FIELD_SIZE) {
                    if (gameField[k][i] == playerDot) {
                        diagMain++;
                    } else if (gameField[k][i] != playerDot && diagMain < DOTS_TO_WIN) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        for (int j = 0; j < FIELD_SIZE; j++) {
            diagSecond = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = (FIELD_SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < FIELD_SIZE) {
                    if (gameField[l][k] == playerDot) {                     // вторая диагональ
                        diagSecond++;
                    } else if (gameField[l][k] != playerDot && diagSecond < DOTS_TO_WIN) {
                        diagSecond = 0;
                    }
                }
                if (diagSecond >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        for (int j = 1; j < FIELD_SIZE; j++) {
            diagSecond = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = (FIELD_SIZE - 1) - j - i;
                if (k >= 0) {
                    if (gameField[i][k] == playerDot) {
                        diagSecond++;
                    } else if (gameField[i][k] != playerDot && diagSecond < DOTS_TO_WIN) {
                        diagSecond = 0;
                    }
                }
                if (diagSecond >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw() {                            // ничья
        for (char[] aGameField : gameField) {
            for (int j = 0; j < gameField.length; j++) {
                if (aGameField[j] == EMPTY_DOT) {
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
                    if (isWin(HUMAN_TURN)) {
                        System.out.println("Вы победили");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    ioTurn();
                    printGameField();
                    if (isWin(IO_TURN)) {
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
                    if (isWin(IO_TURN)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    humanTurn();
                    printGameField();
                    if (isWin(HUMAN_TURN)) {
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