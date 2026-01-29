package Java_Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {

    public static void main(String[] args) {
         Person p1= new Person("jash", 1);
    Person p2= new Person("jash", 2);
    Person p3= new Person("jash", 1);
        
// creating new object creates new memory which in turn is used to get hashcode, so p1 and p3 are diff

//we can make it to check that also overriding  equals ,hashCode  methods
//whenever you write custom classes make sure you write your own equals and hashcode method, otherwise you will make a mess


        HashMap<Person, String> map= new HashMap<>();
        map.put(p1,"engineer");
        map.put(p2,"manager" );
        map.put(p3,"director");
        System.out.println(map);
        
    }
   
}

class Person{

    private String name;
    private int id;
    
    

    public String getName() {
        return name;
    }



    public int getId() {
        return id;
    }



    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
       if(this == obj){
        return true;
       }
       if(obj==null){
        return false;
       }
       Person other = (Person) obj;
       return id == other.getId() && Objects.equals(name, other.getName()) ;
    }



    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(name, id);
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id:" + id + " "+ name;
    }

  



}
