public class Main {
    public static void main(String[] args){
        /*R3Vector a = new R3Vector(10, 0,0);
        a.rotateOY(90);
        a.rotateOY(90);
        a.rotateOY(90);
        a.rotateOY(90);*/
        R3Vector a = new R3Vector(0,0,0);
        R3Vector b = new R3Vector(1,0,0);
        R3Vector c = new R3Vector(1,1,0);
        R3Vector d = new R3Vector(0,1,0);
        //System.out.println(a.x+" "+a.y+" "+a.z );
        Facet face = new Facet(a,b,c,d);
        face.print();
        face.rotate(90,0,0);
        face.print();
        Cube cube = new Cube();
        CubeFrame frame = new CubeFrame(cube);
    }
}
//
