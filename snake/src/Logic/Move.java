package Logic;

import UI.BlockPaint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;


public class Move implements ActionListener {
    private List<BlockPaint> snake;
    private Timer timer;
    private char key;
    public Move(){
        snake = new LinkedList<>();
        snake.add(new BlockPaint(620,340));
        snake.add(new BlockPaint(640,340));
        snake.add(new BlockPaint(660,340));

        key = 'a';

        timer = new Timer(500,this);
        timer.start();

    }

    public List<BlockPaint> getSnake() {
        return new LinkedList<>(snake);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(key=='a'){
            for(BlockPaint s : snake){
                s.setX(s.getX()-20);
            }
        }
        else if(key =='d'){
            for(BlockPaint s : snake){
                s.setX(s.getX()+20);
            }
        }
        else if(key=='w'){
            for(BlockPaint s : snake){
                s.setY(s.getY()-20);
            }
        }
        else if (key=='s') {
            for(BlockPaint s : snake){
                s.setY(s.getY()+20);
            }
        }
    }
    public void setKey(char key){
        this.key = key;
    }
}
