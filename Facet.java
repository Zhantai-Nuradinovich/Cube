import java.awt.*;

public class Facet {
    protected static int i = 0;
    public R3Vector[] vertex = new R3Vector[4];
    //Color color;
    public Facet(R3Vector a, R3Vector b, R3Vector c, R3Vector d){
        vertex[0] = a;
        vertex[1] = b;
        vertex[2] = c;
        vertex[3] = d;
    }
    // выводит против часовой стрелки
    public void print(){
        System.out.print("("+vertex[0].x+", "+vertex[0].y+", "+vertex[0].z+") - ");
        System.out.println("("+vertex[1].x+", "+vertex[1].y+", "+vertex[1].z+")");
        System.out.print("("+vertex[1].x+", "+vertex[1].y+", "+vertex[1].z+") - ");
        System.out.println("("+vertex[2].x+", "+vertex[2].y+", "+vertex[2].z+")");
        System.out.print("("+vertex[2].x+", "+vertex[2].y+", "+vertex[2].z+") - ");
        System.out.println("("+vertex[3].x+", "+vertex[3].y+", "+vertex[3].z+")");
        System.out.print("("+vertex[3].x+", "+vertex[3].y+", "+vertex[3].z+") - ");
        System.out.println("("+vertex[0].x+", "+vertex[0].y+", "+vertex[0].z+")");
        System.out.println(" ");
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
    public double getModule(int i){
        return Math.sqrt(Math.pow(vertex[i].x, 2)+Math.pow(vertex[i].y, 2)+Math.pow(vertex[i].z, 2));
    }
    public void draw(Graphics g){
        g.setColor(Color.PINK);
        //ХоУ нижняя и верхняя
        if(i == 0 || i == 3){
        g.drawLine((int)  (vertex[0].x), (int)  (vertex[0].y), (int)  (vertex[1].x),(int)  (vertex[1].y));
        g.drawLine((int)  (vertex[1].x), (int)  (vertex[1].y), (int)  (vertex[2].x),(int)  (vertex[2].y));
        g.drawLine((int)  (vertex[2].x), (int)  (vertex[2].y), (int)  (vertex[3].x),(int)  (vertex[3].y));
        g.drawLine((int)  (vertex[3].x), (int)  (vertex[3].y), (int)  (vertex[0].x),(int)  (vertex[0].y));
        i= i+1;
        }
        //ХоЗ нижняя и верхняя
        else if(i == 1 || i == 4){
            g.drawLine((int)  (vertex[0].x), (int)  (vertex[0].z), (int)  (vertex[1].x),(int)  (vertex[1].z));
            g.drawLine((int)  (vertex[1].x), (int)  (vertex[1].z), (int)  (vertex[2].x),(int)  (vertex[2].z));
            g.drawLine((int)  (vertex[2].x), (int)  (vertex[2].z), (int)  (vertex[3].x),(int)  (vertex[3].z));
            g.drawLine((int)  (vertex[3].x), (int)  (vertex[3].z), (int)  (vertex[0].x),(int)  (vertex[0].z));
            i= i+1;
        }
        //УоЗ нижняя и верхняя
        else if(i == 2 || i == 5){
            g.drawLine((int)  (vertex[0].y), (int)  (vertex[0].z), (int)  (vertex[1].y),(int)  (vertex[1].z));
            g.drawLine((int)  (vertex[1].y), (int)  (vertex[1].z), (int)  (vertex[2].y),(int)  (vertex[2].z));
            g.drawLine((int)  (vertex[2].y), (int)  (vertex[2].z), (int)  (vertex[3].y),(int)  (vertex[3].z));
            g.drawLine((int)  (vertex[3].y), (int)  (vertex[3].z), (int)  (vertex[0].y),(int)  (vertex[0].z));
            i= i+1;
        }
    }
    public void scale(double k) {
        vertex[0].scale(k);
        vertex[1].scale(k);
        vertex[2].scale(k);
        vertex[3].scale(k);
    }
}