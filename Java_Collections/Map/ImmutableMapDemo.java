package Java_Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("jash", 1);
        map.put("suhas", 2);
       Map<String, Integer> map2= Collections.unmodifiableMap(map); //returns unmodifiable map;
       //if tried to modify map2 exception is thrown
       
       //introduced in java 9 and only 10 pairs will come
       Map<Integer,String> map3= Map.of(1,"s",2,"i");
    
      //for this method any number of entries can be added
       Map<Integer, String>map4= Map.ofEntries(Map.entry(1, "jash"),Map.entry(2,"suhas"));
    map4.put(6, "sdfvdf");//cant add
    }
}
