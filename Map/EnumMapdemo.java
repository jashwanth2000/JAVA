package Java_Collections.Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;



public class EnumMapdemo {
    // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // ordinal/index is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT

        public static void main(String[] args) {
        
        Map<Day,String> map=new EnumMap<>(Day.class);
            map.put(Day.SUNDAY,   "gym");
            map.put(Day.MONDAY, "School");
            System.out.println(Day.FRIDAY.ordinal());
                //in this map hashing is not done since enum values is stored based on index
            System.out.println(map);
    
        }   


    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY,SUNDAY
    }
}
