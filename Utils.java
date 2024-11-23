package org.example;
import java.util.Scanner;
public class Utils {
    static int input(String message, int number) {

            Scanner input = new Scanner(System.in);
            System.out.print(message);
            return input.nextInt();
        }
    }
