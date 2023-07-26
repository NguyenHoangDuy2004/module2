package ss7_attactclass_va_interface.baitap.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] =new Circle();
        shapes[1] =new Rectangle(2.0,5.0);
        shapes[2] =new Square(4.0);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println("Area of square: " + ((Square) shape).getArea());
                IColorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}