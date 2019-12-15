import java.awt.*;

public class Cube {
    private Facet[] facets;
    public Cube(){
        facets = new Facet[6];
        //нижняя грань ХоУ
        //facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), // те, что сверху являются гранями против часовой
                //new R3Vector(1,1,0), new R3Vector(0,1,0));
        facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0),
                new R3Vector(1,1,0), new R3Vector(1,0,0));
        //грань верхняя ХоЗ
        //facets[1] = new Facet(new R3Vector(0,1,0), new R3Vector(0,1,1),
            //    new R3Vector(1,1,1), new R3Vector(1,1,0));
        facets[1] = new Facet(new R3Vector(1,1,0), new R3Vector(0,1,0),
                new R3Vector(0,1,1), new R3Vector(1,1,1));
        //грань верхняя УоЗ
        //facets[2] = new Facet(new R3Vector(1,0,0), new R3Vector(1,0,1),
              //  new R3Vector(1,1,1), new R3Vector(1,1,0));
        facets[2] = new Facet(new R3Vector(1,0,0), new R3Vector(1,1,0),
                new R3Vector(1,1,1), new R3Vector(1,0,1));
        //грань верхняя ХоУ
        //facets[3] = new Facet(new R3Vector(0,0,1), new R3Vector(0,1,1),
              //  new R3Vector(1,1,1), new R3Vector(1,0,1));
        facets[3] = new Facet(new R3Vector(0,0,1), new R3Vector(1,0,1),
                new R3Vector(1,1,1), new R3Vector(0,1,1));
        //грань нижняя ХоЗ
        //facets[4] = new Facet(new R3Vector(0,0,1), new R3Vector(0,0,0),
               // new R3Vector(1,0,0), new R3Vector(1,0,1));
        facets[4] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0),
                new R3Vector(1,0,1), new R3Vector(0,0,1));
        //грань нижняя УоЗ
        //facets[5] = new Facet(new R3Vector(0,0,1), new R3Vector(0,0,0),
               // new R3Vector(0,1,1), new R3Vector(0,1,0));
        facets[5] = new Facet(new R3Vector(0,1,0), new R3Vector(0,0,0),
                new R3Vector(0,0,1), new R3Vector(0,1,1));
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
    public void draw(Graphics g){
        for(int i = 0; i< facets.length; i++){
            facets[i].draw(g);
        }
    }
    public void scale(double k) {
        for(int i = 0; i< facets.length; i++){
            facets[i].scale(k);
        }
    }
}
