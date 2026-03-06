
package Java_Collections.ComparableDemo;
import java.util.*;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("jash", 323));
        list.add(new Student("suhas", 456));
        list.add(new Student("mummy", 778));

        list.sort(null); // see in this we dont have to pass anything because we have defined natural order of sorting in the class of student
        System.out.println(list);
    }
}
