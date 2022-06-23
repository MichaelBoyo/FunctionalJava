package optionals;

import java.util.Optional;

public class MAin {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("hello")
                .orElseThrow(()-> new IllegalArgumentException("exception"));

        System.out.println(value);
        try {
            Optional.ofNullable(null)
                    .ifPresentOrElse(email -> System.out.println("sending email to "+ email),
                            () -> {
                                throw new IllegalArgumentException("email is null");
                            });
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
