import java.awt.*;

public class Cube {
    private Facet[] facets;
    public Cube(){
        facets = new Facet[6];
        //нижняя грань ХоУ
        facets[0] = new Facet(new R3Vector(0,0,0),
                              new R3Vector(0,1,0),
                              new R3Vector(1,1,0),
                              new R3Vector(1,0,0), Color.PINK);

        //грань верхняя ХоУ
        facets[1] = new Facet(new R3Vector(0,0,1),
                              new R3Vector(1,0,1),
                              new R3Vector(1,1,1),
                              new R3Vector(0,1,1), Color.DARK_GRAY);

        //грань верхняя ХоЗ
        facets[2] = new Facet(new R3Vector(0,1,0),
                              new R3Vector(0,1,1),
                              new R3Vector(1,1,1),
                              new R3Vector(1,1,0), Color.BLUE);

        //грань нижняя ХоЗ
        facets[3] = new Facet(new R3Vector(0,0,0),
                              new R3Vector(1,0,0),
                              new R3Vector(1,0,1),
                              new R3Vector(0,0,1), Color.YELLOW);

        //грань нижняя УоЗ
        facets[4] = new Facet(new R3Vector(0,1,0),
                              new R3Vector(0,0,0),
                              new R3Vector(0,0,1),
                              new R3Vector(0,1,1), Color.GREEN);

        //грань верхняя УоЗ
        facets[5] = new Facet(new R3Vector(1,1,0),
                              new R3Vector(1,1,1),
                              new R3Vector(1,0,1),
                              new R3Vector(1,0,0), Color.RED);
    }
    public void rotate(double x,double y,double z){
        for(int i = 0; i< facets.length; i++){
            facets[i].rotate(x,y,z);
        }
    }
    public void travel(double x,double y,double z){
        for(int i = 0; i< facets.length; i++){
            facets[i].travel(x,y,z);
        }
    }
    public void ortdraw(Graphics2D g){
        for(int i = 0; i< facets.length; i++){
            facets[i].ortdraw(g);
        }
    }
    public void scale(double k) {
        for(int i = 0; i< facets.length; i++){
            facets[i].scale(k);
        }
    }
}
