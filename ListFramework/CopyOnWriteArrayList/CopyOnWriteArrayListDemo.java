package Java_Collections.ListFramework.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

       list.add(3);
       list.add(54);
       
       //creates a copy of the list when ever we are trying to modify
       // after completion of read operation the reference address will be changed 
       //and pointed to the new modified list.


    }
}
