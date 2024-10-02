package map.OperacoesBasicas;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.adicionarContato("Fabio", 123456);
        agendaContatos.adicionarContato("Juliano", 321654);
        agendaContatos.adicionarContato("Joãozinho", 147258);
        agendaContatos.adicionarContato("Leo", 963852);
        System.out.println();
        System.out.println("O numero pesquisado é: " + agendaContatos.pesquisarPorNome("Leo"));
    }




    // atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }


    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }


    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    @Override
    public String toString() {
        return "AgendaContatos [agendaContatoMap=" + agendaContatoMap + "]";
    }


    

}
