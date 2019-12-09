package Homework1.DZ5;

import java.util.Scanner;

/**
 * Created by Andrey Holyavenko on 16.02.2019.
 */
public class Gameplay {
    private char[][] gameField;

    public char[][] getGameField() {
        return gameField;
    }

    public void setGameField(char[][] gameField) {
        this.gameField = gameField;
    }

    public void Game() {
        System.out.print("\n");
        System.out.println("Вас приветствует игра крестики-нолики! Попробуйте обыграть ANDREY)");
        System.out.print("\n");

        Field field = new Field();
        field.setField(field.PrintField(field.NewField()));
        Player player = new Player();
        player.setPlayerField(field.getField());
        setGameField(player.getPlayerField());

        while (!WinnerPlayer(getGameField()) && !WinnerComputer(getGameField()) && !DrawGame(getGameField())){

            player.PlayerAction(player.getPlayerField());

            if(!WinnerPlayer(getGameField()) && !WinnerComputer(getGameField()) && !DrawGame(getGameField())){
                player.ComputerAction(player.getPlayerField());
                setGameField(player.getPlayerField());
            }
            if (WinnerPlayer(getGameField())){
                System.out.print("\n");
                System.out.println("Выиграл Игрок, Поздравляем!!)");
            }
            if (WinnerComputer(getGameField())){
                System.out.print("\n");
                System.out.println("ВЫИГРАЛ Искусственный интеллект ANDREY, Вы ЛУЗЕР ) ахах !!)");
            }
           if(DrawGame(getGameField())){
               System.out.print("\n");
               System.out.println("Вы не смогли обыграть искусственный интеллект ANDREY !!  НИЧЬЯ!!))");
           }
        }
        System.out.print("\n");
        System.out.println("GAME OVER!!");

        Scanner in = new Scanner(System.in);
        int a = 0;

            System.out.print("\n");
            System.out.println("Хотите еще раз попробовать обыграть Andrey? Да - 1 ; Нет - 0 и нажмите ENTER : ");
            System.out.print("\n");
            a = in.nextInt();
            System.out.print("\n");
            while (a != 1 && a != 0) {
                System.out.print("\n");
                System.out.println("Данные введены некорректно, введите 0 или 1!! ");
                a = in.nextInt();
                System.out.print("\n");
            }

        if(a == 1){
            Game();
        } else{
            System.out.println("СПАСИБО ЗА ИГРУ!");
            return;
        }

    }

    public boolean WinnerPlayer(char[][] gameField) {
        char[][] WinnerPlayer = gameField;

        if(WinnerPlayer[0][0] == 'X' && WinnerPlayer[0][1] == 'X' && WinnerPlayer[0][2] == 'X' ){
            return true;
        }
        if(WinnerPlayer[0][0] == 'X' && WinnerPlayer[1][0] == 'X' && WinnerPlayer[2][0] == 'X' ){
            return true;
        }
        if(WinnerPlayer[2][0] == 'X' && WinnerPlayer[2][1] == 'X' && WinnerPlayer[2][2] == 'X' ){
            return true;
        }
        if(WinnerPlayer[0][2] == 'X' && WinnerPlayer[1][2] == 'X' && WinnerPlayer[2][2] == 'X' ){
            return true;
        }
        if(WinnerPlayer[0][0] == 'X' && WinnerPlayer[1][1] == 'X' && WinnerPlayer[2][2] == 'X' ){
            return true;
        }
        if(WinnerPlayer[0][2] == 'X' && WinnerPlayer[1][1] == 'X' && WinnerPlayer[2][0] == 'X' ){
            return true;
        }
        if(WinnerPlayer[1][0] == 'X' && WinnerPlayer[1][1] == 'X' && WinnerPlayer[1][2] == 'X' ){
            return true;
        }

        if(WinnerPlayer[0][1] == 'X' && WinnerPlayer[1][1] == 'X' && WinnerPlayer[2][1] == 'X' ){
            return true;
        }
        
        return false;
    }

    public boolean WinnerComputer(char[][] gameField) {
        
        char[][] WinnerComputer = gameField;
        
        if(WinnerComputer[0][0] == '0' && WinnerComputer[0][1] == '0' && WinnerComputer[0][2] == '0' ){
            return true;
        }
        if(WinnerComputer[0][0] == '0' && WinnerComputer[1][0] == '0' && WinnerComputer[2][0] == '0' ){
            return true;
        }
        if(WinnerComputer[2][0] == '0' && WinnerComputer[2][1] == '0' && WinnerComputer[2][2] == '0' ){
            return true;
        }
        if(WinnerComputer[0][2] == '0' && WinnerComputer[1][2] == '0' && WinnerComputer[2][2] == '0' ){
            return true;
        }
        if(WinnerComputer[0][0] == '0' && WinnerComputer[1][1] == '0' && WinnerComputer[2][2] == '0' ){
            return true;
        }
        if(WinnerComputer[0][2] == '0' && WinnerComputer[1][1] == '0' && WinnerComputer[2][0] == '0' ){
            return true;
        }
        if(WinnerComputer[1][0] == '0' && WinnerComputer[1][1] == '0' && WinnerComputer[1][2] == '0' ){
            return true;
        }
        if(WinnerComputer[0][1] == '0' && WinnerComputer[1][1] == '0' && WinnerComputer[2][1] == '0' ){
            return true;
        }
        
        return false;
    }
    
    

    public boolean DrawGame(char[][] gameField) {
        char[][] DrawGame = gameField;

        for (char[] a : DrawGame) {
            for (char i : a){
                if (i != 'X' && i != '0'){
                    return false;
                }

            }
        }
         return true;
    }
}

