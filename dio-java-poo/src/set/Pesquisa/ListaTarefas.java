package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa1", 2);
        listaTarefas.adicionarTarefa("Tarefa2", 3);
        listaTarefas.adicionarTarefa("Tarefa3", 1);
        listaTarefas.adicionarTarefa("Tarefa3", 4);
        listaTarefas.adicionarTarefa("Tarefa4", 1);
        listaTarefas.adicionarTarefa("Tarefa5", 10);
        listaTarefas.adicionarTarefa("Tarefa5", 6);

        listaTarefas.pesquisarPorDescricao("Tarefa1");




    }

    // atributo
    Set<Tarefa> tarefaSet;

    // construtor
    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }


    // Metodos
        // Adicionar
        public void adicionarTarefa(String descricao, int repeticoesTarefa){
            tarefaSet.add(new Tarefa(descricao, repeticoesTarefa));
        }


        // Pesquisar
        public Set<Tarefa> pesquisarPorDescricao(String descricao){
            Set<Tarefa> tarefaPorDescricao = new HashSet<>(); 
            for(Tarefa trf: tarefaSet){
                if(trf.getDescricao().startsWith(descricao)){
                    tarefaPorDescricao.add(trf);
                }
            }
            return tarefaPorDescricao;
        }

        // Exibir
        public void exibirTarefas(){
            System.out.println(tarefaSet);
        }

        // Atualizar
        public Tarefa atualizarRepeticoesDatarefa(String descricao, int novoNumeroDeRepeticoes){
            Tarefa tarefaAtualizada = null;
            for(Tarefa trf: tarefaSet){
                if(trf.getDescricao().equalsIgnoreCase(descricao)){
                    trf.setRepeticoesTarefa(novoNumeroDeRepeticoes);
                    break;
                }
            }
            return tarefaAtualizada;
        }






}
