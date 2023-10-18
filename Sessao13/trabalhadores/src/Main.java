import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Enter department's name: ");
        String dep = sc.nextLine();
        System.out.println("Enter worker data");
        System.out.printf("Name: ");
        System.out.println();
        String name = sc.nextLine();
        System.out.printf("Level: ");
        System.out.println();
        String lvl = sc.nextLine();
        System.out.printf("Base Salary: ");
        Double bs = sc.nextDouble();
        System.out.println();
        System.out.printf("How many contracts to this worker? ");
        Integer n = sc.nextInt();
        Department deps = new Department(dep);


        Worker trabalhadores = (new Worker(name, WorkerLevel.valueOf(lvl) , bs, deps));
        for (int i =0; i<n; i++) {
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.printf("Date (DD/MM/YYYY): ");
            String data = sc.next();
            Date contractDate = sdf.parse(data);
            System.out.printf("Value per hour: ");
            Double valor = sc.nextDouble();
            System.out.printf("Duration (hours): ");
            Integer duracao = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valor, duracao);
            trabalhadores.addContract(contract);
        }
        System.out.println();
        System.out.printf("Enter month and year to calculate income (MM/YYYY):");
        String prazo = sc.next();
        System.out.println();
        Double income =  trabalhadores.income( Integer.parseInt(prazo.substring(3)), Integer.parseInt(prazo.substring(0,2)));
        System.out.println("Name: " + trabalhadores.getName());
        System.out.println("Departament: " + dep);
        System.out.println("Income for " + prazo + ": " +  income);
        sc.close();
    }
}