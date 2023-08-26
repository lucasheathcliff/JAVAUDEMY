import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] inteiro = new double[n];

        for (int i=0 ; i < inteiro.length; i++) {
            System.out.println("Digite um numero: ");
            inteiro[i] = sc.nextDouble();
        }
        System.out.print("VALORES: ");
            for (int i= 0; i< inteiro.length; i++) {
                System.out.printf(inteiro[i] + ", ");
            }
        System.out.println();
        double soma = 0;
        for (int i= 0; i< inteiro.length; i++) {
            soma  += inteiro[i];
        }
        System.out.println("SOMA: " + soma);
        double media =  soma / inteiro.length;
        System.out.println("MEDIA: "+ media);
    }
}