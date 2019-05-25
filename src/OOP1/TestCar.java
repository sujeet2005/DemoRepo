package OOP1;

public class TestCar {

	public static void main(String[] args) {
		
		
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threadSafety();
		b.engine();
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//Type Casting
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		Vehicle v= new BMW();
		v.engine();
		//Downcasting
		
		BMW b1= (BMW) new Car();
		
		
		
		
		

	}

}
