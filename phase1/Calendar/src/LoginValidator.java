package src;

import java.io.*;

public class LoginValidator {
    public User validate(String username, String password){
        username = username.toLowerCase();
        File userFile = new File("phase1/Calendar/Users/" + username + ".txt");
        boolean exists = userFile.exists();
        if (!exists) return null;
        User user = instantiateUser(userFile);
        if(user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    private User instantiateUser(File userFile) {
        User user = null;
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(userFile);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            user = (User) in.readObject();

            in.close();
            file.close();
        } catch (FileNotFoundException e){
            return null;
        } catch (IOException e){
            return null;
        } catch (ClassNotFoundException e){
            return null;
        }
        return user;
    }
}