package Lesson_2;

import java.awt.*;
import java.util.Scanner;

public class Task2_les2 {

    // Написать программу, в которой в консоль будет выводится
    // название месяца и сезон, к которму этот месяц относится
    // (написать с помощью if и с помощью switch)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month with a capital letter");
        String month = scanner.next();

        switch (month) {
            case "January":
            case "February":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such month.");
        }

        // Вариант2: не получилось
//        if (month=="December" || month == "February" || month == "January"){
//            System.out.println("Winter");
//        }
//        else if (month == "March" || month == "April" || month == "May"){
//            System.out.println("Spring");
//        }
//        else {System.out.println("No");}
    }
}







