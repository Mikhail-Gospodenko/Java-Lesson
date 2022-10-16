package homework1;

import java.sql.SQLOutput;

public class array {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("\nЗадание 1 :");
        int[] array = {0, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[i] + 1;
            } else {
                array[i] = array[i] - 1;
            }
            System.out.print(array[i] + " ");
        }


        System.out.println(" ");
        System.out.println("\nЗадание 2 :");

        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println(" ");
        System.out.println("\nЗадание 3 :");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i2 = 0; i2 < arr.length; i2++) {
            if (arr[i2] < 6) {
                arr[i2] = arr[i2] * 2;
            }
            System.out.print(arr[i2] + " ");
        }

        System.out.println(" ");
        System.out.println("\nЗадание 4 :");

        int[][] doubleArray = new int[3][3];
        int v = 1;
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = v;
                System.out.print(doubleArray[i][j] + " ");
            }
        }

        System.out.println(" ");
        System.out.println("\nЗадание 5 :");
        int[] minAndMax = {1, 98, 13};
        for (int i = 0; i < minAndMax.length; i++) {
            if (minAndMax[i] < minAndMax[0]) {
                System.out.println("Наименьшее число :" + minAndMax[i]);
                break;
            } else if (minAndMax[i] < minAndMax[1]) {
                System.out.println("Наименьшее число :" + minAndMax[i]);
                break;
            } else if (minAndMax[i] < minAndMax[2]) {
                System.out.println("Наименьшее число :" + minAndMax[i]);
                break;
            }
        }
        for (int i = 0; i < minAndMax.length; i++) {
            for (int j = minAndMax.length - 1; j >= 0; j--) {
                if (minAndMax[i] > minAndMax[0]) {
                    System.out.println("Максимальное число :" + minAndMax[i]);
                    break;
                } else if (minAndMax[i] > minAndMax[1]) {
                    System.out.println("Максимальное число :" + minAndMax[i]);
                    break;
                } else if (minAndMax[i] > minAndMax[2]) {
                    System.out.println("Максимальное число :" + minAndMax[i]);
                    break;
                }
            }
        }
    }
}


