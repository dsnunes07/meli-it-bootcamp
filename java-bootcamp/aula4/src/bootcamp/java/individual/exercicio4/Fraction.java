package bootcamp.java.individual.exercicio4;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add (Fraction f) {
        int commonDenominator = f.getDenominator() * this.denominator;
        int a = (commonDenominator / f.getDenominator()) * f.getNumerator();
        int b = (commonDenominator / this.denominator) * this.numerator;
        Fraction result = new Fraction(a + b, commonDenominator);
        return result;
    }

    public Fraction add (int i) {
        Fraction f = new Fraction(i, 1);
        return add(f);
    }

    public Fraction minus (Fraction f) {
        return add(f.multiply(-1));
    }

    public Fraction minus (int i) {
        Fraction f = new Fraction(i, 1);
        return minus(f);
    }

    public Fraction multiply(Fraction f) {
        int numerator = f.getNumerator() * this.numerator;
        int denominator = f.getDenominator() * this.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction multiply(int i) {
        Fraction f = new Fraction(i, 1);
        return multiply(f);
    }

    public Fraction divide(Fraction f) {
        int numerator = this.numerator * f.getDenominator();
        int denominator = this.denominator * f.getNumerator();
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(int i) {
        Fraction f = new Fraction(i, 1);
        return divide(f);
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
