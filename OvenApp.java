/******************
* Author: Micah L
*
* Midterm1: Oven
*******************/

public class OvenApp{
   public static void main(String[] args){
      Oven myOven = new Oven();
      
      System.out.printf("myOven: %s%n", myOven.toString());
      
      System.out.println("Trying to make oven bake");
      myOven.bake();
      
      System.out.println("Trying to set oven to -320 F");
      myOven.setTemperature(-320);
      
      System.out.printf("myOven: %s%n", myOven.toString());
      
      System.out.println("Setting the temperature to 350 and turning the oven on");
      myOven.setTemperature(350);
      myOven.bake();
      
      System.out.printf("myOven: %s%n", myOven.toString());
      
      System.out.println("Time to turn off the oven");
      myOven.off();
      
      System.out.printf("myOven: %s%n", myOven.toString());
       
   }
}