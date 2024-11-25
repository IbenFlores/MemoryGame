package game;

import javax.swing.*;

public class MemoryGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego de Memoria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setResizable(false);

        GameBoard gameBoard = new GameBoard(4, 4);
        frame.add(gameBoard);

        frame.setVisible(true);
    }
}