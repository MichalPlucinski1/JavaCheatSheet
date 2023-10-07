package OOP;

public class B extends A{
    private int z;

    public B(int x, int y, int z, boolean negative) {
        super(x, y, negative);
        this.z = z;
    }

    public B(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public B() {
        super();
        z = 0;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean write() {
        System.out.println("Better way to write, thou still now working");
        return false;
    }

    @Override
    public String toString() {
        return "B{" + getX()+
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                ", negative=" + negative +
                "} ";
    }
}
