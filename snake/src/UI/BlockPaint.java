package UI;

import java.awt.*;

public class BlockPaint {
    private int x,y;
    private static final int SIZE = 20;
    public BlockPaint(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x,y,SIZE,SIZE);
    }
}
