package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.next();
        System.out.print("Preco: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();
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