package OOP.Lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*

A lambda expression is a short block of code which takes in parameters and returns a value.
 Lambda expressions are similar to methods,
  but they do not need a name and they can be implemented right in the body of a method.

  java requiers types which support lambda to be functional interface /  SAM's, target for lambda

  SAM - simple abstract method.


parameter -> expression



(parameter1, parameter2) -> expression



(parameter1, parameter2) -> { code block }

lambdas can be stored via Consumer interface.
    Consumer<Integer> method = (n) -> { System.out.println(n); };



 */

public class Main {

    record Person (String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {



        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Main.Person("Linus", "Van Pelt"),
                new Main.Person("Peppermint", "Patty"),
                new Main.Person("Charlie", "Brown")));

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        //@FunctionalInterface
        interface EnhancedComparator<T> extends Comparator<T>{
            int secondLevel(T o1, T o2);
        }
        var comparatorMixed = new EnhancedComparator<Person>(){ // can make a lambda here, it's anonymous, 2 methods

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        /*   old
        people.sort(new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                return o1.lastName().compareTo(o2.lastName());
            }

        });

         */
        people.sort(comparatorMixed);
        System.out.println(people);

    }
}
