public class R3Vector {
    private double x, y, z;
    //
    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void plus(R3Vector b) {
        R3Vector c = new R3Vector(x + b.x, y + b.y, z + b.z);
    }
    public void minus(R3Vector b) {
        R3Vector c = new R3Vector(x - b.x, y - b.y, z - b.z);
    }
    public void multiplication(int c) {
        R3Vector d = new R3Vector(x * c, y * c, z * c);
    }
    public void skal(R3Vector b) {
        double proizv = x * b.x + y * b.y + z * b.z;
    }
    public static R3Vector vect(R3Vector a, R3Vector b) {
        return new R3Vector(a.y * b.z - a.z * b.y, a.x * b.z - a.z * b.x, a.x * b.y - a.y * b.x);
    }
    public void travel(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }
    //Поворачивает вектор относительно оси Х
    public void rotateOX(double u) {
        double unY = y;
        y = y*Math.cos(Math.toRadians(u))-z*Math.sin(Math.toRadians(u));
        z = z*Math.cos(Math.toRadians(u))+unY*Math.sin(Math.toRadians(u));
    }
    //Поворачивает вектор относительно оси У
    public void rotateOY(double u) {
        double unX = x;
        x = x*Math.cos(Math.toRadians(u))-z*Math.sin(Math.toRadians(u));
        z = z*Math.cos(Math.toRadians(u))+unX*Math.sin(Math.toRadians(u));
    }
    //Поворачивает вектор относительно оси Z
    public void rotateOZ(double u) {
        double unX = x;
        x = x*Math.cos(Math.toRadians(u))-y*Math.sin(Math.toRadians(u));
        y = unX*Math.sin(Math.toRadians(u))+y*Math.cos(Math.toRadians(u));
    }

    public void rotate(double uX, double uY, double uZ){
        this.rotateOX(uX);
        this.rotateOY(uY);
        this.rotateOZ(uZ);
    }
    public void scale(double k){
        x *= k;
        y *= k;
        z *= k;
    }

    public static R3Vector toR3Vector(R3Vector begin, R3Vector end){
        return new R3Vector(end.x - begin.x, end.y - begin.y, end.z - begin.z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}