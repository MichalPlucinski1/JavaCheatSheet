package ControlFlow;

public class Switch {


    public static void main(String[] args) {
        //classic

        int a = 2;
            //works with byte, short, int, char, String, enum and their main classess
        switch(a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3: case 4: case 5:
                System.out.println("3 or 4 or 5");
            default:
                System.out.println("different");
        }

        //modern java switch

        switch (a){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3, 4, 5 -> System.out.println("3, 4, 5");
            default -> System.out.println("different");
        }
    }

    public static String funWithReturn(String month){
        return switch (month){
            case "JANUARY", "Februaru", "March" ->  "1st";
            case "April" -> "2nd";
            default -> {
                yield month + " is bad"; //must be in a code block
            }
        };
    }
}
