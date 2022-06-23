package FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07012344565"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09076547544"));

        System.out.println(isPhoneNumberValidPre.test("07012344565"));
        System.out.println(isPhoneNumberValidPre.test("07065"));
        System.out.println(isPhoneNumberValidPre.test("09012344565"));

        System.out.println(
                "is phone num valid and contains 3 " +
                isPhoneNumberValidPre.and(containsNumber3).test("07012344565"));

        System.out.println(
                "is phone num valid and contains 3 " +
                        isPhoneNumberValidPre.or(containsNumber3).test("09012344565"));
        System.out.println(contains4AndAt.test("567", "@ghgk"));


    }
    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
    static Predicate<String> isPhoneNumberValidPre =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    static BiPredicate<String, String> contains4AndAt =
            (phoneNumber,email) -> phoneNumber.contains("4") & email.contains("@");
}
