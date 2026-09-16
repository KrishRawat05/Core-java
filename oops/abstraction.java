public class abstraction {
    public static void main(String[] args){
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
    
}
 abstract class Car{
    void start(){
        System.out.println("car started");
    }
     abstract void accelerate();
     abstract void brake();


}

class FuelCar extends Car{
 @Override 
void accelerate(){
 System.out.println("accerlate fuelcar");
}
@Override 
void brake(){
System.out.println("stop fuelcar");
}

}

class ElectricCar extends Car{
  @Override 
    void accelerate(){
System.out.println("accerlate electriccar");
}
  @Override 
void brake(){
    System.out.println("brake electriclcar");
}


}