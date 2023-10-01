package UI;

import Controller.Transfer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePage extends JPanel {
    private static GamePage page;
    public static GamePage getGamePage(){
        if(page==null){
            page = new GamePage();
        }
        return page;
    }
    Transfer transfer;
    InputMap input;
    ActionMap action;
    private GamePage(){
        transfer = new Transfer();
        performKeyBindings(this);



    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
            for(BlockPaint s : transfer.getSnake()){
                s.draw(g);
            }
            repaint();
    }

    private void drawGrid(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int gridSize = 20;
        int numRows = 720/gridSize;
        int numCols = 1280/gridSize;
        g2d.setColor(Color.lightGray);
        //draw lines of row
        for(int i = 0;i<numRows+1;i++){
            int y = i * gridSize;
            g2d.drawLine(0,y,1280,y);
        }
        //draw lines of columns
        for(int i = 0; i < numCols+1;i++){
            int x = i * gridSize;
            g2d.drawLine(x,0,x,720);
        }
    }
    private void performKeyBindings(JPanel panel){
        input = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        action = panel.getActionMap();
        KeyStroke right = KeyStroke.getKeyStroke("pressed D");
        KeyStroke left = KeyStroke.getKeyStroke("pressed A");
        KeyStroke up = KeyStroke.getKeyStroke("pressed W");
        KeyStroke down = KeyStroke.getKeyStroke("pressed S");
        input.put(right,"right");
        input.put(left,"left");
        input.put(up,"up");
        input.put(down,"down");
        action.put("right", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                transfer.setKey('d');
            }
        });
        action.put("left", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                transfer.setKey('a');
            }
        });
        action.put("up", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                transfer.setKey('w');
            }
        });
        action.put("down", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                transfer.setKey('s');
            }
        });


    }
}
