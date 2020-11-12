package Shapes;

import java.awt.*;

public class Rect extends Shape {
    // Fields
    protected int width;
    protected int height;


    public Rect(Point initPos, Color col, int w, int h){ // The constructor
        super(initPos, col);
        // Initialize fields
        width=w;
        height=h;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x, pos.y,width,height);
    }
}