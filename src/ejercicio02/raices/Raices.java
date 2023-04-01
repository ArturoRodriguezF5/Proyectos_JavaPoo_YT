package ejercicio02.raices;

public class Raices {

    private double a, b, c;


    public Raices() {
    }
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    private final double chiNeg = (-b - Math.sqrt((Math.pow(b, 2)-(4*a*c)))/2);
    private final double chiPos = (-b + Math.sqrt((Math.pow(b, 2)-(4*a*c)))/2);

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void obtenerRaices(double a, double b, double c) {
        System.out.println((-b - Math.sqrt((Math.pow(b, 2)-(4*a*c)))/2));
    }



}
