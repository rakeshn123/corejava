package nhl1;
import java.util.function.Predicate;
public class UserValidation {

	

		
		    public static void main(String[] args) {
		        // Define the validation predicates
		        Predicate<String> isUsernameValid = username -> username.length() >= 5 && username.matches("[a-zA-Z0-9]+");
		        Predicate<String> isPasswordValid = password -> password.length() >= 8 && password.matches("[a-zA-Z0-9!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?]+");

		        // Sample input values
		        String username = "123";
		        String password = "123";

		        // Validate username and password using lambda expressions
		        boolean isUsernameValidResult = isUsernameValid.test(username);
		        boolean isPasswordValidResult = isPasswordValid.test(password);

		        // Display validation results
		        System.out.println("Username is valid: " + isUsernameValidResult);
		        System.out.println("Password is valid: " + isPasswordValidResult);
		    }
		

	}


