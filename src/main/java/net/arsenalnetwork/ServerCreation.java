package net.arsenalnetwork;

import net.arsenalnetwork.frame.MainFrame;
import net.arsenalnetwork.utilities.Constants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class ServerCreation {

    public static JFrame frm = new JFrame();

    public static void main(String[] args) {
        mainGUI();
    }

    private static void mainGUI() {
        MainFrame mainPingPongGUI = new MainFrame();
        frm.setTitle(Constants.PROGRAM_NAME + " - " + Constants.PROGRAM_VERSION);
        frm.setContentPane(mainPingPongGUI);
        frm.setSize(Constants.displayWidth, Constants.displayHeight);
        frm.setResizable(false);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);

        // Sets the Icon from the resources
        URL res = Constants.class.getClassLoader().getResource("icon.png");
        File file = null;
        try {
            file = Paths.get(res.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String absolutePath = file.getAbsolutePath();
        BufferedImage myImg = null;
        try {
            myImg = ImageIO.read(new File(absolutePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frm.setIconImage(myImg);
    }

}
