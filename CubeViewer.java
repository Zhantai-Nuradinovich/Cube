import javax.swing.*;
import java.awt.*;

public class CubeViewer extends JComponent {
    private Cube cube;

    public CubeViewer(Cube cube){
        setSize(new Dimension(500, 500));
        this.cube = cube;
        setFocusable(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.translate(this.getWidth()/2, this.getHeight()/2);
        g.setColor(Color.LIGHT_GRAY);

        g.drawLine(-this.getWidth()/2, 0,
                this.getWidth()/2, 0); // ось обсцисс
        g.drawLine(0, -this.getHeight()/2,
                0, this.getHeight()/2); // ось оординат
        g.drawOval(0, 0, 2, 2); // ось аппликат

        cube.ortdraw(g2);
    }
}
