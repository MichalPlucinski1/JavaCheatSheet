package OOP.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    /*
        Category    Basic Method signature  purpose
        Consumer    void accept(T t)        execute code without returning data
        Function    R apply(T t)            return a result of an operation or function
        Predicate   boolean test(T t)       test if a condition is true or false
        Supplier    T get()                 return an instance of sth

     */

    public static void main(String[] args) {
        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659});

        //function
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double,Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);


        System.out.println("-------");

        coords.forEach(s -> processPoint(s[0], s[1], p1));

        //consumer

        System.out.println("-------");
        System.out.println("Customer");
        System.out.println("-------");
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s -> System.out.println(s));

        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach(s -> System.out.println(s));

        //predicate
        System.out.println("-------");
        System.out.println("Predicate");
        System.out.println("-------");
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        //function unary
        list.replaceAll(s->s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("-------");
        System.out.println("Functional");
        System.out.println("-------");
        list.forEach(s -> System.out.println(s));





    }


    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1, t2);
    }
}
