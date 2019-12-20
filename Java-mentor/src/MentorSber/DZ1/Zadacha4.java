package MentorSber.DZ1;

//Задача 4
//Ввести с клавиатуры дату в формате дд.мм.гггг, вычислить следующую дату и вывести на экран в том же формате
//(Не использовать DateTime API)


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class Zadacha4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date time = null;
        try {
            time = format.parse(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(time);
        instance.add(Calendar.DATE,1);
        Date newDate = instance.getTime();

        System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(newDate));

    }
}
