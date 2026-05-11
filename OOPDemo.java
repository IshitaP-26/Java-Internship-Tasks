class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    private int marks;

    Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Marks: " + marks);
    }
}

public class OOPDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 20, 85);

        s1.display();

        int[] numbers = {10, 20, 30, 40};

        System.out.println("\nArray Elements:");

        for(int num : numbers) {
            System.out.println(num);
        }
    }
}