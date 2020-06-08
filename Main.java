import javax.swing.*;

public class Main extends JFrame {
    private Cube cube;
    private CubeController controller;
    private CubeViewer viewer;

    public Main(Cube cube){
        this.cube = cube;
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Менин атым куб");

        viewer = new CubeViewer(cube);
        controller = new CubeController(cube, viewer);
        getContentPane().add(controller);
        setVisible(true);
    }

    public static void main(String[] args){
        Cube cube = new Cube();
        cube.travel(-0.5, -0.5, -0.5);
        cube.scale(100);
        //cube.rotate(95, 0, 0);
        Main frame = new Main(cube);
    }
}
