package javaSessions;

public class Day9_StaticandNonStatic {
	String name="wheels";
	static int wheels=4;

	public static void main(String[] args) {
		Day9_StaticandNonStatic obj= new Day9_StaticandNonStatic();
		
		Day9_StaticandNonStatic.getWheels();
		System.out.println(obj.wheels);
		
		obj.start();
		

	}
	
	public static void getWheels()
	{
		System.out.println("get wheels =4");
	}
	
	public  void start()
	{
		System.out.println("start method");
		stop();
	}
	
	public  void stop()
	{
		System.out.println("Stop method");	
	}

}
