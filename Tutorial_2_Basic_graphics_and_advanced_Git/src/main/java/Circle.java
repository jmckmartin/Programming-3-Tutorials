import java.awt.*;

public class Circle {
    // Fields
    private int rad;
    private Point pos;
    private Color col;
    //private int unassigned;


    public Circle(Point initPos, Color col, int radius){ // The constructor
        // Initialize fields
        rad=radius;
        pos=initPos;
        this.col=col;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}
