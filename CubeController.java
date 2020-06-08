import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class CubeController extends JPanel {
    private Cube cube;
    private JScrollBar barX;
    private JScrollBar barY;
    private JScrollBar scale;
    private CubeViewer viewer;
    private int checkerX;
    private int checkerY;
    private int checkerScale;

    public CubeController(Cube cube, CubeViewer viewer){
        setSize(new Dimension(600, 600));
        setLayout(new BorderLayout());

        barX = new JScrollBar(JScrollBar.HORIZONTAL, 0, 30, -180, 180);
        checkerX = barX.getValue();

        barY = new JScrollBar(JScrollBar.VERTICAL, 0, 30, -180, 180);
        checkerY = barY.getValue();

        scale = new JScrollBar(JScrollBar.VERTICAL, 0, 30, -100, 100);

        JLabel xLabel = new JLabel("Rotate Right/Left");
        JLabel yLabel = new JLabel("Rotate Up/Down");
        JLabel scaleLabel = new JLabel("Scale Cube");
        xLabel.setBounds(300, 510, 110, 20);
        yLabel.setBounds(470, 20, 110, 20);
        scaleLabel.setBounds(20, 20, 80, 20);
        add(xLabel);
        add(yLabel);
        add(scaleLabel);

        this.cube = cube;
        this.viewer = viewer;
        add(viewer);
        decorations();
        setFocusable(true);
    }


    public void decorations(){
        barY.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if(e.getValue()> checkerY){
                    cube.rotate(1, 0, 0);
                }
                else cube.rotate(-1, 0, 0);
                checkerY = e.getValue();
                viewer.repaint();
            }
        });

        barX.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if(e.getValue()> checkerX){
                    cube.rotate(0, -1, 0);
                }
                else {
                    cube.rotate(0, 1, 0);
                }
                checkerX = e.getValue();
                viewer.repaint();
            }
        });

        scale.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if(e.getValue() < checkerScale){
                    cube.scale(1.02);
                }
                else {
                    cube.scale(0.98);
                }
                checkerScale = e.getValue();
                viewer.repaint();
            }
        });

        add(barX, BorderLayout.SOUTH);
        add(barY, BorderLayout.EAST);
        add(scale, BorderLayout.WEST);
    }
}