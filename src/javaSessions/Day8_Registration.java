package javaSessions;

public class Day8_Registration {

	public static void main(String[] args) {
		Day8_Registration reg	= new Day8_Registration();
		reg.userRegistration("Google");
		reg.userRegistration("Facebook");
		reg.userRegistration("linkedin");
		

	}
	
	public void userRegistration(String AccountName)
	{
		Day8_LoginPage loginPage= new Day8_LoginPage();
		if(AccountName.equals("Google") || AccountName.equals("Facebook") || AccountName.equals("linkedin"))
		{
			loginPage.login(AccountName);
		}
		else{
			System.out.println("account not found");
		}
		
	}
	

}
