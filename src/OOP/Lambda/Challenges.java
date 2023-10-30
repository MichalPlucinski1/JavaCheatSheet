package OOP.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Challenges {
    public static void main(String[] args) {

        //challenge 1

        Consumer<String> printTheParts = (sentence) -> {
            List<String> parts = new ArrayList<>(List.of(sentence.split(" ")));
            parts.forEach(s-> System.out.println(s));
        /*

            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
         */
        };

        Consumer<String> printThePartsConcise = (sentence) -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printThePartsConcise.accept("let's split this up into an array");

        //challenge 2, 3, 4, 5
        Function<String, String> f = ((String source) -> {
            StringBuilder out = new StringBuilder();
            for(int i = 0; i < source.length(); i+=2){
                out.append(source.charAt(i));
            }

            return out.toString();
        });
        System.out.println(everySecondChar(f, "1234567890"));


        // challenge 6, 7
        Supplier<String> iLoveJava = () -> "I love Java";

        String supplierResult = iLoveJava.get();
        System.out.println(iLoveJava);



    }

    // for challenge 4
    public static String everySecondChar(Function<String, String> f, String source){
        return f.apply(source);
    }
}
