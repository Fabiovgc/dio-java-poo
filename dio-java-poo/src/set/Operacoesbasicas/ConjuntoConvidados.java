package set.Operacoesbasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Nome1", 1230);
        conjuntoConvidados.adicionarConvidado("Nome2", 1231);
        conjuntoConvidados.adicionarConvidado("Nome3", 1232);
        conjuntoConvidados.adicionarConvidado("Nome4", 1233);
        conjuntoConvidados.adicionarConvidado("Nome5", 1234);
        conjuntoConvidados.adicionarConvidado("Nome6", 1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");
        System.out.println();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1231);
        System.out.println("Set de convidados atualizado: ");
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");
        System.out.println();
        System.out.println("Os convidados são: ");
        conjuntoConvidados.exibirConvidados();




    }

    // atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }


    public int contarConvidados(){
        return convidadoSet.size();
    }


    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

}
