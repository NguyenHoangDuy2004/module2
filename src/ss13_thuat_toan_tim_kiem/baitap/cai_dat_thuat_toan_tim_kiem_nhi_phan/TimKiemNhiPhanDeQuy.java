package ss13_thuat_toan_tim_kiem.baitap.cai_dat_thuat_toan_tim_kiem_nhi_phan;
import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhanDeQuy {

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            } else {
                return binarySearch(array, middle + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int value = scanner.nextInt();

        Arrays.sort(array);

        int index = binarySearch(array, 0, n - 1, value);

        if (index != -1) {
            System.out.println("Value " + value + " found at index: " + index);
        } else {
            System.out.println("Value " + value + " not found in the array.");
        }

        scanner.close();
    }
}
