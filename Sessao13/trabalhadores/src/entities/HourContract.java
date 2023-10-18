package entities;

import java.util.Date;

public class HourContract {
    private Date momento;
    private Double valorHora;
    private Integer horas;

    public HourContract(Date momento, Double valorHora, Integer horas) {
        this.momento = momento;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "ContratoDeHoras{" +
                "momento=" + momento +
                ", valorHora=" + valorHora +
                ", horas=" + horas +
                '}';
    }

    public Double valorTotal(){
        return valorHora * horas;
    }
}
