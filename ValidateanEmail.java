import java.util.regex.Pattern;
public class ValidateanEmail {

	public static void main(String[] args) {
		String email1= "adobe@gmail.com";
		String email2="adobeinfy.com";
		
		System.out.print("email1=" +validateemail(email1));
		System.out.print("email2=" +validateemail(email2));
	}
    public static String validateemail(String email) {
    	if(email==null||email.isEmpty()) {
    		return "Invalid";
    	}
    	
    	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";
    	Pattern pattern = Pattern.compile(emailRegex);
    	if (pattern.matcher(email).matches()) {
    		return "Valid";
    	}
    	else {
    		return "Invalid";
    		
    	}
    	
    }
}
