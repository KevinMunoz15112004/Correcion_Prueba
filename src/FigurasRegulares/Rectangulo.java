package FigurasRegulares;

public class Rectangulo {
    private double base;
    private double altura;
    //Constructor vacio y con parametros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo() {

    }
    //Getters y setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Metodo para calcular el area
    public double area() {
        return base*altura;
    }
    //Metodo para calcular el perimetro
    public double perimetro() {
        return (2*base)+(2*altura);
    }
    //Metodo para imprimir
    public void imprimir(){
        System.out.println("Base: " +getBase());
        System.out.println("Altura: " + getAltura());
        System.out.println("El area del rectangulo es: " + area());
        System.out.println("El perimetros del rectangulo es: " + perimetro());
        System.out.println("------------------------------------------------");
    }
}
