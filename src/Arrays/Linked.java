package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {

  //  LinkedList<String> placesToVisit2 = new LinkedList<>();
  public static void main(String[] args) {

      LinkedList<String> items = new LinkedList<>();

      items.add("Sydney");
      items.add(0, "Canberra");
      items.addFirst("Warsaw");
      items.addLast("Wroclaw");

      System.out.println("19 items adding cities:" + items + "\n");

      items.offer("Cisna");
      items.offerFirst("Milowka");
      items.offerLast("Jordanow");
      items.add("toRemove");

      System.out.println("26 items offering things:" + items + "\n");


      items.push("push");
      System.out.println("30 before removing: \n" + items + "\n\n");

      ArrayList<Object> removed = new ArrayList<>();

      String s1 = items.remove(4);
      boolean s2 = items.remove("toRemove");
      String s3 = items.removeFirst();
      removed.add(s1);
      removed.add(s2);
      removed.add(s3);

      System.out.println("41 after removing: \n" + items);
      System.out.println("removed: " + removed.toString() + "\n \n");


      items.add("Poznan");
      items.add("Tarnowo");

      removed.add(items.poll()); // removes first
      removed.add(items.pop()); // removes first



      //items.remove()
      System.out.println("54 after poll and pop, \"Poznan\" and \"Tarnowo\" added at beginning: \n" + items);
      System.out.println("item get(2)" + items.get(2));
      System.out.println("removed: " + removed.toString() + "\n \n");


      System.out.println("full list now:");
      System.out.println(items.toString());
      //queue retrieval method
      System.out.println("Element from element() = " + items.element()); // exception if empty
      //stack retrieval methods
      System.out.println("Element from peek() = " + items.peek()); // null if empty
      System.out.println("Element from peekFirst() = " + items.peekFirst());
      System.out.println("Element from peekLast() = " + items.peekLast());



      System.out.println("\n \n using classic for \n 70 Great trip \n");
      System.out.println("trip starts from " + items.getFirst());
      for (int i = 1; i < items.size(); i++){
          System.out.println("-->From: " + items.get(i-1) + " to " + items.get(i));
      }
      System.out.println("trips end at " + items.getLast() + "\n \n");



      System.out.println(" 79 second trip, using iterator \n");
      ListIterator<String> iterator = items.listIterator(1);
      String previousTown = items.getFirst();
      while(iterator.hasNext()){
          var town = iterator.next();
          System.out.println("--> from: " + previousTown + " to " + town);
      }

      System.out.println("\n");


      testIterator(items);
  }
    private static void testIterator(LinkedList<String> list){
        System.out.println("--- test iterator ---");
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        if(iterator.next().equals("OL")){
//            iterator.remove();
//            iterator.add("Lake");
//        }

//        iterator  only forwards and supports only remove

//        listIterator forword and backword, remove, add and set

        System.out.println(list);
  }






}
