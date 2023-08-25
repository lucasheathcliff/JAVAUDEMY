import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int inteiros[] = new int[n];
        System.out.println("teste");
        for(int i=0; i<inteiros.length; i++) {
            System.out.println("Digite um numero: ");
            int x = sc.nextInt();
            inteiros[i] = x;
        }
        System.out.println("Numeros negativos: ");
        for (int i=0;i< inteiros.length; i++) {
        if (inteiros[i] <= 0) {
            System.out.println(inteiros[i]);
        }
        }
    }
}