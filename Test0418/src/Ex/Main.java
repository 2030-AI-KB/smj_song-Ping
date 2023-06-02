package Ex;

abstract class Vehicle{
	   String name;
	   abstract public String getName(String val);
	   public String getName() {
	      return "Vehicle name: " + name;
	   }
	}
	class Car extends Vehicle{
	   private String name;

		public Car(String val) {
	      name = super.name = val;
	   }
	   public String getName(String val) {
	      return "Car name : " + val;
	   }
	   public String getName(byte[] val) {
	      return "Car name : " + val;
	   }
	}
	public class Main {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Vehicle obj = new Car("Spark");
	   }

	}