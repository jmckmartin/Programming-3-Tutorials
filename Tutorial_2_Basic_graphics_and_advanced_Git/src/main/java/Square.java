import java.awt.*;

public class Square extends Rect{

    protected int length; // Side length which will be used for both width and height

    public Square(Point initPos, Color col, int l) {
        super(initPos, col, l, l); //Passing l as both width and height
    }

}
