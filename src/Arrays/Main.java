package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//  ------  classic static table  ------ \\
        //static size
        //supports primitive types
        //doesn't support nulls for primitives, have default 0's for example


        int[] classicArr = {0, 2, 1};
        Integer[] arr = new Integer[3];
        arr[0] = 3; arr[1] = 2; arr[2] = 1;

        String[] array = new String[2];
        Arrays.sort(classicArr);
        System.out.println("printing classic array:");
        for(var e : classicArr) {
            System.out.println(e + " ");
        }

        //after sorting
        int position = Arrays.binarySearch(classicArr, 2); // does not guarantee first position
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
        //mutable
        //doesn't support primitives

        ArrayList<Integer> aL = new ArrayList<>(List.of(1, 2, 3, 4));
        //we can make Arraylist from array, need to make transition via List
        List<Integer> l = List.of(arr);   // immutable

        // or

        var originalList = Arrays.asList(arr); //but it still references arr and still is not resizable, but mutable

        ArrayList<Integer> nextList = new ArrayList<>(l);

        ArrayList<String> arrayList = new ArrayList<>(); //bez <> daje object, raw use
        arrayList.add("hakunamatata");
        arrayList.add("zupa");
        arrayList.add("drzewo");
        arrayList.add("Hakunamatata");
        arrayList.add(0, "yeah"); //or set, to change, not push
        //also has addAll
        arrayList.remove(0);
        // contains, contains all(list of elem {,,}), indexof, lastIndexOf
        arrayList.sort(Comparator.naturalOrder()); //or reverseOrder()
        System.out.println(arrayList);


        //2d
        ArrayList<ArrayList<String>> multiDList = new ArrayList<>();




        //making array from ArrayList
        ArrayList<String> stringList = new ArrayList<>(List.of("Jan", "Feb", "Mar", "complete"));
        String[] stringArray = stringList.toArray(new String[0]);






//  ------  List  ------ \\
        //is an interface!!
        //only to make arraylist


        List<Integer> list2 = List.of(arr);

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");



    }
}
