import FigurasRegulares.Circulo;
import FigurasRegulares.Cuadrado;
import FigurasRegulares.Rectangulo;
import FigurasRegulares.Triangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creacion de objetos
        Cuadrado c = new Cuadrado();
        Rectangulo r = new Rectangulo();
        Circulo c1 = new Circulo();
        Triangulo t = new Triangulo();

        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();
        c.setLado(lado);
        c.imprimir();

        System.out.println("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();
        r.setBase(base);
        r.setAltura(altura);
        r.imprimir();

        System.out.println("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        c1.setRadio(radio);
        c1.imprimir();

        System.out.println("Ingrese la base del triangulo: ");
        double base2 = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        double altura2 = sc.nextDouble();
        System.out.println("Ingres el lado del triangulo: ");
        double lado2 = sc.nextDouble();
        t.setLado(lado2);
        t.setBase(base2);
        t.setAltura(altura2);
        t.imprimir();

        double area = c.area()+r.area()+c1.area()+t.area();

        System.out.println("\n\nLa suma de las 4 areas es: "+area);

        sc.close();
    }

}