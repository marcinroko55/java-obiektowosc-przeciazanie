public class Student {
    String name;
    String surname;
    Integer age;
    String email = "";
    Integer indexNumber;

    public Student(String name, String surname, int age, String email, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.indexNumber = indexNumber;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    void display() {
        System.out.println("Imię i nazwisko: " + name + " " + surname);
    }
}
