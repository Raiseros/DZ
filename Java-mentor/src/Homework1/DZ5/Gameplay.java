package Homework1.DZ5;

import java.util.Scanner;

/**
 * Created by Andrey Holyavenko on 16.02.2019.
 */
public class Gameplay {
    private char[][] gameField;


    public void playGame() {

        System.out.println("\nВас приветсвует игра крестики-нолики! Попробуйте обыграть ANDREY)\n");


        Field field = new Field();
        field.printField();
        Player player = new Player();
        player.setPlayerField(field.getField());
        gameField = player.getPlayerField();


        while (!isWin('X') && !isWin('0') && !getDrawGame(gameField)){

            player.getPlayerAction(player.getPlayerField());

            if(!isWin('X') && !isWin('0') && !getDrawGame(gameField)){
                player.getComputerAction(player.getPlayerField());
                gameField = player.getPlayerField();
            }
            if (isWin('X')){
                System.out.println("\nВыиграл Игрок, Поздравляем!!)");
            }
            if (isWin('0')){
                System.out.println("\nВЫИГРАЛ Искусственный интеллект ANDREY, Вы ЛУЗЕР ) ахах !!)");
            }
           if(getDrawGame(gameField)){
               System.out.println("\nВы не смогли обыграть искусственный интеллект ANDREY !!  НИЧЬЯ!!))");
           }
        }

        System.out.println("\nGAME OVER!!");

        Scanner in = new Scanner(System.in);
        int a = 0;


            System.out.println("\nХотите еще раз попробовать обыграть Andrey? Да - 1 ; Нет - 0 и нажмите ENTER : \n");

            a = in.nextInt();

            while (a != 1 && a != 0) {

                System.out.println("\nДанные введены некорректно, введите 0 или 1!! \n");
                a = in.nextInt();

            }

        if(a == 1){
            playGame();
        } else{
            System.out.println("СПАСИБО ЗА ИГРУ!");
            return;
        }

    }

    public boolean isWin(char simbol) {


        if(gameField[0][0] == simbol && gameField[0][1] == simbol && gameField[0][2] == simbol ){
            return true;
        }
        if(gameField[0][0] == simbol && gameField[1][0] == simbol && gameField[2][0] == simbol ){
            return true;
        }
        if(gameField[2][0] == simbol && gameField[2][1] == simbol && gameField[2][2] == simbol ){
            return true;
        }
        if(gameField[0][2] == simbol && gameField[1][2] == simbol && gameField[2][2] == simbol ){
            return true;
        }
        if(gameField[0][0] == simbol && gameField[1][1] == simbol && gameField[2][2] == simbol ){
            return true;
        }
        if(gameField[0][2] == simbol && gameField[1][1] == simbol && gameField[2][0] == simbol ){
            return true;
        }
        if(gameField[1][0] == simbol && gameField[1][1] == simbol && gameField[1][2] == simbol ){
            return true;
        }

        if(gameField[0][1] == simbol && gameField[1][1] == simbol && gameField[2][1] == simbol ){
            return true;
        }
        
        return false;
    }



    public boolean getDrawGame(char[][] gameField) {

        for (char[] a : gameField) {
            for (char i : a){
                if (i != 'X' && i != '0'){
                    return false;
                }

            }
        }
         return true;
    }
}

