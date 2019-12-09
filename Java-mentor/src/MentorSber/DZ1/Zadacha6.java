package MentorSber.DZ1;

//Задача 6
//Игра "куча". Человек и компьютер по очереди делают ходы, забирая из кучи, состоящей из N предметов, от 1 до K штук.
//Проигрывает тот, кто забрал последний предмет. Найти для компьютера оптимальную стратегию.



import java.util.Random;
import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner a = new Scanner(System.in);
        System.out.print("Введите количество предметов: ");
        int num = a.nextInt();

        while (num < 3) {
            System.out.print("Вы ввели неправильное кол-во предметов, повторите попытку: ");
            num = a.nextInt();
        }

        Scanner b = new Scanner(System.in);
        int min = 1;
        System.out.print("Введите максимальное количество забираемых предметов за ход от 1 до " + (num - 2) + " : ");
        int max = b.nextInt();

        while (max > num - 2 || max < 1) {
            System.out.print("Вы ввели неправильное кол-во забираемых предметов, повторите попытку: ");
            max = b.nextInt();
        }
        Scanner c = new Scanner(System.in);

        while (num >= 0) {
            System.out.print("Игрок введите сколько предметов забрать от 1 до " + max + " : ");
            int temp = c.nextInt();

            while (temp > max || temp == 0) {
                System.out.print("Вы ввели неправильное кол-во предметов, повторите попытку: ");
                temp = c.nextInt();
            }
                if((num - temp) <= max){
                    max = num - temp;
                }
                num = num - temp;

                if (num == 1){
                    System.out.println("Осталcя " + num + " предмет");
                }

                if (num > 1 && num < 5 ){
                System.out.println("Осталось " + num + " предмета");
            }
                if (num > 4){
                System.out.println("Осталось " + num + " предметов");
            }


                if (num == 1) {
                    System.out.println("Компьютер проиграл, забрал последний предмет");
                    break;
                }

                System.out.print("Компьютер введите сколько предметов забрать от 1 до " + max + " : ");

                temp = 0;

                while(temp == 0 || temp >= num || temp > max){
                    if(num == (max + 1)){
                        temp = max;

                    } else{
                        if (num == max){
                            temp = num - 1;
                        }else{
                            if ( temp > max){
                                temp = 1;
                            }else{
                                temp = random.nextInt(num);
                            }
                        }

                    }


                }

                num = num - temp;

                System.out.println(temp);
                if(num < max){
                    max = num;
                }


                if (num == 1){
                System.out.println("Остался " + num + " предмет");
            }

                if (num > 1 && num < 5 ){
                System.out.println("Осталось " + num + " предмета");
            }

                if (num > 4){
                System.out.println("Осталось " + num + " предметов");
            }



                if (num == 1) {
                    System.out.println("Игрок проиграл, забрал последний предмет");
                    break;
                }

            }
        System.out.println("Game over!!!");
        }

    }
