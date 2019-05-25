package OOPs4;

public class Dog extends Animal {
	
	public  Dog(int i) {
		System.out.println("Dog Cons");
	}

	@Override
	
	void eat() {
		System.out.println("Dog eats");
		
	}
	public static void main(String[] args) {
			Dog d= new Dog(10);
			d.eat();
			d.fun();
		
	}

}
