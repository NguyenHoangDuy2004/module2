package ss14_thuat_toan_xap_sep.baitap;
import java.util.Arrays;

public class SapXepChen {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            displayArray(arr);
        }
    }

    public static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Mảng ban đầu:");
        displayArray(array);

        System.out.println("\nCác bước sắp xếp chèn:");
        insertionSort(array);
    }
}
