package Java_Collections.Streams.StreamStarts;

import java.util.List;
import java.util.stream.Stream;
import java.util.*;
public class ParallelStream  {
    public static void main(String[] args) {
        
        
       try{ Thread.sleep(10000);
       }catch (Exception e){

       }

        //List<Integer> list= Stream.iterate(1, x->x+1).limit(200000).toList();

  long startime=System.currentTimeMillis();
//List<Long>factlist=list.parallelStream().map(x->ParallelStream.factorial(x)).toList();

long endtime=System.currentTimeMillis();

//System.out.println(endtime-startime); 
    


// List<Integer> list1=Arrays.asList(1,2,3,4,5);
// int sum=0;
// list1.stream().map(x->{
//     sum=sum+x;
//     return sum;
// }).toList();














}


    public static Long factorial(int seed){
        Long result=1l;
        for(int i=1;i<=seed;i++){
            result=result*i;
        } 
        return result;
    }







}
