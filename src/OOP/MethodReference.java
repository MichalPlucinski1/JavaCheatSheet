package OOP;

import java.util.function.BinaryOperator;

public class MethodReference {


    public static void main(String[] args) {
        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 10.5, 25.3);
        calculator((a, b) -> a + b, 10, 25);
    }
    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("result of operation  " + result);
    }
}
