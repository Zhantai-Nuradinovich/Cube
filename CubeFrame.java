import javax.swing.*;
import java.awt.*;

public class CubeFrame extends JFrame {
    private Cube cube;
    public static int q = 500;
    public CubeFrame(Cube cube){
        this.cube = cube;
        this.setSize(q,q);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Я окно куба");
    }
    public void paint(Graphics g) {
        cube.draw(g);
    }
}