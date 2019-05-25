package OOPS3;

public interface USMedical {

	int min_fee=100;
	
	public  void cardioServices();
	
	public void ambulanceServices();
	
	public void phsioServices();
	
	default void test()
	{
		System.out.println("test method");
	}
	
	static void display()
	{
		System.out.println("display method");
	}
	
}
