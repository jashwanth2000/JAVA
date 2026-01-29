package Java_Collections.Comparator;
import java.util.*;

class main{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.sort(null);
        System.out.println(list);
        list.sort(new IntegerLengthComparator());
        list.sort((a,b)-> b-a); // --->by using lamba expression
        System.out.println(list);



       List<String> list1 = new ArrayList<>();
       list1.add("Z"); 
       list1.add("Jash");
        list1.add("ABC");
        list1.add("XYS");

        list1.sort(new StringLengthComparator());
        list1.sort((a,b)-> b.length()-a.length()); // --->by using lamba expression
         System.out.println(list1);
        list1.sort(null);
         System.out.println(list1);
      
        List<Student> students = new ArrayList<>();
        students.add(new Student("jash", 80));
        students.add(new Student("suhas", 67));
students.add(new Student("bob", 90));
students.add(new Student("jack", 90));
students.sort((o1,o2)-> o2.gpa-o1.gpa);
for(Student s:students){
    System.out.println(s.name+" " +s.gpa);
}
System.out.println("-------------------------------");
//using java 8 features
Comparator<Student> comparator = Comparator.comparing(Student::getGpa).thenComparing(Student::getName); //using java 8 features
students.sort(comparator);
for(Student s:students){
    System.out.println(s.name+" " +s.gpa);
}

    }
    
}

