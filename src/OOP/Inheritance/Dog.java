package OOP.Inheritance;

public class Dog extends Animal{

    public Dog(){
        super("Mutt", "Big", 50);
    }
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Dog";
    }
}
