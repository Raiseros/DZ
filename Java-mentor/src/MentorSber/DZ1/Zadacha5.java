package MentorSber.DZ1;

//Задача 5
//К введенному числу (от 0 до 1000) приписать слово "рублей" в правильном падеже и вывести на экран

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if ( num == 1){
            System.out.println( num + " рубль");
        }
        if(num > 1 && num < 5 ){
            System.out.println( num + " рубля");
        }
        if(num == 0 || num > 4 && num <= 1000 ){
            System.out.println( num + " рублей");
        }

    }
}
