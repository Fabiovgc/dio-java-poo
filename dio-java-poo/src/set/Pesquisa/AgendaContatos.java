package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Fabio", 123456);
        agendaContatos.adicionarContatos("Fabio", 561234);
        agendaContatos.adicionarContatos("Fabio", 794561);
        agendaContatos.adicionarContatos("Fabio", 985410);
        agendaContatos.adicionarContatos("Fabio inteligencia artificial", 104258);
        agendaContatos.adicionarContatos("Fabio professor de tec", 784123);
        agendaContatos.adicionarContatos("Fabio Hacker", 453278);
        agendaContatos.adicionarContatos("Fabio Concursado", 1289763);
        agendaContatos.adicionarContatos("Fabin trabalhando na gringa", 471589);
        agendaContatos.adicionarContatos("Fabin diretor de tec", 126987);
        agendaContatos.adicionarContatos("Fabin empresario", 123978);
        agendaContatos.adicionarContatos("Fabin software house", 794512);
        agendaContatos.adicionarContatos("Fabin cientista", 369854);

        agendaContatos.exibirContatos();

        System.out.println();

        System.out.println(agendaContatos.pesquisarPorNome("Fabio Concursado"));

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroDeContatos("Fabin diretor de tec", 789621));
        
        System.out.println();

        agendaContatos.exibirContatos();
    }


    // atributos
    private Set<Contato> contatoSet;



    // construtor
    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }


    // metodos

        // adicionar
        public void adicionarContatos(String nome, int numeroTelefone){
            contatoSet.add(new Contato(nome, numeroTelefone));
        }



        
        // // Pesquisar
        public Set<Contato> pesquisarPorNome(String nome){
            Set<Contato> contatoPorNome = new HashSet<>();
            for(Contato c: contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }
            return contatoPorNome;
        }

        
        // exibir
        public void exibirContatos(){
            System.out.println(contatoSet);
        } 
        
        // Atualizar
        public Contato atualizarNumeroDeContatos(String nome, int novoNumero){
            Contato contatoAtualizado= null;
            for(Contato c: contatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado; 
        }


}
