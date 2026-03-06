package Java_Collections.Map.HashMap;

import java.util.LinkedHashMap;


//least recently used will come at the top and will be removed, recently used(put or get) will be send to the bottom
public class LRUcache<K,V> extends LinkedHashMap<K,V> {
int capacity;

    LRUcache(int capacity){
        super(3, 0.7f, true);
        this.capacity= capacity;

    }

    public static void main(String[] args) {
        LRUcache<String, Integer> studentmap = new LRUcache(3);
        studentmap.put("jash", 70);
        studentmap.put("suhas", 90);
        studentmap.put("gopi", 80);
        System.out.println(studentmap);
        studentmap.get("gopi");
        studentmap.put("nandu", 100);
        System.out.println(studentmap);












        
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        // TODO Auto-generated method stub
        if(size()>capacity){
            return true;
        }else{
            return false;
        }
    }
}
