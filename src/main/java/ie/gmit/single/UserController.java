//Evan Garvey
//SoftwareEng with Test
//Design Principals lab
//This Lab shows why this class is violating the SRP and how to fix that. It separates out each responsibility into its own class.
package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserController {


    private userPersistenceService persistenceService = new userPersistenceService();

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            ValidateUser myUser = new ValidateUser();

            boolean checkedUser = myUser.checkUser(user);

            if(!checkedUser) {
                return "ERROR";
            }

            persistenceService.saveUser(user);

            return "SUCCESS";
        }



 }

