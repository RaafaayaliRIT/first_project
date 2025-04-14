import java.util.Random;

public class HelloWorld {


     private String name;
     private int age;

     public HelloWorld(String input){
          this.name = input;
          this.age = generateAge();
     }

     private int generateAge(){
          Random RNG = new Random();
          int age = RNG.nextInt(0,11);
          return age;

     }

     public String getName(){return this.name;}
     public int getAge(){return this.age;}
     


     
     public static void main(String[] args) {
          System.err.println("hello word");

          // HelloWorld world = new HelloWorld("Raafay");
          // System.out.println(world.getAge());
          // System.out.println(world.getAge());


          Car minivan = new Car(27, "minivan");

          System.out.println(minivan.getId());
          System.out.println(minivan.getName());
          System.out.println(minivan.getNumberOfOwners());
     }
}
