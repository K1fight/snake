package UI.Buttons;

import javax.swing.*;
import java.awt.*;

public class StartButton extends JButton{

    public StartButton(){
            this.setPreferredSize(new Dimension(100,50));
            this.setText("Start");
            this.setFocusable(true);
            this.setVisible(true);
        }
}
