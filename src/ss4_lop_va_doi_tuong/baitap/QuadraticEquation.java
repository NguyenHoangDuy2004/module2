package ss4_lop_va_doi_tuong.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a ;
    private double b ;
    private double c ;

    public QuadraticEquation(double a ,double b , double c){

    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a , b , c);
        double discriminant = equation.getDiscriminant();

        if(discriminant >= 0 ){
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a );
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a );
            if(discriminant == 0 ){
                System.out.println("Nghiệm kép: " + root1);
            }else {
                System.out.println("Nghiệm thứ nhất: " + root1);
                System.out.println("Nghiệm thứ hai: " + root2);
            }
        }else {
            System.out.println("Phương trình không có nghiệm. ");
        }
    }
}
