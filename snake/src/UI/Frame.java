package UI;

import UI.Buttons.StartButton;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Frame {
    private static Frame frame;
    public static Frame getFrame(){
        if(frame==null){
            frame = new Frame();
        }
        return frame;
    }
    JFrame mainFrame;
    JPanel mainPage,Game;
    StartButton button1;
    JLabel background;
    private Frame(){

        mainFrame = new JFrame("Snake");
        mainFrame.setPreferredSize(new Dimension(1280,750));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);


        mainPageConfiguration();



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
    private void buttons() {
        button1 = new StartButton();
        background.add(button1);
    }
    public void removeAll(){
        mainFrame.getContentPane().removeAll();
    }
    public void add(Component c){
        mainFrame.getContentPane().add(c);
    }
    public void refresh(){
        mainFrame.revalidate();
        mainFrame.repaint();
    }


}
