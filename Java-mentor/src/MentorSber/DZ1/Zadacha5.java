package MentorSber.DZ1;

//Задача 5
//К введенному числу (от 0 до 1000) приписать слово "рублей" в правильном падеже и вывести на экран

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите число 0 до 1000 : ");
        String number = a.nextLine();
        char tempNumber;
        char tempNumberTwo = 0;

        if (number.length() == 2){
           tempNumber  = number.charAt(1);
           tempNumberTwo  = number.charAt(0);

        } else if (number.length() == 3){
            tempNumber = number.charAt(2);
            tempNumberTwo  = number.charAt(1);
        } else{
            tempNumber = number.charAt(0);
        }

        int deltaNumber =  tempNumber - '0';
        int deltaNumberTwo = tempNumberTwo - '0';


        if (deltaNumber == 1 && deltaNumberTwo != 1){
            System.out.println( number + " рубль");
        } else if(deltaNumber > 1 && deltaNumber < 5 && deltaNumberTwo != 1){
            System.out.println( number + " рубля");
        } else if(deltaNumber == 0 || deltaNumber > 4){
            System.out.println( number + " рублей");
        }

    }
}
