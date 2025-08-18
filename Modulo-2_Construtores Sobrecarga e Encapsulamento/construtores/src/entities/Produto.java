package entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString () {
        return "\n" + "Nome: " + nome + "\n"
                + "Preco R$ " + String.format("%.2f0", preco) + "\n"
                + "Quantidade: " + quantidade + "\n"
                + "Valor total em estoque R$ " + String.format("%.2f", valorTotalEmEstoque()) + "\n";
    }
}