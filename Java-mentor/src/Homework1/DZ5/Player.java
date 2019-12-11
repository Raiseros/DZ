package Homework1.DZ5;



import java.util.Scanner;
import java.util.Random;

/**
 * Created by Andrey Holyavenko on 16.02.2019.
 */
public class Player {

    private char[][] playerField;

    public char[][] getPlayerField() {
        return playerField;
    }

    public void setPlayerField(char[][] playerField) {
        this.playerField = playerField;
    }

    public char[][] getPlayerAction(char[][] playerField) {

        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;

        do {

            do {

                System.out.println("\nИгрок Ваш ход, введите координаты YX , для того, чтобы поставить X!");
                System.out.println("\nВведите координату Y , ЧИСЛО ! и нажмите ENTER ! : ");
                a = in.nextInt();
                while (a != 0 && a != 1 && a != 2) {
                    System.out.println("\nДанные введены некорректно, введите координаты точки от 0 до 2!! ");
                    a = in.nextInt();
                }
                System.out.println("\nВведите координату X , ЧИСЛО ! и нажмите ENTER ! : ");
                b = in.nextInt();
                while (b != 0 && b != 1 && b != 2) {
                    System.out.println("\nДанные введены некорректно, введите координаты точки от 0 до 2!! \n");
                    b = in.nextInt();
                }
                if (playerField[a][b] == 'X') {
                    System.out.println("\nДанное поле занято, попробуйте еще раз!!\n");
                }

            } while (playerField[a][b] == 'X');

            if (playerField[a][b] != 'X' && playerField[a][b] != '0') {
                playerField[a][b] = 'X';
            } else {
                System.out.println("Данное поле занято, попробуйте еще раз!!\n");
            }

        } while (playerField[a][b] != 'X');

        Field field = new Field();
        field.setField(playerField);
        field.printField();
       // field.printField(playerAction);

        return playerField;
    }

