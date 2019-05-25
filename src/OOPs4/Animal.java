package OOPs4;

public abstract class Animal {
	
	int legs;
	
	public Animal()
	{
		System.out.println("Animal class Const.");
	}
	
	public Animal(int a)
	{
		System.out.println("Animal class Const.");
	}
	abstract void eat();
	
	public void fun()
	{
		System.out.println("fun method");
	}
	
	//cannot create object of abstract class
	

	

}
