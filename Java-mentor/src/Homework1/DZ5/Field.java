package Homework1.DZ5;

import java.util.Scanner;

/**
 * Created by Andrey Holyavenko on 16.02.2019.
 */
public class Field {

    private  char[][] fieldHolder;

    public char[][] getField() {
        return fieldHolder;
    }

    public Field() {
        int rowNum = 3;
        int columnNum = 3;
        fieldHolder = new char[rowNum][columnNum];
        for (int a = 0; a < rowNum; a++) {
            for (int b = 0; b < columnNum; b++) {
                fieldHolder[a][b] = '*';

            }
        }
    }

    public void setField(char[][] field) {
        this.fieldHolder = field;
    }



    public void printField(){


        for (int a = 0; a < fieldHolder.length; a++) {
            for (int b = 0; b < fieldHolder.length; b++) {
                System.out.print(fieldHolder[a][b] + "\t");

            }
            System.out.print("\n");
        }

    }

}
