package MentorSber.DZ1;

//Задача 6
//Игра "куча". Человек и компьютер по очереди делают ходы, забирая из кучи, состоящей из N предметов, от 1 до K штук.
//Проигрывает тот, кто забрал последний предмет. Найти для компьютера оптимальную стратегию.



import java.util.Random;
import java.util.Scanner;

public class Zadacha6 {

    private static int MAX_ELEMENT_COUNT = 3;
    private static int DELTA = 2;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Random random = new Random();
         int currentElementCount = getStartElementCount();
         int currentMaxDelElementCount = getGameMaxDelElementCount(currentElementCount);


        while (currentElementCount >= 0) {

            int currentDelElemCount = getCurrentDelElementCount(currentMaxDelElementCount);

            if((currentElementCount - currentDelElemCount) <= currentMaxDelElementCount){
                    currentMaxDelElementCount = currentElementCount - currentDelElemCount;
            }
                currentElementCount = currentElementCount - currentDelElemCount;

           printCurrentSituation(currentElementCount);


            if (currentElementCount == 1) {
                    System.out.println("Компьютер проиграл, забрал последний предмет");
                    break;
            }

                System.out.print("Компьютер введите сколько предметов забрать от 1 до " + currentMaxDelElementCount + " : ");

                currentDelElemCount = 0;

                while(currentDelElemCount == 0 || currentDelElemCount >= currentElementCount
                        || currentDelElemCount > currentMaxDelElementCount){
                    if(currentElementCount == (currentMaxDelElementCount + 1)){
                        currentDelElemCount = currentMaxDelElementCount;

                    } else if (currentElementCount == currentMaxDelElementCount){
                            currentDelElemCount = currentElementCount - 1;
                        }else if ( currentDelElemCount > currentMaxDelElementCount){
                                currentDelElemCount = 1;
                            }else{
                                currentDelElemCount = random.nextInt(currentElementCount);
                            }
                        }






                currentElementCount = currentElementCount - currentDelElemCount;

                System.out.println(currentDelElemCount);
                if(currentElementCount < currentMaxDelElementCount){
                    currentMaxDelElementCount = currentElementCount;
                }

                printCurrentSituation(currentElementCount);


                if (currentElementCount == 1) {
                    System.out.println("Игрок проиграл, забрал последний предмет");
                    break;
                }

            }
        System.out.println("Game over!!!");
        }



    private static int getStartElementCount(){
            System.out.print("Введите количество предметов: ");
            int startElCount = scanner.nextInt();

            while (startElCount < MAX_ELEMENT_COUNT) {
                System.out.print("Вы ввели неправильное кол-во предметов, повторите попытку: ");
                startElCount = scanner.nextInt();
            }
            return startElCount;
        }

    private static int getGameMaxDelElementCount(int startElementCount) {
        System.out.print("Введите максимальное количество забираемых предметов за ход от 1 до "
                + (startElementCount - DELTA) + " : ");
        int currentDelCount = scanner.nextInt();

        int maxDelCount = startElementCount - DELTA;
        int minDelcount = 1;
        while (currentDelCount > maxDelCount || currentDelCount < minDelcount) {
            System.out.print("Вы ввели неправильное кол-во забираемых предметов, повторите попытку: ");
            currentDelCount = scanner.nextInt();
        }

        return currentDelCount;

    }

    private static  int getCurrentDelElementCount(int gameMaxDelElementCount){
        System.out.print("Игрок введите сколько предметов забрать от 1 до " + gameMaxDelElementCount + " : ");
        int currentDelElCount = scanner.nextInt();

        while (currentDelElCount > gameMaxDelElementCount || currentDelElCount == 0) {
            System.out.print("Вы ввели неправильное кол-во предметов, повторите попытку: ");
            currentDelElCount = scanner.nextInt();
        }
        return currentDelElCount;
    }

    private static void printCurrentSituation(int currentElementCount){
        if (currentElementCount == 1){
            System.out.println("Остался " + currentElementCount + " предмет");
        } else if (currentElementCount > 1 && currentElementCount < 5 ){
            System.out.println("Осталось " + currentElementCount + " предмета");
        } else if (currentElementCount > 4){
            System.out.println("Осталось " + currentElementCount + " предметов");
        }
    }
}
