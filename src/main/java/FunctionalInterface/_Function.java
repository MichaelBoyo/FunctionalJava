package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(1));
        int increment = incrementBy1Function.apply(1);
        int multiply = multiplyBy10Function.apply(increment);
        System.out.println(multiply);

        Function<Integer,Integer> addM = incrementBy1Function.andThen(multiplyBy10Function);
        System.out.println(addM.apply(4));

        //BiFunction takes 2 args returns 1 result
        System.out.println(incrementBy1AndMultiplyBi.apply(4,100));

    }
    static Function<Integer, Integer> incrementBy1Function = number -> number+1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static int increment(int number){
        return number+1;
    }
   static BiFunction<Integer,Integer,Integer> incrementBy1AndMultiplyBi =
            (numberToIncrement, numberToMu)
                    -> (numberToIncrement + 1) * numberToMu;
    static int incrementBy1AndMultiply(int number, int multiplyBy){
        return (number+1) * multiplyBy;
    }
}
