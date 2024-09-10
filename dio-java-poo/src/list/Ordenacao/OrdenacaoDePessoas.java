package list.Ordenacao;

import java.util.*;

public class OrdenacaoDePessoas {
    public static void main(String[] args) {
        OrdenacaoDePessoas ordenacaoDePessoas = new OrdenacaoDePessoas();   
        
        ordenacaoDePessoas.adicionarPessoa("Nome1", 20, 1.56);
        ordenacaoDePessoas.adicionarPessoa("Nome2", 30, 1.80);
        ordenacaoDePessoas.adicionarPessoa("Nome3", 40, 1.70);
        ordenacaoDePessoas.adicionarPessoa("Nome4", 27, 1.79);
        ordenacaoDePessoas.adicionarPessoa("Nome5", 35, 1.85);
        ordenacaoDePessoas.adicionarPessoa("Nome6", 18, 1.90);

        System.out.println(ordenacaoDePessoas.pessoaList);
        System.out.println();

        System.out.println("Ordenar por idade: ");
        System.out.println(ordenacaoDePessoas.ordenarPorIdade());
        System.out.println();
        System.out.println("Ordenar poir altura: ");
        System.out.println(ordenacaoDePessoas.ordenarPorAltura());
    }
    


    private List<Pessoa> pessoaList;

    public OrdenacaoDePessoas(){
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

}
