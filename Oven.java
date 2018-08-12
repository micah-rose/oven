/******************
* Author: Micah L
*
* Midterm1: Oven
*******************/

public class Oven{

   // fields
   private boolean on;
   private int temperature;

   // constant
   public static final int MIN_BAKE = 170;
   
   // methods
   public void setTemperature (int temperature){
      
     if (temperature >=0){
        this.temperature = temperature;
     }
   }
   
   public void bake(){
   
     if (temperature >= MIN_BAKE){
         System.out.println("Baking at" + temperature + "F");
         on = true;
     }

     else System.out.println("Baking requires at least 170 F");
        
   }
   
   public void off(){
     on = false;
     temperature = 0;
   }
   
   @Override
   public String toString(){
      String s = (on ? "on": "off") + "temperature =" + temperature;
      return s;
   }
}