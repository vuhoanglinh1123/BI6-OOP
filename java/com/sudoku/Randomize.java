package com.sudoku;

import java.awt.event.ActionEvent;
import java.util.Random;

/**
 * Created by LINHBOB on 11/12/2016.
 */
//Child class of Buttons
//Inherits variable BUTTON
public class Randomize extends Buttons implements Board{

    public void random(){
        Random rand = new Random();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                demo[row][col] = rand.nextInt(10);
            }
        }
    }

    public void actionPerformed(ActionEvent e){
        random();
        SudokuGUI.update(); //class method -> no need to instantiated or extended from
    }
}