    public char[][] getComputerAction(char[][] PlayerField) {

        System.out.println("\nТеперь ход компьютера,который играет за 0!\n");
        Random random = new Random();
        int a = 0;
        int b = 0;
        do {
            do {
                if (PlayerField[1][1] != 'X' && PlayerField[1][1] != '0') {
                    a = 1;
                    b = 1;
                    break;
                } else if (PlayerField[0][0] == '0' && PlayerField[0][1] == '0' && PlayerField[0][2] != 'X') {
                    b = 2;
                    break;

                } else if (PlayerField[0][2] == '0' && PlayerField[0][1] == '0' && PlayerField[0][0] != 'X') {
                    break;

                } else if (PlayerField[0][0] == '0' && PlayerField[1][0] == '0' && PlayerField[2][0] != 'X') {
                    a = 2;
                    break;

                } else if (PlayerField[2][0] == '0' && PlayerField[1][0] == '0' && PlayerField[0][0] != 'X') {
                    break;

                } else  if (PlayerField[1][0] == '0' && PlayerField[1][1] == '0' && PlayerField[1][2] != 'X') {
                    a = 1;
                    b = 2;
                    break;

                } else if (PlayerField[1][2] == '0' && PlayerField[1][1] == '0' && PlayerField[1][0] != 'X') {
                    a = 1;
                    break;

                } else if (PlayerField[2][0] == '0' && PlayerField[2][1] == '0' && PlayerField[2][2] != 'X') {
                    a = 2;
                    b = 2;
                    break;

                } else if (PlayerField[2][2] == '0' && PlayerField[2][1] == '0' && PlayerField[2][0] != 'X') {
                    a = 2;
                    break;

                } else if (PlayerField[0][2] == '0' && PlayerField[1][2] == '0' && PlayerField[2][2] != 'X') {
                    a = 2;
                    b = 2;
                    break;

                } else if (PlayerField[2][2] == '0' && PlayerField[1][2] == '0' && PlayerField[0][2] != 'X') {
                        b = 2;
                        break;

                } else if (PlayerField[0][2] == '0' && PlayerField[1][1] == '0' && PlayerField[2][0] != 'X') {
                    a = 2;
                    break;

                } else if (PlayerField[2][0] == '0' && PlayerField[1][1] == '0' && PlayerField[0][2] != 'X') {
                    b = 2;
                    break;

                } else if (PlayerField[0][0] == '0' && PlayerField[1][1] == '0' && PlayerField[2][2] != 'X') {
                    a = 2;
                    b = 2;
                    break;

                } else if (PlayerField[2][2] == '0' && PlayerField[1][1] == '0' && PlayerField[0][0] != 'X') {
                    break;

                } else if (PlayerField[0][1] == '0' && PlayerField[1][1] == '0' && PlayerField[2][1] != 'X') {
                    a = 2;
                    b = 1;
                    break;

                } else if (PlayerField[2][1] == '0' && PlayerField[1][1] == '0' && PlayerField[0][1] != 'X') {
                    b = 1;
                    break;

                } else if (PlayerField[0][0] == '0' && PlayerField[0][2] == '0' && PlayerField[0][1] != 'X') {
                    b = 1;
                    break;

                } else if (PlayerField[0][0] == '0' && PlayerField[2][0] == '0' && PlayerField[1][0] != 'X') {
                    a = 1;
                    break;

                } else if (PlayerField[2][0] == '0' && PlayerField[2][2] == '0' && PlayerField[2][1] != 'X') {
                    a = 2;
                    b = 1;
                    break;

                } else if (PlayerField[0][2] == '0' && PlayerField[2][2] == '0' && PlayerField[1][2] != 'X') {
                    a = 1;
                    b = 2;
                    break;

                } else if (PlayerField[0][0] == 'X' && PlayerField[0][1] == 'X' && PlayerField[0][2] != '0') {
                    b = 2;
                    break;

                } else if (PlayerField[0][2] == 'X' && PlayerField[0][1] == 'X' && PlayerField[0][0] != '0') {
                    break;

                } else if (PlayerField[0][0] == 'X' && PlayerField[1][0] == 'X' && PlayerField[2][0] != '0') {
                    a = 2;
                    break;

                } else if (PlayerField[2][0] == 'X' && PlayerField[1][0] == 'X' && PlayerField[0][0] != '0') {
                    break;

                } else if (PlayerField[1][0] == 'X' && PlayerField[1][1] == 'X' && PlayerField[1][2] != '0') {
                    a = 1;
                    b = 2;
                    break;

                } else if (PlayerField[1][2] == 'X' && PlayerField[1][1] == 'X' && PlayerField[1][0] != '0') {
                    a = 1;
                    break;

                } else if (PlayerField[2][0] == 'X' && PlayerField[2][1] == 'X' && PlayerField[2][2] != '0') {
                    a = 2;
                    b = 2;
                    break;

                } else if (PlayerField[2][2] == 'X' && PlayerField[2][1] == 'X' && PlayerField[2][0] != '0') {
                    a = 2;
                    break;

                } else  if (PlayerField[0][2] == 'X' && PlayerField[1][2] == 'X' && PlayerField[2][2] != '0') {
                    a = 2;
                    b = 2;
                    break;

                } else if (PlayerField[2][2] == 'X' && PlayerField[1][2] == 'X' && PlayerField[0][2] != '0') {
                    b = 2;
                    break;

                } else if (PlayerField[0][2] == 'X' && PlayerField[1][1] == 'X' && PlayerField[2][0] != '0') {
                    a = 2;
                    break;

                } else if (PlayerField[2][0] == 'X' && PlayerField[1][1] == 'X' && PlayerField[0][2] != '0') {
                    b = 2;
                    break;

                } else if (PlayerField[0][0] == 'X' && PlayerField[1][1] == 'X' && PlayerField[2][2] != '0') {
                    a = 2;
                    b = 2;
                    break;

                } else if (PlayerField[2][2] == 'X' && PlayerField[1][1] == 'X' && PlayerField[0][0] != '0') {
                    break;

                } else if (PlayerField[0][1] == 'X' && PlayerField[1][1] == 'X' && PlayerField[2][1] != '0') {
                    a = 2;
                    b = 1;
                    break;

                } else if (PlayerField[2][1] == 'X' && PlayerField[1][1] == 'X' && PlayerField[0][1] != '0') {
                    b = 1;
                    break;

                } else if (PlayerField[0][0] == 'X' && PlayerField[0][2] == 'X' && PlayerField[0][1] != '0') {
                    b = 1;
                    break;

                } else if (PlayerField[0][0] == 'X' && PlayerField[2][0] == 'X' && PlayerField[1][0] != '0') {
                    a = 1;
                    break;

                } else if (PlayerField[2][0] == 'X' && PlayerField[2][2] == 'X' && PlayerField[2][1] != '0') {
                    a = 2;
                    b = 1;
                    break;

                } else if (PlayerField[0][2] == 'X' && PlayerField[2][2] == 'X' && PlayerField[1][2] != '0') {
                    a = 1;
                    b = 2;
                    break;

                }
                     a = random.nextInt(3);
                     b = random.nextInt(3);

            } while (PlayerField[a][b] == '0') ;


            if (PlayerField[a][b] != 'X' && PlayerField[a][b] != '0') {
                    PlayerField[a][b] = '0';
            }

        } while (PlayerField[a][b] != '0');

        System.out.print("\n");
        Field field = new Field();
        field.setField(PlayerField);
        field.printField();

        return PlayerField;

    }

  }

