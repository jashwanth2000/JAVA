package Java_Collections.Streams.StreamRequirements;

import java.util.function.Predicate;


//Predicate is an functional interface and test is the abstract method and is a boolean valued function
public class PredicateDemo {

    public static void main(String[] args) {
        
        Predicate<Integer> iseven= x-> x%2== 0;
    iseven.test(7);

    Predicate<String>  iswordstartingwitha = x->x.startsWith("a");
   boolean a= iswordstartingwitha.test("Jash");
    System.out.println(a);
}

}
