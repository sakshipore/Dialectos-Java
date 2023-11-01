
import java.util.HashMap;

public class Authentication {
    public boolean authenticateUser(String email,String password){
        HashMap<String, String> users = new HashMap<String, String>();
        users.put("aakash@gmail.com","Aakash213");
        users.put("pranavmasekar@gmail.com","Pranav456");
        users.put("kavishree@google.com","Kavishree84");
        users.put("harsh@gmail.com","Harsh111");

        if(users.containsKey(email)){
            if(users.get(email).equals(password)){
                System.out.println("User authenticated");
                return true;
            }
            else{
                System.out.println("Incorrect password");
                return false;
            }
        }
        else{
            System.out.println("User not found");
            users.put(email,password);
            System.out.println("User created!!!");
            return true;
        }
    }
}
