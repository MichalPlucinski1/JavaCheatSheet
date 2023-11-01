package OOP;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;


class PlainOld{
    private static int last_id = 1;
    private int id;

    public PlainOld(){
        id = PlainOld.last_id++;
        System.out.println("Creating a Plain Object " + id);
    }
}

public class MethodReference {


    public static void main(String[] args) {
        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 10.5, 25.3);
        Supplier<PlainOld> reference1 = ()-> new PlainOld();
        Supplier<PlainOld> reference2 = PlainOld::new;
    }
    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("result of operation  " + result);
    }
}
