package ss2_mang_va_vong_lap.baitap;

import java.util.Scanner;

public class bai1 {
        public static void main(String[] args){
            System.out.println("Hình chữ nhật");
            int chieuDai = 5;
            int chieuRong = 3;

            for (int i = 0; i < chieuRong; i++) {
                for (int j = 0; j < chieuDai; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("Hình tam giác vuông dưới góc trái");
            int height = 5;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Hình tam giác vuông trên góc trái");
            int height2 = 5;
            for (int i = 0; i < height2; i++) {
                for (int j = height2; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Hình tam giác cân");
            int size = 5;
            for (int i = 1; i <= size; i++) {
                for (int j = size - i; j > 0; j--) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}



