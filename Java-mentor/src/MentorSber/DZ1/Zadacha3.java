package MentorSber.DZ1;

//Задача 3
//Ввести с клавиатуры номер месяца (1,....12) и вывести на экран время года(зима,...осень). Использовать enum


import java.util.Scanner;

public class Zadacha3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int scanData = scanner.nextInt();
        Month.getMonthByNumber(scanData).getSeason();
    }
}
