//6510405822 Sarawut Inpol
import interfaces.Validator;
import models.User;
import services.RegistrationService;
import validators.AgeValidator;
import validators.EmailValidator;
import validators.NameValidator;

import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String[] args) {
        User user = new User("Sarawut", "sarawut.inp@gmail.com", 20);
        RegistrationService service = new RegistrationService();
        List<Validator> validators = new ArrayList<>();
        validators.add(new NameValidator());
        validators.add(new EmailValidator());
        validators.add(new AgeValidator());
        boolean isSuccess = service.register(user, validators);
        if (isSuccess) {
            System.out.println("Register Successfully");
        } else {
            System.out.println("Something Went Wrong!");
        }

    }
}

//6510405822 Sarawut Inpol
