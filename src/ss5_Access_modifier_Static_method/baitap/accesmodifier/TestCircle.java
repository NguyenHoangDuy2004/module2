package ss5_Access_modifier_Static_method.baitap.accesmodifier;

import ss5_Access_modifier_Static_method.baitap.accesmodifier.Circle;

public class TestCircle {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
