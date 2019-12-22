package MentorSber.DZ1;


//Задача 2
//Ввести с клавиатуры время в формате чч:мм:сс, перевести в секунды и вывести результат на экран (не использовать DateTime API)


import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Zadacha2 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время в формате чч:мм:сс : \n");
        String time = sc.nextLine();

        String[] splitted = time.split(":");

        int seconds = (parseInt(splitted[0]) * 3600) + (parseInt(splitted[1]) * 60) + (parseInt(splitted[2]));

        System.out.println(seconds);

    }

}


