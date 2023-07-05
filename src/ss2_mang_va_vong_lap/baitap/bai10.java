package ss2_mang_va_vong_lap.baitap;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Nhập các phần tử của ma trận ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tổng các số trên đường chéo chính là: " + sum);
    }
}
