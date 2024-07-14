//6510405822 Sarawut Inpol

package validators;
import interfaces.Validator;
import models.User;



public class AgeValidator implements Validator {
    @Override
    public void validate(User user) {
        if (user.getAge() < 20) {
            throw new IllegalArgumentException("Age should be more than 20 years");
        }
    }
}
//6510405822 Sarawut Inpol
