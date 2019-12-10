package net.arsenalnetwork.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DrawButton {

    public static JButton buttonVanilla = new JButton();
    public static JButton buttonForge = new JButton();
    public static JButton buttonForgeSpigot = new JButton();
    public static JButton buttonProxies = new JButton();
    public static JButton buttonPocketEdition = new JButton();


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

    public static void drawButtonForgeSpigot(String buttonText, int x, int y, int width, int height, Color mainColor, ActionListener actionListener, JPanel jPanel) {
        buttonForgeSpigot.setText(buttonText);
        buttonForgeSpigot.setBounds(x, y, width, height);
        buttonForgeSpigot.setLocation(x, y);
        buttonForgeSpigot.setBackground(mainColor);
        buttonForgeSpigot.addActionListener(actionListener);
        jPanel.add(buttonForgeSpigot);
    }

    public static void drawButtonProxies(String buttonText, int x, int y, int width, int height, Color mainColor, ActionListener actionListener, JPanel jPanel) {
        buttonProxies.setText(buttonText);
        buttonProxies.setBounds(x, y, width, height);
        buttonProxies.setLocation(x, y);
        buttonProxies.setBackground(mainColor);
        buttonProxies.addActionListener(actionListener);
        jPanel.add(buttonProxies);
    }

    public static void drawButtonPocketEdition(String buttonText, int x, int y, int width, int height, Color mainColor, ActionListener actionListener, JPanel jPanel) {
        buttonPocketEdition.setText(buttonText);
        buttonPocketEdition.setBounds(x, y, width, height);
        buttonPocketEdition.setLocation(x, y);
        buttonPocketEdition.setBackground(mainColor);
        buttonPocketEdition.addActionListener(actionListener);
        jPanel.add(buttonPocketEdition);
    }

}
