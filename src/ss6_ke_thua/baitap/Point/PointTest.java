package ss6_ke_thua.baitap.Point;

import ss6_ke_thua.baitap.Point.Point2D;
import ss6_ke_thua.baitap.Point.Point3D;

public class PointTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f,3.0f);
        System.out.println(point2D.getXY());

        Point3D point3D = new Point3D(1.0f,2.0f,3.0f);
        System.out.println(point3D);
    }
}
