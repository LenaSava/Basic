public class Vector implements Cloneable  {
    private double x;
    private double y;

    public Vector clone() throws CloneNotSupportedException {
        return (Vector) super.clone();
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double len(){
        return Math.hypot(x, y);
    }

    public boolean equals(Vector other) {
        return x == other.x && y == other.y;
    }
    public boolean noEquals(Vector other) {
        return x != other.x && y != other.y;
    }
    public void inc(Vector other) {
        x += other.x;
        y += other.y;

    }
    public void dec(Vector other) {
        x -= other.x;
        y -= other.y;

    }
    public Vector sum(Vector other) {
        Vector sum = new Vector( this.x, this.y);
        sum.inc(other);
        return sum;
    }
    public Vector sub(Vector other) {
        Vector sub = new Vector( this.x , this.y);

        sub.dec(other);
        return sub;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
};

