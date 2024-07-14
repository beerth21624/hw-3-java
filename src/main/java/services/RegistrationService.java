//6510405822 Sarawut Inpol

package services;

import interfaces.Validator;
import models.User;

import java.util.List;

public class RegistrationService {
    public boolean register(User user, List<Validator> validators) {
        boolean isSuccess = true;
        try {
            for (Validator validator : validators) {
                validator.validate(user);
            }
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }
}
//6510405822 Sarawut Inpol

