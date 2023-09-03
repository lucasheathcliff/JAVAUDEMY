import entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        List<Funcionarios> lista = new ArrayList<Funcionarios>();
        System.out.printf("Quantos funcionários serão registrados?");
        int n = x.nextInt();
        System.out.println();
        String nome;
        double salario;
        int id;
        for (int i = 0; i<n; i++) {
            System.out.println("Funcionário " + (i+1) + "#");
            System.out.printf("ID: ");
            id = x.nextInt();
            Integer idl = existeId(lista, id);
            if (idl == null) {
            System.out.println();
            System.out.printf("Nome:");
            nome = x.next();
            System.out.println();
            System.out.printf("Salario: ");
            salario = x.nextDouble();
            lista.add(new Funcionarios(id,nome, salario));
        }
            else {
                System.out.println("Esse ID já existe.");
            }
        }
        System.out.printf("Qual o Id do funcionário que terá aumento salarial?");
        id = x.nextInt();
        Integer idl = existeId(lista, id);
        if (idl == null) {
            System.out.println("Esse Id não existe.");
        }
        else {
            System.out.printf("Qual será a porcentagem do aumento salarial?");
            double perc = x.nextDouble();
            lista.get(idl).aumento(perc);
        }
        System.out.println();
        for (Funcionarios y : lista) {
            System.out.println(y);
        }
    }
    public static Integer existeId(List<Funcionarios> lista, int id) {
          for (int i = 0; i< lista.size(); i++) {
              if (lista.get(i).getId() == id) {
                  return i;
              }
          }
        return null;
    }

}