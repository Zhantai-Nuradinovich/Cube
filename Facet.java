public class Facet {
    private R3Vector[] vertex = new R3Vector[4];
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
}
