package net.arsenalnetwork.frame;

import net.arsenalnetwork.draw.DrawButton;
import net.arsenalnetwork.draw.DrawUtils;
import net.arsenalnetwork.utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JPanel {

    private boolean clickedVanilla = false;
    private boolean clickedForge = false;
    private boolean clickedForgeSpigot = false;
    private boolean clickedProxies = false;
    private boolean clickedPocketEdition = false;

    private int buttonWidth = 200;

    public MainFrame() {
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        DrawButton.drawButtonVanilla("Vanilla", (Constants.displayWidth / 2) - (buttonWidth / 2) - 440, 10, buttonWidth, 50, Color.WHITE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicked vanilla button.");
                clickedVanilla = true;
            }
        }, this);

        DrawButton.drawButtonForge("Forge", (Constants.displayWidth / 2) - (buttonWidth / 2) - 220, 10, buttonWidth, 50, Color.WHITE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicked forge button.");
                clickedForge = true;
            }
        }, this);

        DrawButton.drawButtonForgeSpigot("Forge & Spigot", (Constants.displayWidth / 2) - (buttonWidth / 2), 10, buttonWidth, 50, Color.WHITE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicked forge & spigot button.");
                clickedForgeSpigot = true;
            }
        }, this);

        DrawButton.drawButtonProxies("Proxies", (Constants.displayWidth / 2) - (buttonWidth / 2) + 220, 10, buttonWidth, 50, Color.WHITE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicked proxies button.");
                clickedProxies = true;
            }
        }, this);

        DrawButton.drawButtonPocketEdition("Pocket Edition", (Constants.displayWidth / 2) - (buttonWidth / 2) + 440, 10, buttonWidth, 50, Color.WHITE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicked pocket edition button.");
                clickedPocketEdition = true;
            }
        }, this);

        DrawUtils.drawRectangle(0, 0, Constants.displayWidth, 70, Color.RED, g);
        DrawUtils.drawText("Please click a server software button.", Constants.displayWidth / 2 - 218, 100, 30, Color.WHITE, g);

    }

}
