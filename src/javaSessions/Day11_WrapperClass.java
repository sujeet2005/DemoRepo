package javaSessions;

public class Day11_WrapperClass {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		String fare="1200";
				
		int fareVal=Day11_WrapperClass.getIntegerValue(fare);
		System.out.println(fare+20);
			
		/*String y="100A";
		int p=Integer.parseInt(y);//Normat format Exception for input String : "100A"
		System.out.println(p+20);*/
		
		//String to double
		String t="12.33";
	//	double d=Double.parseDouble(t);
	//	System.out.println(d+20);
		
		double d= Day11_WrapperClass.getDoubleValue(t);
		System.out.println(d+20);
		
		//String name= null;
		//Day11_WrapperClass.getDoubleValue(name);
		
		// Integer to String 
		int amount =1000;
		System.out.println(amount+200-20);
		String string=String.valueOf(amount);
		System.out.println(string+40);
		
		int p=9;
		int q=p/0;
		System.out.println(q);
		
	}
	/**
	 * This method is used to convert a string value into integer value
	 * @param value
	 * @return int
	 */
	
	
	

	public static int getIntegerValue(String value)
	{
		return Integer.parseInt(value);
	}
	
	public static double getDoubleValue(String value)
	{
		return Double.parseDouble(value);
	}
	
	public static String getStringValue(Integer value)
	{
		return String.valueOf(value);
	}
}
