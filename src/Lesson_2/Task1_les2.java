package Lesson_2;

import java.util.Scanner;

public class Task1_les2 {
    public static void main(String[] args) {
        //Написать программу, которая приветствует пользователя
        // в зависимости от его пола и возраста
        // (имя, пол и возраст задаются при старте программы)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name.");
        String name = scanner.nextLine();
        System.out.println("Enter your age.");
        int age = scanner.nextInt();
        System.out.println("Enter 1 if male, 2 if female.");
        int gender = scanner.nextInt();

        if(gender == 1 && age<=20){System.out.println("Salute "+ name);}
        else if(gender == 1 && age>20){System.out.println("Hello "+ name);}
        else if(gender == 2 && age<=20){System.out.println("Hi "+ name);}
        else if(gender == 2 && age>20){System.out.println("Privet "+ name);}
    }
}
