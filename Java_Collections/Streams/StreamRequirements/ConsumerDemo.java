package Java_Collections.Streams.StreamRequirements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//Consumer is an functional interface and accept is the method which takes somethign and doesnt return.
public class ConsumerDemo {


public static void main(String[] args) {
    Consumer<Integer> print=x->System.out.println(x);
        print.accept(3);
    
        List<Integer> l1= Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> printList= x->{
            for(int i:x){
                System.out.println(i);
            }
        } ;

        printList.accept(l1);









}


}
