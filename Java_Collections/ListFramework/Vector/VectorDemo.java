package Java_Collections.ListFramework.Vector;

import java.util.*;

public class VectorDemo {

public static void main(String[] args) {
    Vector<Integer> vector = new Vector(5,4 );
vector.capacity();

 LinkedList<Integer> linkedList=new LinkedList<>();
    linkedList.add(5);
    linkedList.add(6);
 Vector<Integer> vector1 = new Vector(linkedList);
Vector<Integer> vector2 = new Vector(Arrays.asList(2,3,4,5));

}
}
    
