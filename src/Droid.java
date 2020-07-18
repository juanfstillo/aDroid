public class Droid{
 String name;
 int batteryLevel;

public Droid(String droidName){
name = droidName;
batteryLevel = 100;

}
public String toString(){
  return "Hello, I 'm the robot " + name;

}

public void performTask(String task){
  System.out.println("Codey is performing: "+ task);
  batteryLevel -=10;

}

public void energyReport(){
  System.out.print(batteryLevel);
}

public  void energyTransfer(){
  if(batteryLevel<=100){
    batteryLevel = 100;

  }
}

public static void main(String[] args){
  Droid Codey = new Droid("Codey");
    Codey.performTask("dancing");
    Codey.energyReport();
    Codey.energyTransfer();
    Codey.energyReport();



    // Droid Transformer = new Droid ("Transformer");
    // Transformer.energyReport();

  }
 }
