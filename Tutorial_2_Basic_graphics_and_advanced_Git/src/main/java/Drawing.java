import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;
    private Circle Cir;
    private Rect Rec;
    private Square Squ;

    public Drawing(){
        setupFrame();
        setupCanvas();

    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    private void setupFrame() {
        Point p=new Point(200,200);
        Color c=new Color(0x992266);
        Cir = new Circle(p,c,25);
        Rec = new Rect(p,c,120,5);
        Squ = new Square(p,c,100);
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,  400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        Cir.draw(g);
        Rec.draw(g);
        Squ.draw(g);
    }
}
