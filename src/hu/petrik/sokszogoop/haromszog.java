package hu.petrik.sokszogoop;

public class haromszog extends Sokszog{
    private double b;
    private double c;

    public haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    private boolean isSzerkesztheto(){
        boolean szerkesztheto=true;
        if((this.getA()+this.getB())<=this.getC() || (this.getA()+this.getC())<=this.getB() || (this.getB()+this.getC())<=this.getA())szerkesztheto=false; {
        }
        return szerkesztheto;
    }
    public double getKerulet(){
        return this.getA()+this.getB()+this.getC();
    }
    public double getTerulet(){
        return Math.sqrt(this.getS()*(this.getS()-this.getA())*(this.getS()-this.getB())*(this.getS()-this.getC()));
    }
    private double getS(){
        return getKerulet()/2;
    }

    @Override
    public String toString() {
        return "";
    }
}
