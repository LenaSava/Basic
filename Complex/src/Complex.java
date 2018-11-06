class Complex implements Cloneable {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public boolean equals(Complex other) {
        return real == other.real && imaginary == other.imaginary;
    }
    public boolean noEquals (Complex other) {
        return real != other.real && imaginary != other.imaginary;
    }
    public void inc(Complex other) {
        real += other.real;
        imaginary += other.imaginary;
    }
    public void dec(Complex other) {
        real -= other.real;
        imaginary -= other.imaginary;
    }

    public Complex sum(Complex other) {
        Complex sum = new Complex( this.real, this.imaginary);
        sum.inc(other);
        return sum;
    }
    public Complex sub(Complex other) {
        Complex sub = new Complex( this.real, this.imaginary);
        sub.dec(other);
        return sub;
    }

    public Complex mult(Complex other) {
        Complex mult = new Complex(imaginary, real);

        mult.real = ( real * other.real ) - ( imaginary * other.imaginary);
        mult.imaginary = ( real * other.imaginary ) - ( imaginary * other.real);
        return mult;
    }

    public String toString() {
        if ( getImaginary() < 0 ) {
            return fmt(getReal()) + fmt(getImaginary()) + "i";
        }else {
            return fmt(getReal()) + "+" + fmt(getImaginary()) + "i";
        }

    }
    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
}
