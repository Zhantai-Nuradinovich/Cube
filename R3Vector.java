public class R3Vector {
    public double x, y, z;
    //
    public R3Vector(double x, double y, double z) {
        System.out.println("Я вектор ");
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void plus(R3Vector b) {
        R3Vector c = new R3Vector(x + b.x, y + b.y, z + b.z);
        System.out.println("a(" + c.x + ", " + c.y + ", " + c.z + ")");
    }
    public void minus(R3Vector b) {
        R3Vector c = new R3Vector(x - b.x, y - b.y, z - b.z);
        System.out.println("a(" + c.x + ", " + c.y + ", " + c.z + ")");
    }
    public void multiplication(int c) {
        R3Vector d = new R3Vector(x * c, y * c, z * c);
        System.out.println("a(" + d.x + ", " + d.y + ", " + d.z + ")");
    }
    public void skal(R3Vector b) {
        double proizv = x * b.x + y * b.y + z * b.z;
        System.out.println("Результат скалярного произведения = " + proizv);
    }
    public void vect(R3Vector b) {
        R3Vector с = new R3Vector(y * b.z - z * b.y, x * b.z - z * b.x, x * b.y - y * b.x);
        System.out.println("с(" + с.x + ", " + с.y + ", " + с.z + ")");
    }
    public void travel(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }
    //Поворачивает вектор относительно оси Х
    public void rotateOX(double u) {
        double unY = y;
        y = y*Math.cos(Math.toRadians(u))+z*Math.sin(Math.toRadians(u));
        z = -(unY*Math.sin(Math.toRadians(u))+z*Math.cos(Math.toRadians(u)));
    }
    //Поворачивает вектор относительно оси У
    public void rotateOY(double u) {
        double unX = x;
        x = x*Math.cos(Math.toRadians(u))+z*Math.sin(Math.toRadians(u));
        z = -(unX*Math.sin(Math.toRadians(u))+z*Math.cos(Math.toRadians(u)));
    }
    //Поворачивает вектор относительно оси Z
    public void rotateOZ(double u) {
        double unX = x;
        x = x*Math.cos(Math.toRadians(u))-y*Math.sin(Math.toRadians(u));
        y = -(unX*Math.sin(Math.toRadians(u))+y*Math.cos(Math.toRadians(u)));
    }
    public void rotate(double uX, double uY, double uZ){
        rotateOX(uX);
        rotateOY(uY);
        rotateOZ(uZ);
    }
}