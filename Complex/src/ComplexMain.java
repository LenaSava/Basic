public class ComplexMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Complex comp = new Complex(1, 3);
        Complex b = new Complex(4, 2);
        Complex z = new Complex(1, -2);

        z = b.mult(comp);

        System.out.println(z);
    }
}
