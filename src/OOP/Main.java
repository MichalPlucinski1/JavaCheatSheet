package OOP;

public class Main {
    public static void main(String[] args) {


        A a1 = new A();
        A a2 = new A(4,4);

        System.out.println(a1);

        B b1 = new B();
        B b2 = new B(3,3,6);

        System.out.println(b1);

        Line l1 = new Line(a1, a2);

        System.out.println(l1);

        Line l2 = new Line(b1, b2);

        System.out.println(l2);

        l1.write();
        l2.write();



    }
}
