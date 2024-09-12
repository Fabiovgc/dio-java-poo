package set.Ordenacao;

import java.util.*;

public class GerenciadorAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();



        gerenciadorAlunos.adicionarAlunos(1L, "Pedrin", 10, 26);
        gerenciadorAlunos.adicionarAlunos(2L, "Claudin", 9, 29);
        gerenciadorAlunos.adicionarAlunos(3L, "Cain", 8, 24);
        gerenciadorAlunos.adicionarAlunos(4L, "Zezin", 7, 28);
        gerenciadorAlunos.removerAluno(1L, "Pedrin", 10, 26);
        gerenciadorAlunos.exibirAlunos();
    }

    // atributo
    private Set<Alunos> alunosSet;


    // construtor
    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }


    // Metodos
        // adicionarAluno
        public void adicionarAlunos(long matricula, String nome, double cr, int idade){
            alunosSet.add(new Alunos(matricula, nome, cr, idade));
        }



        // removerAluno
        public void removerAluno(long matricula, String nome, double cr, int idade){
            Alunos alunosParaRemover = null;
            for(Alunos a: alunosSet){
                if(a.getMatricula() == matricula && a.getNome() == nome && a.getCr() == cr && a.getIdade() == idade){
                    alunosParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunosParaRemover);
        }



        // exibirAlunosPorNome
        public Set<Alunos> exibirAlunosPorNome(){
            Set<Alunos> alunosporNome = new TreeSet<>(alunosSet);
            return alunosporNome;
        }


        // exibirAlunosPorCr
        public Set<Alunos> exibirAlunosPorCr(){
            Set<Alunos> alunosPorCr = new TreeSet<>(new ComparatorPorCr());
            alunosPorCr.addAll(alunosSet);
            return alunosPorCr;
        }

        // exibirAlunos
        public void exibirAlunos(){
            System.out.println(alunosSet);
        }


}
