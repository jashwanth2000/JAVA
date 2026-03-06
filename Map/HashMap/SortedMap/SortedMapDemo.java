package Java_Collections.Map.HashMap.SortedMap;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// treemap implements navigablemap, navigablemap extends sortedmap extends map 
//not thread safe
public class SortedMapDemo {
public static void main(String[] args) {
    SortedMap<String, Integer> sortedMap= new TreeMap<String,Integer>((a,b)->a.length()-b.length()) ;
    sortedMap.put("j", 1);
    sortedMap.put("suhas", 2);
    sortedMap.put("go", 3);
    sortedMap.put("nan", 5);
    sortedMap.put("janu", 7);

    System.out.println(sortedMap);
    
    System.out.println(sortedMap.firstKey());
    
    System.out.println(sortedMap.headMap("nan"));
    System.out.println(sortedMap.tailMap("nan"));
    System.out.println(sortedMap.lastKey());

////////////////////////////////////////////////////////
/// Navigable map

NavigableMap<String,Integer> map= new TreeMap<String,Integer>() ;
TreeMap<String,Integer> map2= new TreeMap<>();




}
}
