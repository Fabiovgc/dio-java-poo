package set.Ordenacao;

import java.util.*;

public class CadastroProdutos {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 1", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 9d, 2);
        cadastroProdutos.adicionarProduto(4L, "Produto 8", 18d, 4);
        cadastroProdutos.adicionarProduto(7L, "Produto 2", 5d, 7);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println();

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }

    // atributo
    private Set<Produto> produtoSet;

    // construtor
    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    // metodos
        // adicionar produto
        public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
            produtoSet.add(new Produto(codigo, nome, preco, quantidade));
        }

        // exibir produto por nome
        public Set<Produto> exibirProdutosPorNome(){
            Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
            return produtosPorNome;
        }

        // exibir produto pot preço
        public Set<Produto> exibirProdutosPorPreco(){
            Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        }



}