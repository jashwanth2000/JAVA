package Java_Collections.Streams.StreamRequirements;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

//some function takes 2 inputs and perform same thing
//Bipredicate, biconsumer, bifunction, supplier  
//   test        accept       apply       get

public class Takestwoinput {

    

    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate= (x,y)->(x+y)%2==0;

        BiFunction<Integer,Integer,Integer> bifunction=(x,y)->x+y;
        //or
        BinaryOperator<Integer> b=(x,y)->x+y;
       int c= b.apply(4, 4);
        System.out.println(c);

       //instead of function you can use
        UnaryOperator<Integer> a=(x)->x*2;
    }
}
