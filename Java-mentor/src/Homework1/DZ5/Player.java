package Homework1.DZ5;



import java.util.Scanner;
import java.util.Random;

/**
 * Created by Andrey Holyavenko on 16.02.2019.
 */
public class Player {

    private char[][] PlayerField;

    public char[][] getPlayerField() {
        return PlayerField;
    }

    public void setPlayerField(char[][] playerField) {
        PlayerField = playerField;
    }

    public char[][] PlayerAction(char[][] PlayerField) {

        char[][] PlayerAction = PlayerField;
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;

        do {

            do {
                System.out.print("\n");
                System.out.println("Игрок Ваш ход, введите координаты YX , для того, чтобы поставить X!");
                System.out.print("\n");
                System.out.println("Введите координату Y , ЧИСЛО ! и нажмите ENTER ! : ");
                a = in.nextInt();
                while (a != 0 && a != 1 && a != 2) {
                    System.out.print("\n");
                    System.out.println("Данные введены некорректно, введите координаты точки от 0 до 2!! ");
                    a = in.nextInt();
                }
                System.out.print("\n");
                System.out.println("Введите координату X , ЧИСЛО ! и нажмите ENTER ! : ");
                b = in.nextInt();
                while (b != 0 && b != 1 && b != 2) {
                    System.out.print("\n");
                    System.out.println("Данные введены некорректно, введите координаты точки от 0 до 2!! ");
                    b = in.nextInt();
                }
                System.out.print("\n");
                if (PlayerAction[a][b] == 'X') {
                    System.out.println("Данное поле занято, попробуйте еще раз!!");
                    System.out.print("\n");
                }

            } while (PlayerAction[a][b] == 'X');

            if (PlayerAction[a][b] != 'X' && PlayerAction[a][b] != '0') {
                PlayerAction[a][b] = 'X';
            } else {
                System.out.println("Данное поле занято, попробуйте еще раз!!");
                System.out.print("\n");

            }

        } while (PlayerAction[a][b] != 'X');

        Field field = new Field();
        field.PrintField(PlayerAction);

        return PlayerAction;
    }

