package entities;

public class conta {
    private double numero;
    private String segurado;
    private double  saldo;

    public String toString() {
        return "Conta: " + numero + ", " + "Segurado: " + segurado +  ", Saldo: R$ " + saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getSegurado(){
        return segurado;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposito(double valor){
       this.saldo += valor;
    }
    public void saque(double valor){
        this.saldo -= (valor + 5);
    }

    public void setSegurado(String segurado) {
        this.segurado = segurado;
    }
}
