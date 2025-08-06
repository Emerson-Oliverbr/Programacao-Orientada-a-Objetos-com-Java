package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno);

        if(aluno.notaFinal() > 60.0) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
            System.out.println("Faltaram " + aluno.notaRestante() + " Pontos");
        }

        sc.close();
    }
}
