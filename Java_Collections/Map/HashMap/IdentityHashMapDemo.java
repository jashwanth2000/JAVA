package Java_Collections.Map.HashMap;

import java.util.*;

public class IdentityHashMapDemo {
//In identityhashmap it doesnt care of whether the class has its own hashing or not it will use object hashing meaning memory address will be hashed and checked, thats it , if memory address hashing also comes equal
//which will never and points to same index, then == is used to check the memory address and then record will added or modified (IdentityHashCode and ==)


//String class has its own hash method if a class doesnt have hash method then memory address is used to create hashing and index is found

    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        String key3="jash";
        String key4="jash";
        Map<String, Integer> map= new HashMap<>();
        map.put(key1,  1);
        map.put(key2, 2);


//Since String class has its own hash method hashing will not happen because of memory address rather based on the actual values which is being
//passed, in this case "key"
//after hashing index will be found and stored
//
//when trying to make reference key2 hashing will happen on key value and equals method is used on key text and will be replaced


//In identityhashmap it doesnt care of whether the class has its own hashing or not it will use object hashing meaning memory address will be hashed and checked, thats it , if memory address hashing also comes equal
//which will never and points to same index, then == is used to check the memory address and then record will added or modified (IdentityHashCode and ==)












    //     System.out.println(key1==key2);
    //    System.out.println(key3==key4);
    //    System.out.println(key3==key1);
    //    System.out.println(key1);
    //    System.out.println(key2);
    //    System.out.println(key3);
    //    System.out.println(key4);
    }
}
