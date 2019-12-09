package Homework1.DZ5;

import java.util.Scanner;

/**
 * Created by Andrey Holyavenko on 16.02.2019.
 */
public class Field {

    private  char[][] field;

    public char[][] getField() {
        return field;
    }

    public void setField(char[][] field) {
        this.field = field;
    }

    public  char[][] NewField () {
        int rowNum = 3;
        int columnNum = 3;
        char[][] NewField = new char[rowNum][columnNum];
        for (int a = 0; a < rowNum; a++) {
            for (int b = 0; b < columnNum; b++) {
                NewField[a][b] = '*';

            }
        }
        return NewField;
    }


    public  char[][] PrintField (char[][] NewField){
        char[][] PrintField = NewField;

        for (int a = 0; a < PrintField.length; a++) {
            for (int b = 0; b < PrintField.length; b++) {
                System.out.print(PrintField[a][b] + "\t");

            }
            System.out.print("\n");
        }
        return PrintField;
    }

}
