package UI;

import UI.Buttons.StartButton;
import javax.swing.*;
import java.awt.*;

public class Frame {
    JFrame mainFrame;
    JPanel mainPage,Game;
    StartButton button1;
    JLabel background;
    public Frame(){

        mainFrame = new JFrame("Snake");
        mainFrame.setPreferredSize(new Dimension(1280,720));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        game();



        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    public void mainPageConfiguration(){
        mainPage = new JPanel();
        mainPage.setLayout(new FlowLayout());
        mainPage.setPreferredSize(new Dimension(1280,720));

        background = new JLabel(new ImageIcon("snake/src/UI/backgroundImage.jpg"));
        background.setLayout(new FlowLayout());
        mainPage.add(background);
        mainPage.setVisible(true);
        mainFrame.add(mainPage);
        buttons();
    }
    private void buttons(){
       button1 = new StartButton();
       background.add(button1);

    }
    private void game(){
        Game = new GamePage();
    }


}
