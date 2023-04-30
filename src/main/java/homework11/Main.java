package homework11;

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого
// размера необходимо бросить исключение MyArraySizeException.

//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то
// элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
// брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.

//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
// MyArrayDataException, и вывести результат расчета.

public class Main {

    public static void main(String[] args) throws Exception {

        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect4 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "a", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            checkArraySize(correct);
            checkArraySize(incorrect);
            checkArraySize(incorrect2);
            isParsable(correct);
            isParsable(incorrect4);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void checkArraySize(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].length != 4)
                throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" +
                        " строке", i));

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }
    }

    public static void isParsable(String[][] arr) throws MyArrayDataException {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                try {
                    summa += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("ERROR! Не удалось преобразовать \"%s\" в число - элемент массива [%d,%d]", arr[i][j], i, j));
                }
            }
        }
        System.out.println(summa);

    }
}




