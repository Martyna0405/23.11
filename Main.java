package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
          program obliczający należny podatek dochodowy od osob fizycznych.
         program ma pobierać od użytkownika dochód i po obliczeniu wypiać podatek.
          reguły:
         do 85.528 podatek wynoi 18% podstawy minus 556,02 pln
          od 85.528 podatek wynoi 14.839,02 + 32% nadwyżki ponad 82.528,00
         Scanner input = new Scanner(System.in);
         System.out.print("Podaj dochód");
         double dochod = scanner.nextDouble();
         scanner.close();

         double podatek = 0;

         if (dochod <= 85_528) {
             podatek = (dochod * 0.28 - 556.02);

         } else {
             podatek = ((dochod - 85_528) * 0.32 + 141_839.02);

         }
         System.out.println("Podatek wynoi: " + podatek);


           Zadanie jedno z poprzednich dla przykladu//
         System.out.println("hello from main");
         int firstNumber = Utils.input("Podaj liczbę rat");
         int secondNumber = Utils.input("Podaj kwotę zakupu: ");
         int thirdNumber = Utils.input("Podaj kwotę zakupu: ");


         int maximumNumber;
         int minimumNumber;
         if (firstNumber > secondNumber && firstNumber > thirdNumber) {
             maximumNumber = firstNumber;
         } else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
             maximumNumber = secondNumber;
         } else {
             maximumNumber = thirdNumber;
         }

         if (firstNumber < secondNumber && firstNumber < thirdNumber) {
             minimumNumber = firstNumber;
         } else if (secondNumber < thirdNumber && secondNumber < firstNumber) {
             minimumNumber = secondNumber;
         } else {
             minimumNumber = thirdNumber;

         }






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

//@Override



 class Address{
     private String city;
System.out.println(address.setCity());
         address.setCity("Artur");
         System.out.println(address.setCity());

         System.out.println(address.getStreet());
         address.setStreet("Przykład");
         System.out.println(address.setStreet());

     Address address = new Address("Łódź","Kocielna");
     private String street;

         public Address(String city, String street){
             this.city=city;
             this.street=street;
         }

         public String getCity() {
             return city;
         }

         public String getStreet() {
             return street;
         }

         public void setCity(String city) {
             this.city = city;
         }

         public void setStreet(String street) {
             this.street = street;
         }
     }


class Student extends Person {
    private int indexNumber;

    public Student(String name, String surname, int age, int indexNumber) {
        super(name, surname, age);
        this.indexNumber=indexNumber;
    }







 
 Person firstPerson = new Person("Jan", "Testowy");
 Employee firstEmployee = new Employee(firstPerson, Departament.SALES);

  Person secondPerson = new Person("Kazimierz", "Nowak");
 Employee secondmployee = new Employee(secondPerson, Departament.ADMINISTRATION);

  Person thirdPerson = new Person("Maria", "Demo");
 Employee thirdEmployee = new Employee(thirdPerson, Departament.FINANCE);

 System.out.println(firstEmployee);
System.out.println(secondEmployee);
System.out.println(thirdEmployee);
 
}

