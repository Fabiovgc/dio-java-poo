package set.Operacoesbasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();



        conjuntoPalavrasUnicas.adicionarPalavras("Palavra1", 0);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra2", 1);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra1", 2);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra3", 3);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra4", 4);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra5", 5);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra6", 6);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra7", 7);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra8", 8);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra9", 9);
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra7", 10);

        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavras() + " no Set de palavras Unicas.");
        System.out.println();
        // conjuntoPalavrasUnicas.removerPorPalavra("Palavra1");
        System.out.println("As palavras são: ");
        conjuntoPalavrasUnicas.exibirPalavras();

        System.out.println();
        
        System.out.println("Numero de palavras unicas no Sset atualizado: ");
        conjuntoPalavrasUnicas.removerPorPalavra("Palavra1");
        conjuntoPalavrasUnicas.removerPorPalavra("Palavra7");
        conjuntoPalavrasUnicas.exibirPalavras();


    }


    // atributos
    private Set<Palavra> palavraSet;

    // Construtor
    public ConjuntoPalavrasUnicas(){
        this.palavraSet = new HashSet<>();
    }

    // Metodos

    // Adicionar
    public void adicionarPalavras(String palavra, int codigoDapalavra){
        palavraSet.add(new Palavra(palavra, codigoDapalavra));
    }

    // Remover
    public void removerPorPalavra(String palavra){
        Palavra palavraParaRemover = null;
        for(Palavra p: palavraSet){
            if (p.getPalavra() == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    // Contar
    public int contarPalavras(){
        return palavraSet.size();
    }

    // Exibir
    public void exibirPalavras(){
        System.out.println(palavraSet);
    }

}
