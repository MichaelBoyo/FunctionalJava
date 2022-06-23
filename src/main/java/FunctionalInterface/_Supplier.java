package FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrlSup.get());
        System.out.println(getDBConnectionUrl());
    }
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5433/users";
    }
    static Supplier<List<String>> getDBConnectionUrlSup =
            () -> List.of("jdbc://localhost:5433/users",
                    "jdbc://localhost:5433/users");

}
