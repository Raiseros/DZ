package MentorSber.DZ1;
import java.util.Scanner;

//Задача 1
//Ввести с клавиатуры целое число заменить числом, получающимся при записи его цифр в обратном порядке
// и вывести результат на экран


public class Zadacha1 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String num1 = a.nextLine();
        StringBuffer strBuffer = new StringBuffer(num1);
        strBuffer.reverse();
        System.out.println(strBuffer);

    }
}
