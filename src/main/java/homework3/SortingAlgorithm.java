package homework3;

public class SortingAlgorithm {
    public static void main(String[] args) {
        // сортировка пузырьком
        int[] arr = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int sort;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    sort = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = sort;
                }
            }
        }
        // сортировка выбором
        int[] arr1 = {53, 42, 31, 23, 12};
        int min = 0;

        for (int i = 0; i < arr1.length; i++) {
            min = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[min]) {
                    min = j;
                }
            }
            int temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;
            System.out.println(arr1[i]);
        }
    }

}



