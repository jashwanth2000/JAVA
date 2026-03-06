package Java_Collections.Streams.StreamStarts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Terminal_operations {
public static void main(String[] args) {
    
List<Integer> list= Arrays.asList(1,2,3,4,5,6,8,9);

//1) collect
list.stream().skip(1).collect(Collectors.toList());
//(or)

list.stream().skip(1).toList();

//2)forEach
list.stream().forEach(x->System.out.println(x));

//3)reduce or accumulator: Combines element to produce single result
list.stream().reduce((x,y)->x+y);
System.out.println(list.stream().reduce((x,y)->x+y));//-- gives optional and optional means it has value or doesnt have to get you have to use .get method


//4) count

//5) anyMatch, allMatch,nonMatch--> returns boolean//shortcircuit operation- process untill it encounters a false statement, or finds any thing and breaks.
list.stream().anyMatch(x->x%2==0);
list.stream().allMatch(x->x%2==0);
list.stream().noneMatch(x->x%2==0);

//6) findFist, findAny//short circuit operation
list.stream().findFirst();
list.stream().findAny();

//eg
//1) squaring and sorting
list.stream().map(x->x*x).sorted().toList();
//2) find sum
System.out.println(list.stream().reduce((x,y)->x+y));
//3) Counting occurences of character
String sentence="Hello World";
char[] arr= sentence.toCharArray();
//char array cant to converted to stream so use .chars method on string itself
sentence.chars().filter(x->x=='l').count();
System.out.println(sentence.chars().filter(x->x=='l').count());


list.stream().filter(x->{
    System.out.println(x);
   return  x==x;
}).toList();

//stateful & stateless operation
//stateful- doesnt remember previous operation
//stateless



}
}
