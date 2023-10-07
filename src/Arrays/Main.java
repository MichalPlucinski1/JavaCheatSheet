package Arrays;

import OOP.Inter;

import javax.swing.text.html.ObjectView;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

public class Main {
//helpers
    int[] tab = new int[1];
    //List<Integer> list = new List<Integer>()    not working
    public static void main(String[] args) {


//  ------  classic static table  ------ \\
//static size
        int[] classicArr = {0, 2, 1};

        String[] array = new String[2];
        Arrays.sort(classicArr);
        System.out.println("printing classic array:");
        for(var e : classicArr) {
            System.out.println(e + " ");
        }
        System.out.println(Arrays.toString(classicArr));

        Object objectVariable = classicArr;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }
        // if(Arrays.equal(a1, a2){}
        String[] secondArray = Arrays.copyOf(array, array.length); //and can be bigger

        String[] splitStrings = "Hello World again".split(" ");


        int[][] array2D = {
                {1,2},
                {3,4},
                {5,4,3,1,2}
        };
        int[][] array2Dv2 = new int[3][]; // array of 3 null elements










//  ------  ArrayList  ------ \\
        ArrayList<Integer> aL = new ArrayList<>(List.of(1, 2, 3, 4));
        //ArrayList<String> nextList = new ArrayList<>(list);

        ArrayList<String> arrayList = new ArrayList<>(); //bez <> daje object
        arrayList.add("hakunamatata");
        arrayList.add("zupa");
        arrayList.add("drzewo");
        arrayList.add("Hakunamatata");
        arrayList.add(0, "yeah"); //or set, to change, not push
        //also has addAll
        arrayList.remove(0);
        arrayList.sort(Comparator.naturalOrder()); //or reverseOrder()
        System.out.println(arrayList);

//  ------  List  ------ \\

        List<Integer> list2 = List.of(classicArr);

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");



    }
}
