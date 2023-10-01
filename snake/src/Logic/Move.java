package Logic;

import UI.BlockPaint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Move implements ActionListener {
    private LinkedList<BlockPaint> snake;
    private Timer timer;
    private char key;
    private int length;
    private BlockPaint head;
    public Move(){
        length = 3;
        snake = new LinkedList<>();
        snake.add(new BlockPaint(620,340));
        snake.add(new BlockPaint(640,340));
        snake.add(new BlockPaint(660,340));
        head = snake.getFirst();

        key = 'a';

        timer = new Timer(100,this);
        timer.start();

    }

    public List<BlockPaint> getSnake() {
        return new LinkedList<>(snake);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int x1 ;
        int x2 = head.getX();
        int y1 ;
        int y2 = head.getY();

        if(key=='a'){
            head.setX(head.getX()-20);
        }
        else if(key =='d'){
            head.setX(head.getX()+20);
        }
        else if(key=='w'){
            head.setY(head.getY()-20);
        }
        else if (key=='s') {
            head.setY(head.getY()+20);
        }

        for(BlockPaint s : snake) {
            x1 = x2;
            y1 = y2;
            if (!snake.getFirst().equals(s)) {
                x2 = s.getX();
                s.setX(x1);
                y2 = s.getY();
                s.setY(y1);
            }
        }
    }
    public void setKey(char key){
        this.key = key;
    }
}
