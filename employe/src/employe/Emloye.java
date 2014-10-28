package employe;

public class Emloye {
	String firstName;
	String lastName;
	Integer ID;
	
	void printFullName(String f, String l){
		
		f = firstName;
		l = lastName;
		
		System.out.println(f +""+ l);
	}
	
}

