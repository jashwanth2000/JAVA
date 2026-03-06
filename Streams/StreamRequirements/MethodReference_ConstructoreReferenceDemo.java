package Java_Collections.Streams.StreamRequirements;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//uses method without invoking and in place of lamba expression


public class MethodReference_ConstructoreReferenceDemo {
public static void main(String[] args) {
    List<String> students= Arrays.asList("Jash","suhas","Gopi");
students.forEach((x)->System.out.println(x));
//or by using method reference
students.forEach(System.out::println);

//ConstructorReference
List<String> name= Arrays.asList("A","B","F");
List<MobilePhone> mobilephone= name.stream().map(x-> new MobilePhone(x)).collect(Collectors.toList());
//or by using constructor reference
List<MobilePhone> mobilephone1= name.stream().map(MobilePhone::new).collect(Collectors.toList());

}
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
