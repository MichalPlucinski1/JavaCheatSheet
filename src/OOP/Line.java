package OOP;

public class Line<T extends A> implements Inter {
    private T p1;
    private T p2;

    private int dim;


    public Line(T p1, T p2) {
        this.p1 = p1;
        this.p2 = p2;
    }



    @Override
    public String toString() {
        return "Line{" +
                "\np1=" + p1 +
                "\np2=" + p2 +
                '}';
    }

    @Override
    public boolean write() {
        if(p1.write() && p2.write()){
            return true;
        }
        return false;
    }

    @Override
    public boolean read() {
        if(p1.read() && p2.read()){
            return true;
        }
        return false;
    }
}
