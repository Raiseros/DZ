package MentorSber.DZ1;


//Задача 2
//Ввести с клавиатуры время в формате чч:мм:сс, перевести в секунды и вывести результат на экран (не использовать DateTime API)


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import static java.lang.Integer.parseInt;

public class Zadacha2 {

    public static void main(String[] args) throws IOException, ParseException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat format = new SimpleDateFormat("kk:mm:ss");

        Date time = null;
        try {
            time = format.parse(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String format2 = new SimpleDateFormat("kk").format(time);
        int a = parseInt(format2) * 3600;

        String format3 = new SimpleDateFormat("mm").format(time);
        int b = parseInt(format3) * 60;

        String format4 = new SimpleDateFormat("ss").format(time);
        int c = parseInt(format4);

        System.out.println(a + b + c);
    }

}


