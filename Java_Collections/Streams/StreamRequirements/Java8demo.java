package Java_Collections.Streams.StreamRequirements;

public class Java8demo {

public static void main(String[] args) {
    
MathOperation add =(a,b) -> a+b; //Using interface reference to use lamba expression
MathOperation sub=(a,b)->a-b;

}

}

@FunctionalInterface
interface MathOperation{
 int operator(int a,int b);


}
