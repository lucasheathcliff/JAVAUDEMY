import entities.Alugueis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alugueis al[] = new Alugueis[10];
        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println(i+1 + "o aluguel:");
            System.out.printf("Nome: ");
            String name = sc.next();
            System.out.println();
            System.out.printf("Email: ");
            String email = sc.next();
            System.out.printf("Quarto: ");
            int q = sc.nextInt();
            al[q] = new Alugueis(name, email);
        }
        System.out.println("Quartos ocupados: ");
        for (int j = 0; j<al.length; j++) {
            if (al[j] != null) {
                System.out.println();
            System.out.printf(j + ": " + al[j]);
        }

    }
}}