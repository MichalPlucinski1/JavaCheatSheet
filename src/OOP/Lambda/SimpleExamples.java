package OOP.Lambda;

import java.util.ArrayList;
import java.util.List;

public class SimpleExamples {
    interface StringFunction {
        String run(String str);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );


        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        String prefix = "nato";
        list.forEach((var s) ->{
            char first = s.charAt(0);
            System.out.println(prefix + " " + s + " means " + first);
        });

        int result = calculator((a,b) -> a + b, 5, 2); // first argument is a lambda. it guesses T as int, becouse of return
    }

    public static <T> T calculator(Operation <T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("result of operation: " + result);
        return result;
    }
}
