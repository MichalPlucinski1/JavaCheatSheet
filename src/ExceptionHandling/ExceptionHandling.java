package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        //https://programming.guide/java/list-of-java-exceptions.html

        String year = "";
        try {
            year = System.console().readLine("type name:"); //won't work, need to run from console
        }
        catch(NullPointerException e){
            Scanner scanner = new Scanner(System.in);

            year = scanner.nextLine();
        }
    }
}
