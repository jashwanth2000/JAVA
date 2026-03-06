package Java_Collections.ListFramework.LinkedList;
import java.util.*;

//Stored in nodes
public class LinkedListDemo {

public static void main(String[] args) {
      LinkedList<Integer> linkedList=new LinkedList<>();
    linkedList.add(5);

    linkedList.get(2);
    linkedList.addFirst(3);
    linkedList.addLast(5);
    linkedList.remove(7 );
    linkedList.removeIf(x->x%2==0);
    linkedList.removeAll(linkedList);
    
    LinkedList<Integer> l1=new LinkedList<>();
    l1.removeAll(linkedList);


}
  
}
