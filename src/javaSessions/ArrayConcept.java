package javaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=70;
		i[1]=30;
		i[2]=60;
		i[3]=10;
		
		int l=i.length;
		System.out.println(l);
		for(int j=0;j<=l-1;j++)
		{
			System.out.println(i[j]);
		}
		
		// double array
		
		double d[]= new double[3];
		// char array
		char c[]= new char[3];
		
		//String array
		String s[] = new String[3];
		s[0]= "python";
		s[1]= "java";
		s[2]= ".net";
		System.out.println(s[0]+s[1]);
		for(int counter=0;counter<s.length;counter++)
		{
			System.out.println(s[counter]);
			if(s[counter].equals("java"))
			{
				System.out.println("i love" +s[counter]);
			}
				
		}
		//Object array
		Object emp[]= new Object[4];
		emp[0]= "sachin";
		emp[1]= 30;
		emp[2]= 'm';
		emp[3]= true;


	}

}
