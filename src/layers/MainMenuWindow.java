package layers;

import helpers.Helper;

public class MainMenuWindow {


    public void startApp(){
        System.out.println("Choose option: \n1.) Log In \n2.) Sign up");

        String input = Helper.scanner.nextLine();
        Helper.clearConsole();
        System.out.println(input);
    }

}
