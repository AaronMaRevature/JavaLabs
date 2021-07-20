
public class July20Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Lab: Inheritance
		ActionFigure ironMan = new ActionFigure();
		ironMan.setName("Tony Stark");
		System.out.println(ironMan.getName());
		
		
		// Lab 2: 
	    FlyingVehicle fv = new FlyingVehicle();
	    fv.setName("A New Flying Vehicle");

	    System.out.println(fv.getName());

	    Airplane boeing = new Airplane();
	    boeing.move(15);
		
		// Lab 3:
	    Person adam = new Developer();
	    
	    adam.setName("Adam");
	    System.out.println(adam.getName());
	    
	    
	    // Lab: Interfaces
	    Swimmer beluga;
        beluga = new Whale();
		beluga.swim();
		beluga.dive();
		
		System.out.println("There are "+Swimmer.NUMBER_OF_FEET_IN_A_LEAGUE+" in a league.");
		
		int feetTraveled = 80_000;
		System.out.println("So if the whales went "+feetTraveled+" feet, they "
				+ "would have gone "+ Swimmer.convertFromFeetToLeagues(feetTraveled)+" leagues.");
	}
	    


}

class Whale extends Mammal implements Swimmer{
	@Override
	public void swim() {
	    System.out.println("Swim swim swim");
	}
}
interface Swimmer {
	int NUMBER_OF_FEET_IN_A_LEAGUE = 18_228;
	
	void swim();
	default void dive() {
		System.out.println("Diving");
	}
	
	static int convertFromFeetToLeagues(int feet) {
		return feet/NUMBER_OF_FEET_IN_A_LEAGUE; 
	}
}
class Mammal{

}

class Developer extends Person {

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name; 
    }
}

abstract class Person{

    protected String name;

    public abstract String getName();

    public abstract void setName(String name);
}




class Airplane extends FlyingVehicle{
    private short wheels;
    private short propellers;

    //getters and setters
    public short getWheels(){ return this.wheels; }
    public void setWheels(short wheels){ this.wheels = wheels; }

    public short propellors() { return this.propellers; }
    public void setPropellers(short propellers) {this.propellers = propellers; }

    public void turn(){
        System.out.println("Turning...");
    }
}


class Engine {

    public void on() {
        System.out.println("Turning engine on");
    }

    public void off(){
        System.out.println("Turning engine off");
    }
}


class FlyingVehicle extends Vehicle{
    private short wings;
    private Engine engine;

     //getters and setters
     public short getWings(){ return this.wings; }
     public void setWings(short wings){ this.wings = wings; }

     public Engine getEngine() { return this.engine; }
     public void setEngine(Engine engine) {this.engine = engine; }

     public void fly(){
    System.out.println("FlyingVehicle is flying…");
     }

     public void refuel(){
    System.out.println("FlyingVehicle is refueling");
  }

     public void liftOff(){
    System.out.println("FlyingVehicle is lifting off...");
     }

     public void land(){
    System.out.println("FlyingVehicle is landing...");
     }
}



class Vehicle {
    private String name;
    private long serialNumber;

    //getters and setters
    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public long getSerialNumber() { return this.serialNumber; }
    public void setSerialNumber(long serialNumber) {this.serialNumber = serialNumber; }

    public void move(){
      System.out.println("Vehicle is moving…");
 }

    public void move(int spaces){
   System.out.println("Vehicle moved " + spaces + " spaces");
    }
}











class Doll{
    
	protected String name;
    
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name; 
	}
}









class ActionFigure extends Doll {

}






