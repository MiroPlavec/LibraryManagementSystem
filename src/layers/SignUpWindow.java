package layers;

import helpers.Helper;

public class SignUpWindow {

    public void collectUserInformation(){
        System.out.println(" ".repeat(20) + "Sign Up");
        System.out.println("Please enter information about you to complete registration.");
        System.out.println("Option marked with * are required.");
        System.out.println("_ ".repeat(50));

        System.out.print("First name: ");
        Helper.scanner.nextLine();
        System.out.print("Last name: ");
        Helper.scanner.nextLine();
    }

}
