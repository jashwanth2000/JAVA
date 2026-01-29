package Java_Collections.Map.SortedMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedmapDemo {

    public static void main(String[] args) {
        
        //SortedMap<String,Integer> SortedMap= new SortedMap<String,Integer>() //1)Sorted map is an interface{
          //2)sorted map sorts based on keys on natural ordering
          //3) tree map is implementation class
          //4) sorts in assending order
          //5) Self balancing tree(red black tree)
            SortedMap<String,Integer> SortedMap= new TreeMap<>();
            SortedMap.put("Jash", 6);  //log(n)
            SortedMap.put("Suhas", 1);
            SortedMap.put("Mummy", 87);
            SortedMap.put("A", 87);
            SortedMap.put("Z", 87);
            System.out.println(SortedMap);
            SortedMap.firstKey();
            SortedMap.lastKey();

            SortedMap<Integer,String> SortedMap1= new TreeMap<>();
SortedMap1.put( 87,"jshdhbc");
            SortedMap1.put( 76,"jshdhbc");
            SortedMap1.put( 9,"jshdhbc");
     SortedMap1.headMap(98);
     SortedMap1.tailMap(89);
        }
    }

