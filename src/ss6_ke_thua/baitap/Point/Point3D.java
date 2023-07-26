package ss6_ke_thua.baitap.Point;

public class Point3D extends Point2D {
    private float z ;

    public Point3D( float x , float y , float z){
        super(x, y);
        this.z = z ;
    }

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xy = getXY();
        return new float[]{xy[0], xy[1], z};
    }


}
