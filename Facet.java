import java.awt.*;
import java.awt.geom.Path2D;

public class Facet {
    public R3Vector[] vertex = new R3Vector[4];
    private Color color;
    //Color color;
    public Facet(R3Vector a, R3Vector b, R3Vector c, R3Vector d, Color color){
        vertex[0] = a;
        vertex[1] = b;
        vertex[2] = c;
        vertex[3] = d;
        this.color = color;
    }

    public void rotate(double uX, double uY, double uZ){
        for(int i = 0;i<vertex.length;i++){
            vertex[i].rotate(uX, uY, uZ);
        }
    }
    public void travel(double x, double y, double z){
        for(int i = 0;i<vertex.length;i++){
            vertex[i].travel(x, y, z);
        }
    }
    public void scale(double k) {
        vertex[0].scale(k);
        vertex[1].scale(k);
        vertex[2].scale(k);
        vertex[3].scale(k);
    }
    public void ortdraw(Graphics2D g){

        if(R3Vector.vect(R3Vector.toR3Vector(vertex[0], vertex[1]),
                         R3Vector.toR3Vector(vertex[1], vertex[2])).getZ() > 0){
            Path2D p = new Path2D.Double();
            p.moveTo(vertex[0].getX(), -vertex[0].getY());
            p.lineTo(vertex[1].getX(), -vertex[1].getY());
            p.lineTo(vertex[2].getX(), -vertex[2].getY());
            p.lineTo(vertex[3].getX(), -vertex[3].getY());
            p.lineTo(vertex[0].getX(), -vertex[0].getY());
            p.closePath();

            g.setColor(color);
            g.fill(p);
            g.setColor(Color.BLACK);
            g.draw(p);
        }
    }
}