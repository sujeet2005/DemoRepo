package javaSessions;

public class Day10_Login {
	
	String username;
	String password;
	int otp;
	long phoneNo;
	String SocilaMediaID;
	
	public Day10_Login()
	{
		System.out.println("Please provide proper credentials");
	}
	public Day10_Login(String username, String password, int otp, long phoneNo, String socilaMediaID) {
		super();
		this.username = username;
		this.password = password;
		this.otp = otp;
		this.phoneNo = phoneNo;
		this.SocilaMediaID = socilaMediaID;
	}
	
	
	public Day10_Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	public Day10_Login(int otp) {
		super();
		this.otp = otp;
	}
	
	
	public Day10_Login(long phoneNo, String socilaMediaID) {
		super();
		this.phoneNo = phoneNo;
		this.SocilaMediaID = socilaMediaID;
	}
	
	
	public static void main(String[] args) {
		
		Day10_Login obj1= new Day10_Login();
		System.out.println(obj1.otp);
		Day10_Login obj2= new Day10_Login(12345);
		System.out.println(obj2.otp);
		System.out.println(obj1.otp);
		obj1=obj2;
		System.out.println(obj1.otp);
		obj2=null;
		System.out.println(obj2.otp);
		
	}
	
	
	
	
	

}
