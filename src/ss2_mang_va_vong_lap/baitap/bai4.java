package ss2_mang_va_vong_lap.baitap;
import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Nhập phần tử cần xoá (X): ");
        int x = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            System.out.println("Vị trí của phần tử cần xoá (X): " + index);

            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            System.out.println("Mảng sau khi xoá: " + Arrays.toString(Arrays.copyOf(array, array.length - 1)));
        }
    }
}
