package FinalSession;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer,  String> upperCaseName = (name, age) -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        String nn = upperCaseName.apply("mike", 23);
        System.out.println(nn);
    }
}
