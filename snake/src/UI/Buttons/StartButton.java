package UI.Buttons;

import UI.GamePage;
import UI.Frame;

import javax.swing.*;
import java.awt.*;

public class StartButton extends JButton{

    public StartButton(){
            this.setPreferredSize(new Dimension(100,50));
            this.setText("Start");
            this.setFocusable(true);
            this.setVisible(true);
            this.addActionListener(actionEvent -> actionListener());
        }
    private void actionListener() {
        GamePage page = GamePage.getGamePage();
        UI.Frame frame = Frame.getFrame();
        frame.removeAll();
        frame.add(page);
        frame.refresh();
    }
}
