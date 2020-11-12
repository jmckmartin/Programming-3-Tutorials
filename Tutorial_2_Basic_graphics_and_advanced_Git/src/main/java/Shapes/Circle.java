package Shapes;

import java.awt.*;

public class Circle extends Shape {
    // Fields
    protected int rad;


    public Circle(Point initPos, Color col, int radius){
        super(initPos, col); // The constructor
        // Initialize fields
        rad=radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}
