package FigurasRegulares;

public class Cuadrado {
    private double lado;
    //constructor con parametros y vacio
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    public Cuadrado() {

    }
    //Setters y getters
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    //Metodo para calcular el area
    public double area(){
        return lado*lado;
    }
    //Metodo para calcular el perimetro
    public double perimetro(){
        return 4*lado;
    }
     //Metodo para imprimir
    public void imprimir () {
        System.out.println("Lado: " + getLado());
        System.out.println("El area del Cuadrado es: " + area());
        System.out.println("El perimetro del Cuadrado es: " + perimetro());
        System.out.println("------------------------------------------------");
    }
}
