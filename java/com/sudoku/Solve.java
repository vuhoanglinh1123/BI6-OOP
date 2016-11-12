package com.sudoku;

import java.awt.event.ActionEvent;

/**
 * Created by LINHBOB on 11/12/2016.
 */
//Child class of Buttons.java
//Inherits variable BUTTON
public class Solve extends Buttons implements Board{
    public void solve(){
        java.util.Random rand = new java.util.Random();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                demo[row][col] = rand.nextInt(10);
            }
        }
    }

    public void actionPerformed(ActionEvent e){
        solve();
        SudokuGUI.update(); //class method -> no need to instantiated or extended from
    }
}
