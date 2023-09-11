package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;

public class trabalhador {
    private String name;
    private WorkerLevel level;
    private Double salarioBase;

    private ArrayList Contratodehoras = new ArrayList<>(ContratoDeHoras);

    public trabalhador(String name, WorkerLevel level, Double salarioBase) {
        this.name = name;
        this.level = level;
        this.salarioBase = salarioBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public  void addContrato(ContratoDeHoras contratodehoras) {

    }
}
