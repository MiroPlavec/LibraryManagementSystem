package layers;

import helpers.Helper;
import usermanagement.Customer;

public class SignUpWindow {

    public Customer collectUserInformation(){
        System.out.println(" ".repeat(20) + "Sign Up");
        System.out.println("Please enter information about you to complete registration.");
        System.out.println("Option marked with * are required.");
        System.out.println("_ ".repeat(50));

        String firstName = getUserInfo("*First name: ");
        String lastName = getUserInfo("*Last name: ");
        String email = checkEmail();
        String password = checkPassword();

        System.out.print("Gender: ");
        String gender = Helper.scanner.nextLine();
        System.out.print("phoneNumber: ");
        String phoneNumber = Helper.scanner.nextLine();
        System.out.print("Address: ");
        String address = Helper.scanner.nextLine();

        System.out.print("Please confirm your registration with 'yes', any other option will result to cancel your registration.");
        String input = Helper.scanner.nextLine();
        if(input.equals("yes")) return new Customer(firstName, lastName, email, password, gender, phoneNumber, address);

        return null;
    }

    private String getUserInfo(String text){
        String input = "";
        while (input.isBlank()) {
            System.out.print(text);
            input = Helper.scanner.nextLine();
        }
        return input;
    }

    private String checkEmail(){
        String input = "";
        while (input.isBlank() || !input.contains("@")){
            System.out.print("*Email:");
            input = Helper.scanner.nextLine();
        }
        return input;
    }

    private String checkPassword(){
        String input = "";
        while (input.isBlank()) {
            System.out.print("*Password: ");
            input = Helper.scanner.nextLine();
        }
        return input;
    }

}
