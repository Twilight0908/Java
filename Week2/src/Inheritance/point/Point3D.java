package Inheritance.point;

public class Point3D extends Point2D {
    protected float z;

    public Point3D() {
        this.z = 0;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.x, super.y, this.z};
    }

    @Override
    public String toString() {
        return "(" + super.x + "," + super.y + "," + this.z + ")";
    }
}
