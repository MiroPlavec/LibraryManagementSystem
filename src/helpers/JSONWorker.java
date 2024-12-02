package helpers;

import usermanagement.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JSONWorker {

    private static final Path basePath = Paths.get(System.getProperty("user.dir"));


    //TODO
    // Implement reading user info from json file
    public List<User> readUsersFromJSON(){
        Path jsonPath = basePath.resolve("resource").resolve("users.json");
        checkIfFileExists(jsonPath.toString());

        return null;
    }



    //TODO
    // Write documentation comment
    /**
     * Check if FILE exists and if not, creates a new FILE.
     * @param path
     * @return boolean
     */
    private boolean checkIfFileExists(String path){
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
                return false;
            }
        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }

        return true;
    }
}
