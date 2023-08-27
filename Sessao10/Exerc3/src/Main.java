import entities.Pessoas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        Pessoas pessoas[] = new Pessoas[sc.nextInt()];

        for (int i = 0; i< pessoas.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:" );
            System.out.println("Nome: ");
            String nm = sc.next();
            System.out.println("Idade :");
            int id = sc.nextInt();
            System.out.println("Altura: ");
            double alt = sc.nextDouble();
            pessoas[i] = new Pessoas(nm,id,alt);
        }
        double somaAltura = 0;
        for (int i = 0; i< pessoas.length; i++) {
            somaAltura += pessoas[i].getAltura();
        }
        System.out.printf("Altura media: %.2f%n", (somaAltura / pessoas.length));
        double menores = 0;
        for (int i = 0; i< pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                menores++;
            }
        }
        System.out.printf("Pessoas com menos de 16 anos: " + (menores / pessoas.length * 100) + "%");
        System.out.println();
        for (int i = 0; i< pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getName());
            }
        }
    }
}