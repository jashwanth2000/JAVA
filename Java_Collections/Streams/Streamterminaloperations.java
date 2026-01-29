package Java_Collections.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streamterminaloperations {


public static void main(String[] args) {
    List<String> names= Arrays.asList("Jash","Bob","Alice","charlie","aa");
    names.stream().filter((x)->x.length()>3).forEach(x->System.out.println(x));
  //or 
    System.out.println(names.stream().filter(x->x.length()>3).collect(Collectors.toList()));

List<Integer> numbers=Arrays.asList(5,2,9,1,6);
List<Integer> ex2 =numbers.stream().map(x->x*x).sorted().collect(Collectors.toList());
System.out.println(ex2);
}
    
}
