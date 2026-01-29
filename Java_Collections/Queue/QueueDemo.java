package Java_Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
//FIFO principle---first in first out
public class QueueDemo {


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1); //adding is called as enqueue
        list.addLast(2);
        list.addLast(3);

        list.removeFirst(); //removing is called as dequeue
        list.removeFirst();


        list.getFirst();//peek operation.
    
  //  Queue<Integer> queue= new Queue<>();
    //queue is an interface so you cant call constructor
Queue<Integer> list1= new LinkedList<>();
list1.add(1);
list1.add(4);
list1.add(6);

System.out.println(list1);
list1.remove();
System.out.println(list1);


  Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove(1)); // throws exception if empty
        System.out.println(queue1.poll());

//        System.out.println(queue1.element());  // throws exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 =  new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1)); // true
        System.out.println(queue2.offer(2)); // true

//         System.out.println(queue2.add(3)); // throws exception
        System.out.println(queue2.offer(3)); // false
    
    }
}
