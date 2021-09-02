public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = new Student("Adam", "Mickiewicz");
        Student student3 = new Student("Juliusz", "Słowacki");
        Student student4 = new Student("Adam", "Nowak", 25, "a.nowak@gmail.com", 123456);
        Student student5 = new Student("Szczepan", "Terlecki", 26, "sz.terlecki@gmail.com", 567456);
        student5.display();
        displayAll(student3);
    }

    private static void displayAll(Student student) {
        System.out.println("Imię i nazwisko: " + student.name + " " + student.surname);
        System.out.println("Wiek: " + student.age + "\nemail:  " + student.email + "\nIndeks " + student.indexNumber);
    }
}
