package net.arsenalnetwork.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DrawButton {

    public static JButton buttonVanilla = new JButton();
    public static JButton buttonForge = new JButton();

    public static void drawButtonVanilla(String buttonText, int x, int y, int width, int height, Color mainColor, ActionListener actionListener, JPanel jPanel) {
        buttonVanilla.setText(buttonText);
        buttonVanilla.setBounds(x, y, width, height);
        buttonVanilla.setLocation(x, y);
        buttonVanilla.setBackground(mainColor);
        buttonVanilla.addActionListener(actionListener);
        jPanel.add(buttonVanilla);
    }

    public static void drawButtonForge(String buttonText, int x, int y, int width, int height, Color mainColor, ActionListener actionListener, JPanel jPanel) {
        buttonForge.setText(buttonText);
        buttonForge.setBounds(x, y, width, height);
        buttonForge.setLocation(x, y);
        buttonForge.setBackground(mainColor);
        buttonForge.addActionListener(actionListener);
        jPanel.add(buttonForge);
    }

}
