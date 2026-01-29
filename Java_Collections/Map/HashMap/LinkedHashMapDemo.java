package Java_Collections.Map.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

////Order is maintained in this and for LRU(Least recently used) cache also it is used.
/// latest used will come at the bottom and least used will come at the top, so that it will be easy to remove.
// not thread safe
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map= new LinkedHashMap<>(11,0.9f,false);
        map.put("Apple", 10);
        map.put("grapes",99);
        map.put("orange", 23);

        for(Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        HashMap<String,Integer> map1= new HashMap<>();
        LinkedHashMap<String,Integer> map12= new LinkedHashMap<>(map1);
    
        map1.getOrDefault(12, 9);
        map1.putIfAbsent("Shubham", 91);
        
    }
}
