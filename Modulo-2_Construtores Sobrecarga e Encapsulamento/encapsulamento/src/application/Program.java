package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();
        Produto produto = new Produto(nome, preco);

        produto.setNome("Notebook");
        System.out.println("Nome atualizado: " + produto.getNome());
        produto.setPreco(1000.0);
        System.out.println("Preco atualizado: " + produto.getPreco());

        System.out.println("Dados do produto: " + produto);
        System.out.print("Informe a quantidade de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);
        System.out.println("Dados do produto: " + produto);
        System.out.print("Informe a quantidade de produtos para remover do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);
        System.out.println("Dados do produto: " + produto);

        sc.close();
    }
}