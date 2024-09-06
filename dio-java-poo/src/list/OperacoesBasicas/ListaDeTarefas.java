package list.OperacoesBasicas;

import java.util.*;

public class ListaDeTarefas {
    public static void main(String[] args) {
    
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        listaDeTarefas.adicionarTarefa("Tarefa1");
        listaDeTarefas.adicionarTarefa("Tarefa1");
        listaDeTarefas.adicionarTarefa("Tarefa2");
        listaDeTarefas.adicionarTarefa("Tarefa1");
        listaDeTarefas.adicionarTarefa("Tarefa3");
        listaDeTarefas.adicionarTarefa("Tarefa4");
        listaDeTarefas.adicionarTarefa("Tarefa5");
        listaDeTarefas.adicionarTarefa("Tarefa5");
        listaDeTarefas.adicionarTarefa("Tarefa6");

        
        listaDeTarefas.removerTarefa("tarefa1");
        listaDeTarefas.removerTarefa("tarefa5");
        
        System.out.println("O numero total de tarefas é: " + listaDeTarefas.obterNumeroTotalDeTarefas());
        // listaDeTarefas.obterDescricoesTarefas();

        
    }


    // atributo que é uma lista de Tarefas e chamamos de itemList
    private List<Tarefa> tarefaList;

    // Criando um constructor para determinar que sempre que chamarmos o objeto CarrinhoDeCompras haver uma lista vazia para que possamos manipular
    public ListaDeTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    // Criando metodo de adicionar Tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Criando metodo de remover Tarefa
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa trf: tarefaList){
            if(trf.getDescricao().equals(descricao)){
                tarefasParaRemover.add(trf);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }


    // Criando metodo de obter numero total de Tarefas
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    // Criando metodo para obter descrição das tarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

}
