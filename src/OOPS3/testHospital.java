package OOPS3;

public class testHospital {

	public static void main(String[] args) {
	
		
		FortisHospital fs= new FortisHospital();
		
		fs.cardioServices();
		fs.ambulanceServices();
		fs.phsioServices();
		
		fs.ENTServices();
		fs.oncologyServices();
		fs.dentalServices();
		
		fs.emergencyServices();
		fs.ENTServices();
		fs.radioLogyServices();
		
		fs.medicalInsurance();
		fs.studentInternship();
		
		USMedical us= new FortisHospital();
		us.ambulanceServices();
		us.cardioServices();
		us.phsioServices();
		
		UKMedical uk= new FortisHospital();
		uk.dentalServices();
		uk.oncologyServices();
		uk.outPatientServices();
		
		Indiamedical in= new FortisHospital();
		in.emergencyServices();
		in.ENTServices();
		in.radioLogyServices();
		
		fs.test();
		
		USMedical.display();
		
		

	}

}
