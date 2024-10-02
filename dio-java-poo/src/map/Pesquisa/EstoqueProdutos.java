package map.Pesquisa;

import java.util.*;

public class EstoqueProdutos {

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Colher", 5.7, 30);
        estoqueProdutos.adicionarProduto(2L, "Garfo", 4.3, 30);
        estoqueProdutos.adicionarProduto(3L, "Faca", 4.3, 30);
        estoqueProdutos.adicionarProduto(4L, "Prato", 10.50, 50);
        estoqueProdutos.adicionarProduto(5L, "Copo", 7.70, 100);
        estoqueProdutos.exibirProdutos();
        System.out.println("O valor total do estoque é: R$" + estoqueProdutos.calcularValorTotalDoEstoque());
        System.out.println("o produto mais barato do estoque é: " + estoqueProdutos.obterProdutoMaiscaro());
        // estoqueProdutos.adicionarProduto(0, null, 0, 0);
    }


    // atributos
    private Map<Long, Produtos> estoqueProdutosMap;
    
    
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }


    // metodos
        // adicionar produtos
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
    }


        // exibir produtos
        public void exibirProdutos(){
            System.out.println(estoqueProdutosMap);
        }

    
        // calcular valor total do estoque
        public double calcularValorTotalDoEstoque(){
            double valorTotalEstoque = 0d;
            if(!estoqueProdutosMap.isEmpty()){
                for(Produtos p: estoqueProdutosMap.values()){
                    valorTotalEstoque += p.getQuantidade() * p.getPreco(); 
                }
            }
            return valorTotalEstoque;
        }



        // obter produto mais caro
        public Produtos obterProdutoMaiscaro(){
            Produtos produtoMaisCaro = null;
            double maiorPreco = Double.MIN_VALUE;
            if(!estoqueProdutosMap.isEmpty()){
                for(Produtos p: estoqueProdutosMap.values()){
                    if(p.getPreco() > maiorPreco){
                        produtoMaisCaro = p;
                    }
                }
            }
            return produtoMaisCaro;
        }
        // obter produto mais barato
        // obter produto de maior valor total no estoque


}