package FigurasRegulares;

public class Triangulo {
    private double base;
    private double altura;
    private double lado;
    //Constructor vacío y con parametros
    public Triangulo(int base, int altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    public Triangulo() {

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
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    //Calcular area
    public double area(){
        return (base*altura)/2;
    }
    //Calcular perimetro
    public double perimetro(){
        return lado + lado + lado;
    }
    //Metodo la imprimir
    public void imprimir(){
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
        System.out.println("Lado: " + getLado());
        System.out.println("El area del triangulo es: " + area());
        System.out.println("El perimetro del triangulo es: " + perimetro());
        System.out.println("------------------------------------------------");
    }
}
