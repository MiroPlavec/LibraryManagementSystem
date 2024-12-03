package layers;

import helpers.Helper;
import usermanagement.Customer;

import java.util.List;

public class SignUpWindow {

    public void collectUserInformation(List<Customer> customers){
        System.out.println(" ".repeat(20) + "Sign Up");
        System.out.println("Please enter information about you to complete registration.");
        System.out.println("Option marked with * are required.");
        System.out.println("_ ".repeat(50));

        String firstName = getUserInfo("*First name: ");

        String lastName = getUserInfo("*Last name: ");

        String email = checkEmail(customers);

        String password = "";
        while(password.isEmpty()){
            password = checkPassword();
        }

        System.out.print("Gender: ");
        String gender = Helper.scanner.nextLine();
        System.out.print("phoneNumber: ");
        String phoneNumber = Helper.scanner.nextLine();
        System.out.print("Address: ");
        String address = Helper.scanner.nextLine();

        System.out.println("Please confirm your registration with 'yes', any other option will result in cancellation of your registration.");
        String input = Helper.scanner.nextLine();
        if(input.equals("yes")) {
            Customer customer = new Customer(firstName, lastName, email, password, gender, phoneNumber, address);
            customers.add(customer);
        }
    }

    private String getUserInfo(String text){
        String input = "";
        while (input.isBlank()) {
            System.out.print(text);
            input = Helper.scanner.nextLine();
        }
        return input;
    }


    // check if email is valid and also if email is not already used by another user
    private String checkEmail(List<Customer> customers){
        String input = "";
        while (input.isBlank() || !input.contains("@")){
            System.out.print("*Email:");
            input = Helper.scanner.nextLine();
            for(Customer customer : customers){
                if(customer.getEmail().equals(input)){
                    System.out.println("Email is already used by another customer. Please enter different email address.");
                    input = "";
                    break;
                }
            }
        }
        return input;
    }

    private String checkPassword(){
        String password = "";
        while (password.isBlank()) {
            System.out.print("*Password: ");
            password = Helper.scanner.nextLine();
        }

        System.out.print("*Confirm password: ");
        String confirmPassword = Helper.scanner.nextLine();

        if(!password.equals(confirmPassword)) return "";

        return password;
    }

}
