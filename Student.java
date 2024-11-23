public class Student {
    class Student extends Person {
    private int indexNumber;

    public Student(String name, String surname, int age, int indexNumber) {
        super(name, surname, age);
        this.indexNumber=indexNumber;
    }
}
