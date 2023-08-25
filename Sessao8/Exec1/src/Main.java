import entities.Retangulo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Retangulo ret =  new Retangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a altura e a largura do Retangulo:");
        ret.setAltura(sc.nextDouble());
        ret.setLargura(sc.nextDouble());
        System.out.println("AREA: " + ret.area());
        System.out.println("PERIMETRO " + ret.perimetro());
        System.out.println("DIAGONAL: " + ret.diagonal());
    }
}