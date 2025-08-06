package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();
        System.out.println(funcionario);
        System.out.print("Qual a porcentagem de aumento salarial? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.println("Dados atualizados: " + funcionario);

        sc.close();
    }
}
