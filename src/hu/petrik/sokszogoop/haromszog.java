package hu.petrik.sokszogoop;

public class haromszog extends Sokszog {
    private double b;
    private double c;

    public haromszog() {
        super(getVeletlenOldal());
        this.b= getVeletlenOldal();
        this.c= getVeletlenOldal();
        while (!isSzerkesztheto()){
            super.setA(getVeletlenOldal());
            this.b=getVeletlenOldal();
            this.c=getVeletlenOldal();
        }
    }

    private static double getVeletlenOldal() {
        return Math.random() * 10 + 5;
    }

    public haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem  szerkeszthető");
        }
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem  szerkeszthető");
        }
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem  szerkeszthető");
        }
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem  szerkeszthető");
        }
    }

    private boolean isSzerkesztheto() {
        boolean szerkesztheto = true;
        if ((this.getA() + this.getB()) <= this.getC() || (this.getA() + this.getC()) <= this.getB() || (this.getB() + this.getC()) <= this.getA())
            szerkesztheto = false;
        {
        }
        return szerkesztheto;
    }

    public double getKerulet() {
        return this.getA() + this.getB() + this.getC();
    }

    public double getTerulet() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.getB()) * (this.getS() - this.getC()));
    }

    private double getS() {
        return getKerulet() / 2;
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f - b =  %f - c= %f - K = %f - T = %f", this.getA(), this.getB(), this.getC(), this.getKerulet(), this.getTerulet());
    }
}
