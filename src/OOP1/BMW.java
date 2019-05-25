package OOP1;

public class BMW extends Car {
	
	//polymorphism
	
	@Override
	public void start()
	{
		System.out.println("BMW start");
	}

	public void threadSafety()
	{
		System.out.println("BMW threadSafety");
	}
}
