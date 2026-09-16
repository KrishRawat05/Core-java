public class abstraction2 {
    public static void main(String[] args){
        Car car = new ElectricCar();
        
        car.start();
        car.accelerate();
        car.brake();
    }
}

interface Car{
    void start();
     void accelerate();
      void brake();
 
}
class FuelCar implements Car{
    
    @Override 
   public  void start(){
      System.out.println("start fuelcar");  
    }
 @Override 
 public void accelerate(){
 System.out.println("accerlate fuelcar");
}
@Override 
 public void brake(){
System.out.println("stop fuelcar");
}

}

class ElectricCar implements Car{
@Override 
   public void start(){
      System.out.println("accerlate electriccar");  
    }
  @Override 
   public void accelerate(){
System.out.println("accerlate electriccar");
}
  @Override 
 public void brake(){
    System.out.println("brake electriclcar");
}


}
