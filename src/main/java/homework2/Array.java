package homework2;

public class Array {
    public static void main(String[] args) {
        //задание 6
        int[] checkBalance = {2, 2, 2, 1, 2, 2, 10, 1};
        amountIs(checkBalance);

        //задание 7
        int[] array = {5, 8, 1, 4};
        int n = 1;
        moving(array, n);


        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println(" ");
        System.out.println("\nЗадание 1 :");
        int[] arrayZeroOne = {0, 1, 0, 0, 0, 1, 1};

        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        printArray(array);

        //Тернарный оператор
        //Присваивание = (условие) ? присваиваем значение : Иначе другое значение
        System.out.println(" ");
        System.out.println("\nЗадание 1 с тернарным оператором:");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        printArray(array);

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println(" ");
        System.out.println("\nЗадание 2 :");
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
        }
        printArray(arr1);

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println(" ");
        System.out.println("\nЗадание 3 :");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        printArray(arr);

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        // цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println(" ");
        System.out.println("\nЗадание 4 :");

        int[][] doubleArray = new int[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i][i] = 1;
            doubleArray[i][doubleArray.length - 1 - i] = 1;
        }
        printArray(doubleArray);

        //5. * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println(" ");
        System.out.println("\nЗадание 5 :");
        int[] minAndMax = {49, 98, 13, 50, 12, 21, 48, 5};
        int min = minAndMax[0], max = minAndMax[0];

        printArray(minAndMax);
        for (int i = 1; i < minAndMax.length; i++) {
            System.out.print(String.format("min = %d, max = %d, arr[%d] = %d", min, max, i, minAndMax[i]));
            System.out.println();
            if (min > minAndMax[i]) {
                min = minAndMax[i];
            }
            if (max < minAndMax[i]) {
                max = minAndMax[i];
            }
        }
        System.out.println(String.format("Минимальное значение = %d, Максимальное значение = %d", min, max));
    }

    //1, 98, 13, 50, 12, 21, 48, 5

    // задание 6
    // Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и
    // правой части массива равны.
    static boolean amountIs(int[] checkBalance) {
        System.out.println("Задание 6: ");
        int leftAmount = 0, rightAmount = 0;
        for (int i = 0; i < checkBalance.length; i++) {
            leftAmount += checkBalance[i];
        }
        for (int i : checkBalance) {// цикл for each, альтернатива цикла выше
            if (leftAmount == rightAmount) {
                return true;
            }
            leftAmount = leftAmount - i;
            rightAmount = rightAmount + i;
        }
        return false;
    }

    // задание 7
    // Написать метод, которому на вход подается одномерный массив и
    // число n (может быть положительным, или отрицательным), при этом метод должен
    // сместить все элементы массива на n позиций. Для усложнения задачи нельзя
    // пользоваться вспомогательными массивами.
    public static void moving(int[] arr, int n) {
        int temp;
        int len = arr.length - 1;
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                temp = arr[0];
                arr[len] = temp;
            }
        } else {
            for (int i = 0; i < n; i++) {
                temp = arr[len];
                arr[0] = temp;
            }
        }
    }


    // метод для перебора массива
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%3d ", arr[i]));
        }
        System.out.println();
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%d ", arr[i][j]));
            }
        }
        System.out.println();
    }


}


