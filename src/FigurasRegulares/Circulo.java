package FigurasRegulares;

public class Circulo {
    private double radio;
    private double pi = 3.14;
    //Constructor vacio y con parametros
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo() {

    }
    //Getters y setters
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    //Calcular area
    public double area() {
        return pi * radio * radio;
    }
    //Calcular perimetro
    public double perimetro() {
        return 2 * pi * radio;
    }
    //Metodo para imprimir
    public void imprimir(){
        System.out.println("Radio: "+ getRadio());
        System.out.println("El area del circulo es: " + area());
        System.out.println("El perimetro del circulo es: " + perimetro());
        System.out.println("------------------------------------------------");
    }
}
