package org.example;
import java.util.Scanner;
public class Utils {
    static int input(String message, int number) {

            Scanner input = new Scanner(System.in);
            System.out.print(message);
            return input.nextInt();
        }

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
