package Java_Collections.ListFramework.ArrayList;

import java.util.*;

public class ArrayListDemo {

public static void main(String[] args) {
    
List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1, "Wednesday");

        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array); // fixed size of arraylist, doesnt wont be able to add or remove but can be replaced
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);

      List<Integer> list3= List.of(1,2,3); //completly unmodifiable;

      List<Integer> list5=new ArrayList<>();
      list5.addAll(list3);

      list5.remove(2);//Index
      list5.remove(Integer.valueOf(1));//object
      list.contains(Integer.valueOf(1));
      System.out.println(list.size());

      //list to array
     Integer[] arr= list.toArray(new Integer[0]);
    list.sort(null);
    Collections.sort(list2);
    list.sort(null);
    ArrayList<Integer> arr1=new ArrayList<>();
    arr1.add(4);
    arr1.set(0,5);
    list2.sort(null);
    System.out.println(arr1);

}

    


}
