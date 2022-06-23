package Streams;


import imperative.Main;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static Streams._Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("John", MALE),
                new Person("Bob", MALE),
                new Person("MAria", FEMALE),
                new Person("Alice", FEMALE),
                new Person("Aisha", FEMALE)
        );

        people.stream()
                .map(person -> person.name)
                .collect((Collectors.toSet())).
                forEach(System.out::println);
        boolean b = people.stream().allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(b);
        b = people.stream().anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(b);
        b = people.stream().noneMatch(person -> MALE.equals(person.gender));
        System.out.println(b);

    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
