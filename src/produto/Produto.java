package produto;

import java.util.Set;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double vlrTotalEstoque(){
        return quantidade * preco;
    };
    public void addProduto(int quant) {
        quantidade = quantidade + quant;
    }
    public void removerProduto(int quanty){
        quantidade = quantidade - quanty;
    }

}
