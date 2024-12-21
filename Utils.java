package org.example;
import java.util.Scanner;
public class Utils {
    static int input(String message, int number) {

            Scanner input = new Scanner(System.in);
            System.out.print(message);
            return input.nextInt();
        }



    

     Person firstPerson = new Person("Jan", "Testowy");
 Employee firstEmployee = new Employee(firstPerson, Departament.SALES);

  Person secondPerson = new Person("Kazimierz", "Nowak");
 Employee secondmployee = new Employee(secondPerson, Departament.ADMINISTRATION);

  Person thirdPerson = new Person("Maria", "Demo");
 Employee thirdEmployee = new Employee(thirdPerson, Departament.FINANCE);


    Company company = new Company("Super firma");
 List<Employees>employees = company.getEmployees();
  employees.add(firstEmployee);
 employees.add(secondEmployee);
 employees.add(thirdEmployee);
 
for (int i=0;i<employees.size();i++){
        System.out.println(employees.get(i).toString());
      }
return company;
 
    }
