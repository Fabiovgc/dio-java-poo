package map.Pesquisa;

public class Produtos {
    // atributos
    private String nome;
    private double preco;
    private int quantidade;
    
    // construtor
    public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    // toString 
    @Override
    public String toString() {
        return "Produtos [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
}
