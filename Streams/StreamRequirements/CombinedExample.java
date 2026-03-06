package Java_Collections.Streams.StreamRequirements;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Consumer;



//predicate,    consumer,    function, supplier  
//   test        accept       apply       get



public class CombinedExample {
public static void main(String[] args) {
    Predicate<Integer> predicate=(x)->x%2==0;
    Function<Integer,Integer> function =(x)->x*x;
    Consumer<Integer> consumer = (x)->System.out.println(x);
    Supplier<Integer> supplier=()->100;


    if(predicate.test(supplier.get())==true){
    consumer.accept(function.apply(supplier.get()));
    }

    

}
    
}
