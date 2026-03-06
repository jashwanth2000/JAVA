package Java_Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//MAP is parent class
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"jash");
         map.put(31,"Neha");
          map.put(22,"Shubham");

          map.get(3);

          map.containsKey(31);
          map.containsValue("jash");

          //Iterating over the keys
          Set<Integer> keys =map.keySet();
          for(int i: keys){
           //System.out.println(map.get(i)); 
           System.out.println(i+" "+map.get(i));
          }

          Set<Map.Entry<Integer,String>> entries = map.entrySet();
          for(Map.Entry<Integer,String> entry : entries){
          //  System.out.println(entry.getKey() +" "+entry.getValue());
          }

          map.remove(31);
          map.remove(31, "suhas");
          map.containsKey(21);


          HashMap<String,Integer> list1= new HashMap<>();


          //            time Complexity
//  put, get,remove,contains key best o(1) worst o(logn)
//  contains value best o(n) worst o(n)
//  size best and worst o(1)
    }

}
