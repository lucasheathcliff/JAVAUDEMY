import entities.conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        conta c = new conta();
        Scanner sc = new Scanner((System.in));
        System.out.printf("Digite o número da conta: ");
        c.setNumero(sc.nextInt());
        System.out.println("Digite o nome do segurado: ");
        String seg = sc.next();
        c.setSegurado(seg);
        System.out.printf("Haverá deposito inicial (s/n)? ");
        String inicial = sc.next();
        if (inicial.equals("s")) {
            System.out.println("Qual o valor do depósito inicial?");
            c.deposito(sc.nextDouble());
        }
        System.out.println("Dados da conta: "+ c);
        System.out.println("Digite o valor a depositar: ");
        c.deposito(sc.nextDouble());
        System.out.println("Dados atualizados da conta: "+ c);
        System.out.println("Digite o valor a sacar ");
        c.saque(sc.nextDouble());
        System.out.println("Dados atualizados da conta: "+ c);
        sc.close();
    }
}