package ss1_instruction_to_java.baitap;

import javax.swing.*;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền usd");
        usd = sc.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("giá trị tiền việt là " + quyDoi);
    }
}
