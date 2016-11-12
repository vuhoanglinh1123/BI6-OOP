/**
 * Created by LINHBOB on 11/6/2016.
 */
import com.sudoku.*;

import javax.swing.*;

public class Sudoku {
    public static void main(String[] args) {
        SudokuGUI gui = new SudokuGUI();

        //Polymorphism
        Buttons[] button = new Buttons[2];
        button[0] = new Solve();
        button[1] = new Randomize();

        gui.buttonPanel.add(button[0].BUTTON = new JButton("Solve"));
        gui.buttonPanel.add(button[1].BUTTON = new JButton("Randomize"));

        gui.update();

        button[0].BUTTON.addActionListener(button[0]);
        button[1].BUTTON.addActionListener(button[1]);
    }
}
