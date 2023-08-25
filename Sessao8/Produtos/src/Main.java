import produto.Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produto p = new Produto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados do Produto:");
        System.out.println("Nome:");
        p.nome  = sc.nextLine();
        System.out.println("Preço:");
        p.preco = sc.nextDouble();
        System.out.println("Quantidade em estoque:");
        p.quantidade = sc.nextInt();
        System.out.println("Dados do Produto: " +  p.nome + ", R$ " +  p.preco + ", " + p.quantidade + " unidades, Total: R$ " + p.vlrTotalEstoque());
        System.out.println("Quantidades a serem adicionadas ao Estoque:");
        int qtt = sc.nextInt();
        p.addProduto(qtt);
        System.out.println("Dados atualizados: " +  p.nome  + ", R$ " +  p.preco + ", " + p.quantidade + " unidades, Total: R$ " + p.vlrTotalEstoque());
        int qttn = sc.nextInt();
        p.removerProduto(qttn);
        System.out.println("Dados atualizados: " +  p.nome  + ", R$ " +  p.preco + ", " + p.quantidade + " unidades, Total: R$ " + p.vlrTotalEstoque());
        sc.close();
    }
}