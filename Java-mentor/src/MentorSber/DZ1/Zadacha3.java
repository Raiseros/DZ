package MentorSber.DZ1;

//Задача 3
//Ввести с клавиатуры номер месяца (1,....12) и вывести на экран время года(зима,...осень). Использовать enum


import java.util.Scanner;

public class Zadacha3 {

    enum Months {January, February, March, April, May, June, July, August, September, October, November, December}
    enum Season {WINTER, SPRING, SUMMER, AUTUMN}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int scanData = scanner.nextInt();
        int x = 0;
        for(Months m : Months.values()) {
            x++;
            if (x == scanData) {
                System.out.println("SUCCESS");
                System.out.println(m.name());
                if (scanData <= 2 || scanData == 12) {
                    System.out.println(Season.WINTER);
                } else if (scanData <= 5 && scanData > 2) {
                    System.out.println(Season.SPRING);
                } else if (scanData <= 8 && scanData > 5) {
                    System.out.println(Season.SUMMER);
                } else if (scanData <= 11 && scanData > 8) {
                    System.out.println(Season.AUTUMN);
                }
            }
        }

    }
}
