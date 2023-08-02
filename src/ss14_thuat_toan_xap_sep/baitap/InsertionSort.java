package ss14_thuat_toan_xap_sep.baitap;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Mảng ban đầu:");
        displayArray(array);

        insertionSort(array);

        System.out.println("\nMảng đã sắp xếp:");
        displayArray(array);
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
