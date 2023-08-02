package ss15_exception.baitap;

public class TriangleValidator {
    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }

        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            throw new IllegalTriangleException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh thứ ba.");
        }
    }

    public static void main(String[] args) {
        try {
            int side1 = 5;
            int side2 = -3;
            int side3 = 4;

            checkTriangle(side1, side2, side3);
            System.out.println("Các cạnh đại diện cho một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}