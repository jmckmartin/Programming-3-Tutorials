import java.awt.*;

public class Rect {
    // Fields
    private int width;
    private int height;
    private Point pos;
    private Color col;
    //private int unassigned;


    public Rect(Point initPos, Color col, int w, int h){ // The constructor
        // Initialize fields
        width=w;
        height=h;
        pos=initPos;
        this.col=col;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x, pos.y,width,height);
    }
}