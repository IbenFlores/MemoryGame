package game;

import javax.swing.*;

public class Card extends JButton {
    private String value;
    private boolean revealed;

    public Card(String value) {
        this.value = value;
        this.revealed = false;


        setText("?");
        addActionListener(e -> reveal());
    }

    public void reveal() {
        if (!revealed) {
            setText(value);
            revealed = true;
        } else {
            setText("?");
            revealed = false;
        }
    }

    public String getValue() {
        return value;
    }

    public boolean isRevealed() {
        return revealed;
    }
}