package Java_Collections.ComparableDemo;

public class Student implements Comparable<Student>  {

String name;
Integer marks;

public String getName() {
    return name;
}
public Student(String name, int id) {
    this.name = name;
    this.marks=id;
}
public int getmarks() {
    return marks;
}

@Override
public int compareTo(Student o) {
    // TODO Auto-generated method stub
    return Integer.compare( o.getmarks(), this.marks);
   // return o.getmarks() -this.marks; --> this is also correct
    
}
@Override
public String toString() {
    return "Student [name=" + name + ", marks=" + marks + "]";
}



}
