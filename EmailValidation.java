package java_basics;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailValidation {
	
	
 public static boolean isValidEmail(String email) {
	 String regex = "^(.+)@(.+)$";
     Pattern pattern = Pattern.compile(regex);
     Matcher matcher = pattern.matcher(email);
     return matcher.matches();

		       
     }

 public static void main(String[] args) {
      List<String> emails = new ArrayList<String>();
		 
	 emails.add("vishnu@email.com");
     emails.add("vishnu09@mail.com");
		
     emails.add("vishnu..sankar@email.com"); //format:<name or numbers or both followed by @ and respective email source
     emails.add("vishnu@.email.com");

	 for (String value : emails) {
		  System.out.println("The email address " + value + " is " + (isValidEmail(value) ? "valid." : "invalid."));
	}
		       
	 System.out.println("Enter an email address to check");
	Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
     System.out.println("The email address " + input + " is " + (isValidEmail(input) ? "valid." : "invalid."));
		       
		   }
		   
}
