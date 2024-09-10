package set.Pesquisa;

public class Tarefa {
    // atributos
    private String descricao;
    private int repeticoesTarefa;



    //constutor
    public Tarefa(String descricao, int repeticoesTarefa){
        this.descricao = descricao;
        this.repeticoesTarefa = repeticoesTarefa;
    }

    public String getDescricao() {
        return descricao;
    }



    //Getters e Setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getRepeticoesTarefa() {
        return repeticoesTarefa;
    }

    public void setRepeticoesTarefa(int repeticoesTarefa) {
        this.repeticoesTarefa = repeticoesTarefa;
    }

    // Equals e Hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }






    // Tostring
    @Override
    public String toString() {
        return "[" + descricao + ", " + repeticoesTarefa + " vezes ]";
    }

    
    

    
    


}
