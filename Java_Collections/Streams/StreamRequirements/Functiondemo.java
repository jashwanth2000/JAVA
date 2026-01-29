package Java_Collections.Streams.StreamRequirements;

import java.util.function.Function;

//it is a functional interface, and apply is the abstract method,
//  takes something and gives something
public class Functiondemo {


    public static void main(String[] args) {
        Function<Integer, Integer> doubleit = (x)->x*2 ;
                Function<Integer, Integer> tripleit = (x)->x*3 ;
                doubleit.apply(9);
               int a= doubleit.andThen(tripleit).apply(3);//here doubleit will happen then tripleit will happen

                 int b= doubleit.compose(tripleit).apply(3);//here tripleit will happen and then doubleit will happen
               System.out.println(a);
             Function<Integer, Integer> identity= Function.identity();
               Integer res2= identity.apply(3);
               System.out.println(res2);
 
    }
}
