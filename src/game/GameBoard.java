package game;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private int rows;
    private int cols;

    public GameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        // Configura un diseño de cuadrícula
        setLayout(new GridLayout(rows, cols));

        // Agrega las cartas al tablero
        for (int i = 0; i < rows * cols; i++) {
            Card card = new Card("Card " + (i / 2)); // Pares de cartas
            add(card);
        }
    }
}