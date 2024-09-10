package list.OperacoesBasicas;

import java.util.*;

public class PelotaoDeSoldados {
    public static void main(String[] args) {
        
        PelotaoDeSoldados pelotaoDeSoldados = new PelotaoDeSoldados();

        pelotaoDeSoldados.adicionarSoldado("nip1");
        pelotaoDeSoldados.adicionarSoldado("nip1");
        pelotaoDeSoldados.adicionarSoldado("nip1");
        pelotaoDeSoldados.adicionarSoldado("nip2");
        pelotaoDeSoldados.adicionarSoldado("nip3");
        pelotaoDeSoldados.adicionarSoldado("nip4");
        pelotaoDeSoldados.adicionarSoldado("nip5");
        pelotaoDeSoldados.adicionarSoldado("nip5");
        pelotaoDeSoldados.adicionarSoldado("nip5");
        pelotaoDeSoldados.adicionarSoldado("nip6");
        pelotaoDeSoldados.adicionarSoldado("nip4");
        pelotaoDeSoldados.adicionarSoldado("nip8");
        pelotaoDeSoldados.adicionarSoldado("nip9");
        pelotaoDeSoldados.adicionarSoldado("nip10");
        pelotaoDeSoldados.adicionarSoldado("nip10");
        pelotaoDeSoldados.adicionarSoldado("nip10");
        pelotaoDeSoldados.adicionarSoldado("nip10");
        pelotaoDeSoldados.adicionarSoldado("nip10");
        pelotaoDeSoldados.adicionarSoldado("nip10");
        pelotaoDeSoldados.adicionarSoldado("nip10");
        pelotaoDeSoldados.adicionarSoldado("nip10");

        System.out.println("O numero total de soldados nesse pelotão é: " + pelotaoDeSoldados.obterNumeroTotalDeSoldados());
        
        pelotaoDeSoldados.removerSoldado("nip1");
        pelotaoDeSoldados.removerSoldado("nip5");
        pelotaoDeSoldados.removerSoldado("nip10");
        
        System.out.println("Numero total atualizado");

        System.out.println("O numero total de soldados nesse pelotão é: " + pelotaoDeSoldados.obterNumeroTotalDeSoldados());
        
        pelotaoDeSoldados.obterNipDoSoldado();
        
    }

    // Criando a lista 
    private List<Soldado> soldadoList;


    // Construtor de lista vazia
    public PelotaoDeSoldados(){
        this.soldadoList = new ArrayList<>();
    } 


    // Metodo adicionar soldado
    public void adicionarSoldado(String nip){
        soldadoList.add(new Soldado(nip));
    }
    
    // Metodo remover soldado
    public void removerSoldado(String nip){
        List<Soldado> soldadosParaRemover = new ArrayList<>();
        for(Soldado sdd: soldadoList){
            if(sdd.getNip().equalsIgnoreCase(nip)){
                soldadosParaRemover.add(sdd);
            }
        }
        soldadoList.removeAll(soldadosParaRemover);
    }
    
    // Metodo obter numero total de soldados
    public int obterNumeroTotalDeSoldados(){
       return soldadoList.size(); 
    }
    
    // Metodo Obter nip do soldado
    public void obterNipDoSoldado(){
        System.out.println(soldadoList);
    }
    
    
}
