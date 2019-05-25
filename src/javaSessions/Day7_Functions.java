package javaSessions;

import java.util.ArrayList;

public class Day7_Functions {

	public static void main(String[] args) {
		
		Day7_Functions day7_Functions= new Day7_Functions();
		day7_Functions.test();
		String name=day7_Functions.getTrainerName();
		System.out.println(name);
		int n1=day7_Functions.getTeamPlayers();
		System.out.println(n1);
		int sum1=day7_Functions.sum(11, 22);
		System.out.println(sum1);
		
		int sum2=day7_Functions.sum(20, 90);
		System.out.println(sum2);
		
		String cap1=day7_Functions.getCapitalCity("India");
		System.out.println(cap1);
		
		ArrayList<String> name1=day7_Functions.getStudentmarks("Java");
		System.out.println(name1);
		
		ArrayList<String> name2=day7_Functions.getStudentmarks("Python");
		System.out.println(name2);
		
		
		
	}
	//no input and no param
	
	public void test ()
	{
	System.out.println("test method");	
	}
	
	//no input and some return
	public String getTrainerName ()
	{
		String name= "Naveen";
	System.out.println("getTrainerName  method");	
	return name;
	
	}
	
	// 	no input and return output
	public  int  getTeamPlayers()
	{
		
		System.out.println("getTeamPlayers  method");	
		int playerCount=10;
		int extraPlayers =4;
		int totalPlayers= playerCount+extraPlayers;
		return totalPlayers;
	}
	
	//some input and some return
	
	public int sum(int x,int y)
	{
		System.out.println("sum method");
		int z=x+y;
		return z;
		
	}
	
	public String getCapitalCity(String CountryName)
	{
		
		System.out.println("Get City Name");
		
		if(CountryName.equals("India"))
		{
			return "new Delhi";
		}
		return "capital not found";
	}
	
	
	public ArrayList<String> getStudentmarks(String batchName)
	{
ArrayList<String> studentList= new ArrayList<String>();



if(batchName.equals("Java"))
{
	studentList.add("Babita");
	studentList.add("kashi");
	studentList.add("shivam");
}
else 
if(batchName.equals("Python"))
{
	studentList.add("Arun");
	studentList.add("Ben");
	studentList.add("Maha");
}
return studentList;
	}
	
	

}
