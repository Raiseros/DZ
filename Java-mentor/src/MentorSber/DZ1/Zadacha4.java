package MentorSber.DZ1;

//Задача 4
//Ввести с клавиатуры дату в формате дд.мм.гггг, вычислить следующую дату и вывести на экран в том же формате
//(Не использовать DateTime API)



import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Zadacha4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате дд.мм.гггг: \n");
        String date = sc.nextLine();
        String[] splitted = date.split("\\.");
        int leapYear = parseInt(splitted[2]) % 4;
        int year = parseInt(splitted[2]);
        int days = parseInt(splitted[0]);
        int months = parseInt(splitted[1]);



        if(days == 31){
            if(months == 12){
                months = 1;
                days = 1;
                year += 1;
            } else{
                months += 1;
                days = 1;
            }

        } else if(days == 30){
            if(months == 4 || months == 6 || months == 9 || months == 11){
                months += 1;
                days = 1;
            }

        } else if(days == 29){
            if(months == 2 && leapYear == 0){
                months += 1;
                days = 1;
            } else {
                days += 1;
            }

        } else if(days == 28 && leapYear > 0 && months == 2){
            months += 1;
            days = 1;
            } else{
            days += 1;
        }

        System.out.printf("%02d", days) ;
        System.out.print(".") ;
        System.out.printf("%02d", months) ;
        System.out.print("." + year) ;

    }
}
