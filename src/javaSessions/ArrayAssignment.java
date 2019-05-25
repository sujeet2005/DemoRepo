package javaSessions;

public class ArrayAssignment {

	public static void main(String[] args) {
		/*
		 * Question 1: Write a program to print the following pattern using for loop:

00 01 02 03 04 05 06 07 08 09 
10 11 12 13 14 15 16 17 18 19 
20 21 22 23 24 25 26 27 28 29 
30 31 32 33 34 35 36 37 38 39 
		 */
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=9;j++)
			{
			System.out.print(i+""+j+"\t");
			System.out.print(" ");
				
			}
			System.out.println();
		
		}
		
		
		/*
		 * Question 2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console

		 */
		
		
		String[] arr={"name","age", "team name", "DOB","gender","Strike Rate"};
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Object[] players={"Amit","Rajesh","Dinesh"};
		
	
		
		

	
	}
}
