package set.Ordenacao;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos> {
    // atributos
    private long matricula;
    private String nome;
    private double cr;
    private int idade;

    // construtor
    public Alunos(long matricula, String nome, double cr, int idade){
        this.matricula = matricula;
        this.nome = nome;
        this.cr = cr;
        this.idade = idade;
    }

    // Getters e Setters
    public long getMatricula() {
        return matricula;
    }


    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getCr() {
        return cr;
    }


    public void setCr(double cr) {
        this.cr = cr;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }



    // equals e HashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alunos other = (Alunos) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }
    


    // toString
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", cr=" + cr + ", idade=" + idade + "]";
    }


    // Metodo Comparable
    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

}

    class ComparatorPorCr implements Comparator<Alunos>{

        @Override
        public int compare(Alunos a1, Alunos a2) {
            return Double.compare(a1.getCr(), a2.getCr());
        }

    }