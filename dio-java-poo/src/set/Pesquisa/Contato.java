package set.Pesquisa;

public class Contato {
    // atributos
    private String nome;
    private int numeroTelefone;

    // construtor
    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNumeroTelefone() {
        return numeroTelefone;
    }


    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    // Equals e Hashcode
        @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }



    // Tostring
    @Override
    public String toString() {
        return "{" + nome + ", " + numeroTelefone + "}";
    }



    



    
}
