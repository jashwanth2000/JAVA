package Java_Collections.Streams.StreamStarts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//process collection of data in functional and declarative manner
//simplify data processing
//achiveing parallism


// How to use stream?
// Source, intermidiate operation & terminal operation
public class intermidiate_operation { 
public static void main(String[] args) {


   //1) Filter
    List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
  int a=(int) numbers.stream().filter(x->x%2==0).count();
System.out.println(a);

    //2) Map
    List<String> names=Arrays.asList("Jash","jash","suhas","gopi");
Stream<String> stringStream=names.stream().map(x->x.toUpperCase());
System.out.println("achsdvsdv");


  //  3)sorted
Stream<String> sortedst= names.stream().sorted();
Stream<String> sortedstreamusingcomparator= names.stream().sorted((x,y)->x.length()-y.length());

//4) Distinct
names.stream().filter(x->x.startsWith("a")).distinct().count();

//5)Limit and skip
Stream.iterate(1, x->x+1).skip(10).limit(100);
System.out.println(Stream.iterate(1, x->x+1).skip(10).limit(100).count()); 






}
}
