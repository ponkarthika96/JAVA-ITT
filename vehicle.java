import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class vehicle{
        void drive(){
                System.out.println("I am driving");
        }
}
class Car extends vehicle{
        void honk(){
                System.out.println("I am honking");
        }
    void park(){
        System.out.println("I am parking");
    }
}

public class Vehicle{

   public static void main(String args[]){

          Car c=new Car();
          c.drive();
          c.honk();
          c.park();


   }
}