    public char[][] ComputerAction(char[][] PlayerField) {
        char[][] ComputerAction = PlayerField;

        System.out.print("\n");
        System.out.println("Теперь ход компьютера,который играет за 0!");
        System.out.print("\n");
        Random random = new Random();
        int a = 0;
        int b = 0;
        do {
            do {
                if (ComputerAction[1][1] != 'X' && ComputerAction[1][1] != '0') {
                    a = 1;
                    b = 1;
                    break;
                } else {
                    if (ComputerAction[0][0] == '0' && ComputerAction[0][1] == '0' && ComputerAction[0][2] != 'X') {
                        b = 2;
                        break;
                    } else {
                        if (ComputerAction[0][2] == '0' && ComputerAction[0][1] == '0' && ComputerAction[0][0] != 'X') {
                            break;
                        } else {
                            if (ComputerAction[0][0] == '0' && ComputerAction[1][0] == '0' && ComputerAction[2][0] != 'X') {
                                a = 2;
                                break;
                            } else {
                                if (ComputerAction[2][0] == '0' && ComputerAction[1][0] == '0' && ComputerAction[0][0] != 'X') {
                                    break;
                                } else {
                                    if (ComputerAction[1][0] == '0' && ComputerAction[1][1] == '0' && ComputerAction[1][2] != 'X') {
                                        a = 1;
                                        b = 2;
                                        break;
                                    } else {
                                        if (ComputerAction[1][2] == '0' && ComputerAction[1][1] == '0' && ComputerAction[1][0] != 'X') {
                                            a = 1;
                                            break;
                                        } else {
                                            if (ComputerAction[2][0] == '0' && ComputerAction[2][1] == '0' && ComputerAction[2][2] != 'X') {
                                                a = 2;
                                                b = 2;
                                                break;
                                            } else {
                                                if (ComputerAction[2][2] == '0' && ComputerAction[2][1] == '0' && ComputerAction[2][0] != 'X') {
                                                    a = 2;
                                                    break;
                                                } else {
                                                    if (ComputerAction[0][2] == '0' && ComputerAction[1][2] == '0' && ComputerAction[2][2] != 'X') {
                                                        a = 2;
                                                        b = 2;
                                                        break;
                                                    } else {
                                                        if (ComputerAction[2][2] == '0' && ComputerAction[1][2] == '0' && ComputerAction[0][2] != 'X') {
                                                            b = 2;
                                                            break;
                                                        } else {
                                                            if (ComputerAction[0][2] == '0' && ComputerAction[1][1] == '0' && ComputerAction[2][0] != 'X') {
                                                                a = 2;
                                                                break;
                                                            } else {
                                                                if (ComputerAction[2][0] == '0' && ComputerAction[1][1] == '0' && ComputerAction[0][2] != 'X') {
                                                                    b = 2;
                                                                    break;
                                                                } else {
                                                                    if (ComputerAction[0][0] == '0' && ComputerAction[1][1] == '0' && ComputerAction[2][2] != 'X') {
                                                                        a = 2;
                                                                        b = 2;
                                                                        break;
                                                                    } else {
                                                                        if (ComputerAction[2][2] == '0' && ComputerAction[1][1] == '0' && ComputerAction[0][0] != 'X') {
                                                                            break;
                                                                        } else {
                                                                            if (ComputerAction[0][1] == '0' && ComputerAction[1][1] == '0' && ComputerAction[2][1] != 'X') {
                                                                                a = 2;
                                                                                b = 1;
                                                                                break;
                                                                            } else {
                                                                                if (ComputerAction[2][1] == '0' && ComputerAction[1][1] == '0' && ComputerAction[0][1] != 'X') {
                                                                                    b = 1;
                                                                                    break;
                                                                                } else {
                                                                                    if (ComputerAction[0][0] == '0' && ComputerAction[0][2] == '0' && ComputerAction[0][1] != 'X') {
                                                                                        b = 1;
                                                                                        break;
                                                                                    } else {
                                                                                        if (ComputerAction[0][0] == '0' && ComputerAction[2][0] == '0' && ComputerAction[1][0] != 'X') {
                                                                                            a = 1;
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComputerAction[2][0] == '0' && ComputerAction[2][2] == '0' && ComputerAction[2][1] != 'X') {
                                                                                                a = 2;
                                                                                                b = 1;
                                                                                                break;
                                                                                            } else {
                                                                                                if (ComputerAction[0][2] == '0' && ComputerAction[2][2] == '0' && ComputerAction[1][2] != 'X') {
                                                                                                    a = 1;
                                                                                                    b = 2;
                                                                                                    break;
                                                                                                } else {
                                                                                                    if (ComputerAction[0][0] == 'X' && ComputerAction[0][1] == 'X' && ComputerAction[0][2] != '0') {
                                                                                                        b = 2;
                                                                                                        break;
                                                                                                    } else {
                                                                                                        if (ComputerAction[0][2] == 'X' && ComputerAction[0][1] == 'X' && ComputerAction[0][0] != '0') {
                                                                                                            break;
                                                                                                        } else {
                                                                                                            if (ComputerAction[0][0] == 'X' && ComputerAction[1][0] == 'X' && ComputerAction[2][0] != '0') {
                                                                                                                a = 2;
                                                                                                                break;
                                                                                                            } else {
                                                                                                                if (ComputerAction[2][0] == 'X' && ComputerAction[1][0] == 'X' && ComputerAction[0][0] != '0') {
                                                                                                                    break;
                                                                                                                } else {
                                                                                                                    if (ComputerAction[1][0] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[1][2] != '0') {
                                                                                                                        a = 1;
                                                                                                                        b = 2;
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        if (ComputerAction[1][2] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[1][0] != '0') {
                                                                                                                            a = 1;
                                                                                                                            break;
                                                                                                                        } else {
                                                                                                                            if (ComputerAction[2][0] == 'X' && ComputerAction[2][1] == 'X' && ComputerAction[2][2] != '0') {
                                                                                                                                a = 2;
                                                                                                                                b = 2;
                                                                                                                                break;
                                                                                                                            } else {
                                                                                                                                if (ComputerAction[2][2] == 'X' && ComputerAction[2][1] == 'X' && ComputerAction[2][0] != '0') {
                                                                                                                                    a = 2;
                                                                                                                                    break;
                                                                                                                                } else {
                                                                                                                                    if (ComputerAction[0][2] == 'X' && ComputerAction[1][2] == 'X' && ComputerAction[2][2] != '0') {
                                                                                                                                        a = 2;
                                                                                                                                        b = 2;
                                                                                                                                        break;
                                                                                                                                    } else {
                                                                                                                                        if (ComputerAction[2][2] == 'X' && ComputerAction[1][2] == 'X' && ComputerAction[0][2] != '0') {
                                                                                                                                            b = 2;
                                                                                                                                            break;
                                                                                                                                        } else {
                                                                                                                                            if (ComputerAction[0][2] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[2][0] != '0') {
                                                                                                                                                a = 2;
                                                                                                                                                break;
                                                                                                                                            } else {
                                                                                                                                                if (ComputerAction[2][0] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[0][2] != '0') {
                                                                                                                                                    b = 2;
                                                                                                                                                    break;
                                                                                                                                                } else {
                                                                                                                                                    if (ComputerAction[0][0] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[2][2] != '0') {
                                                                                                                                                        a = 2;
                                                                                                                                                        b = 2;
                                                                                                                                                        break;
                                                                                                                                                    } else {
                                                                                                                                                        if (ComputerAction[2][2] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[0][0] != '0') {
                                                                                                                                                            break;
                                                                                                                                                        } else {
                                                                                                                                                            if (ComputerAction[0][1] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[2][1] != '0') {
                                                                                                                                                                a = 2;
                                                                                                                                                                b = 1;
                                                                                                                                                                break;
                                                                                                                                                            } else {
                                                                                                                                                                if (ComputerAction[2][1] == 'X' && ComputerAction[1][1] == 'X' && ComputerAction[0][1] != '0') {
                                                                                                                                                                    b = 1;
                                                                                                                                                                    break;
                                                                                                                                                                } else {
                                                                                                                                                                    if (ComputerAction[0][0] == 'X' && ComputerAction[0][2] == 'X' && ComputerAction[0][1] != '0') {
                                                                                                                                                                        b = 1;
                                                                                                                                                                        break;
                                                                                                                                                                    } else {
                                                                                                                                                                        if (ComputerAction[0][0] == 'X' && ComputerAction[2][0] == 'X' && ComputerAction[1][0] != '0') {
                                                                                                                                                                            a = 1;
                                                                                                                                                                            break;
                                                                                                                                                                        } else {
                                                                                                                                                                            if (ComputerAction[2][0] == 'X' && ComputerAction[2][2] == 'X' && ComputerAction[2][1] != '0') {
                                                                                                                                                                                a = 2;
                                                                                                                                                                                b = 1;
                                                                                                                                                                                break;
                                                                                                                                                                            } else {
                                                                                                                                                                                if (ComputerAction[0][2] == 'X' && ComputerAction[2][2] == 'X' && ComputerAction[1][2] != '0') {
                                                                                                                                                                                    a = 1;
                                                                                                                                                                                    b = 2;
                                                                                                                                                                                    break;
                                                                                                                                                                                }

                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                     a = random.nextInt(3);
                     b = random.nextInt(3);

            } while (ComputerAction[a][b] == '0') ;


            if (ComputerAction[a][b] != 'X' && ComputerAction[a][b] != '0') {
                    ComputerAction[a][b] = '0';
            }

        } while (ComputerAction[a][b] != '0');

        System.out.print("\n");
        Field field = new Field();
        field.PrintField(ComputerAction);

        return ComputerAction;

    }

  }

