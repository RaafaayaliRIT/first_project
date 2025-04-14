
import java.util.*;
public class Car {
     private int id;
     private String name;
     private LinkedList<Integer> listOfOwners; 

     public Car(int id, String name){
          this.id = id;
          this.name = name;
          this.listOfOwners = new LinkedList<>();
     }

     public int getId(){return this.id;}
     public String getName(){return this.name;}
     public int getNumberOfOwners(){return this.listOfOwners.size();}


     
}
