package OOP;

public class A implements Inter{

    private int x;

    protected int y;

    public boolean negative;

    public A(int x, int y, boolean negative) {
        this.x = x;
        this.y = y;
        this.negative = negative;
    }

    public A(int x, int y) {
        this(x, y, false);
    }

    public A() {
        this(0,0,false);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", y=" + y +
                ", negative=" + negative +
                '}';
    }

    @Override
    public boolean write() {
        System.out.println("pretending to write cords to file");
        return false;
    }

    @Override
    public boolean read() {
        System.out.println("pretending to read cords from file");
        return false;
    }
}
