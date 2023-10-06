package IOSystem;

import java.util.Scanner;

public class Input {


    public static void main(String[] args) {
        //System.in  - a lot of code
        //System.console - easy, but doesn't work with idles
        //CLI args
        //Scanner - cooler

        String year = "";
        try {
            year = System.console().readLine("type year:"); //won't work, need to run from console
        }
        catch(NullPointerException e) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type current year:");
            try {
                year = scanner.nextLine();
            }
            catch(NumberFormatException ee){
                System.out.println("wrong number");
            }
        }

        try{
            int age = Integer.parseInt(year) - 2002;
            System.out.println("My age is " + age);

        }
        catch(NumberFormatException ee){
            System.out.println("wrong number");
        }

    }
}
