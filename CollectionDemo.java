import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class CollectionDemo {

    static void checkAge(int age) throws InvalidAgeException {

        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else {
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("===== ArrayList =====");

        for(String lang : languages) {
            System.out.println(lang);
        }

        // HashSet
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("\n===== HashSet =====");
        System.out.println(numbers);

        // HashMap
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Aman");

        System.out.println("\n===== HashMap =====");

        for(Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Try Catch
        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch(ArithmeticException e) {

            System.out.println("\nCannot Divide By Zero");
        }

        // Custom Exception
        try {

            checkAge(15);

        } catch(InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
    }
}