
import java.util.Scanner;
public class emailvalidation {

	public static void main(String[] args) {
        
        
       
        
        String[] emails = {"john.doe@example.com", "keane.doesy@example.com", "alice.smith@example.com", "bob.johnson@example.com"};

        // create a scanner to read user input
        Scanner er = new Scanner(System.in);

        // ask the user for an email ID to search for
        System.out.print("Enter an email ID to search for: ");
        String search_email = er.nextLine();

        // loop through each email ID in the array
        for (String email : emails) {
            // if the search email ID is found in the current email ID
            if (search_email.equals(email)) {
                // print a message indicating that the email ID was found
                System.out.println("Email ID found: " + email);
                return;
            }
        }

        // if the email ID was not found, print a message indicating that
        System.out.println("Email ID not found.");
    }
}



