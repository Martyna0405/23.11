public class Person {
    Person person = new Person("Jan","Testowy", 16);
    Person secondperson = new Person("Kazimierz","Przykładowy", 20);

    Address address = new Address("Warszawa","Świateczna");

    Student student = new Student("Michał", "Kowalki", 30, 1)
    Student secondStudent= new Student(person);

         System.out.println(person.getIn);
         System.out.println(secondStudent.getIndexNumber());

         System.out.println(person.getAddress().getCity());
         System.out.println(person.getAddress().getStreet());

         person.setAddress(address);
         System.out.println(person.getName());
         person.setName("Artur");
         System.out.println(person.getName());

         System.out.println(person.getSurname());
         person.setSurname("Przykład");
         System.out.println(person.getSurname());

         System.out.println(person.getAge());
}
 }

class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;

        if (this.age < 18) {
            System.out.println("Nie można zmienić nazwiska");

        } else {
            this.surname = surname;
        }
    }
}
