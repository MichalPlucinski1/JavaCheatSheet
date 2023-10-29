package OOP.InnerClass;

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x + myInner.getZ());

        OuterClass.StaticInnerClass stInner = new OuterClass.StaticInnerClass(); // without instance of OuterClass
    }
}