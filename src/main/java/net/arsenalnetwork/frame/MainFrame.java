package net.arsenalnetwork.frame;

import net.arsenalnetwork.draw.DrawButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JPanel {

    private boolean clickedVanilla = false;
    private boolean clickedForge = false;
    private boolean clickedProxies = false;
    private boolean clickedPocketEdition = false;

    public MainFrame() {
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        DrawButton.drawButtonVanilla("Vanilla", 10, 10, 200, 50, Color.WHITE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }, this);

        DrawButton.drawButtonForge("Forge", 220, 10, 200, 50, Color.WHITE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }, this);

    }

}
