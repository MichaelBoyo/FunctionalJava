package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;
import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+08574838385",
                LocalDate.of(2000,1,1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));
        // we can store customer in db

        // using combinator
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult()).apply(customer);

        System.out.println(result);
        if(result != SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
