package javaSessions;

public class LoopsAssignments {

	public static void main(String[] args) {
/*
 * 1. WAP to print following output:
I am Batman

I am Batman

I am Batman

I am Batman

I am Batman
 */
		for(int i=1;i<9;i++)
		{
		System.out.println("I am Batman");
		System.out.println();

	}
	/*
	 * 
2. WAP to print following output:
I am Batman 1

I am Batman 2

I am Batman 3

I am Batman 4

I am Batman 5

I am Batman 6

I am Batman 7

I am Batman 8

I am Batman 9	
	 */
		for(int i=1;i<9;i++)
		{
		System.out.println("I am Batman"+ i);
		System.out.println();

	}
		
		/*3. WAP to print 10 to 1 using for, while and do-while loop
		
4. Write a program in Java to print "Hello World" ten times using while loop and do-while loop

5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered*/
		
		int j=10;
		
		while(j>=1)
		{
			System.out.println(j);
			j--;
		}
		
		//4. Write a program in Java to print "Hello World" ten times using while loop and do-while loop
		
int k=10;
		
		while(k>=1)
		{
			System.out.println("Hello World");
			k--;
		}
		
		
		//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int l = 1;
		while(l<20)
		{
			System.out.println(l);
			if(l%7==0)
			{
				break;
			}
			
			l++;
		}
		


}
}
