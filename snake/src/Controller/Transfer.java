package Controller;

import Logic.Move;
import UI.BlockPaint;

import java.util.List;

public class Transfer {
    Move move;
    public Transfer(){
        move = new Move();
    }
    public List<BlockPaint> getSnake(){
        return move.getSnake();
    }
    public void setKey(char key){
        move.setKey(key);
    }
}
