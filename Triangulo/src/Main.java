import java.util.Scanner;
import entities.triangulo;
public class Main {
    public static void main(String[] args) {

        Scanner sc  =  new Scanner(System.in);
        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Lados do triangulo X?");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Lados do triangulo Y?");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.areat();
        System.out.println("A area do triangulo X é: " + areaX);

        double areaY = y.areat();
        System.out.println("A area do triangulo Y é: " + areaY);
    }
}