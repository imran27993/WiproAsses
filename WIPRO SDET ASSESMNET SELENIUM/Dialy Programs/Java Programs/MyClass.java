import java.util.*;
public class MyClass {
public static void userLogin(String correctUsername,String correctPassword){
    Scanner sc =new Scanner(System.in);
    int attemptCount = 0;
    boolean loginSuccessful = false; 
     while (attemptCount < 3) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            // Check login credentials
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                loginSuccessful = true;
                break; // Exit the loop if login is successful
            } else {
                attemptCount++;
                System.out.println("Incorrect Username or Password. Attempts left: " + (3 - attemptCount));
            }
        }

        if (!loginSuccessful) {
            System.out.println("Account Locked. Please contact support.");
        }
}
public static void main(String[] args) {
		//Find the frequency of each character in the given string
	    final String correctUsername = "admin";
        final String correctPassword = "password123";
        userLogin(correctUsername,correctPassword);
	}
}
