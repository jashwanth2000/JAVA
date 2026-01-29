package Java_Collections.Map.ConcurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map= new ConcurrentHashMap<>();
        //java 7 --> segment based locking--> 16 segments--> smaller hashmaps
                    //each segment has its own lock and unlock
                    //only the segment which is being written or updated is locked
    
        //java 8 --> removed segmentation, because of waiting issues and scaling
                    //uses compare and swap approach--> no locking except resizing or collision on the bucket
                
            //compare and swap
            //thread A last saw--> x=45
            //Thread A work is to change 45 to 50
            //thread A checks whether x value is still 45 so that it can change to 50, in second time checking, if the value is changed the thread goes to steo1 and retry after some time again
    
    //Resizing will not simply double but happens incrementaly by adding one bucket at a time
    
    
    
    
    
    
    
                }
}
