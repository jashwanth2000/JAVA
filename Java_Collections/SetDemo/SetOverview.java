package Java_Collections.SetDemo;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {


    public static void main(String[] args) {
        Set<Integer> set= new TreeSet();
    
    
    
    
    
    //for thread safety and sorted set
    //always use
    Set<Integer> set1= new ConcurrentSkipListSet<>();
    
    
    
    // unmodifiable but unlike map you can add more than 10 elements

        Set<Integer> integers = Set.of(1, 2, 3,4,5,6,7,8,9,54,4323,545,4545);
    
    
    
    
    }

}
