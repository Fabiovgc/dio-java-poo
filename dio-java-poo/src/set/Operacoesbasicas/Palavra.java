package set.Operacoesbasicas;

public class Palavra {
    // atributos
    private String palavra;
    private int codigoDapalavra;



    // Construtor
    public Palavra(String palavra, int codigoDapalavra){
        this.palavra = palavra;
        this.codigoDapalavra = codigoDapalavra;
    }




    // Getters e Setters
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getCodigoDapalavra() {
        return codigoDapalavra;
    }

    public void setCodigoDapalavra(int codigoDapalavra) {
        this.codigoDapalavra = codigoDapalavra;
    }


    // Equals e HashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
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
        Palavra other = (Palavra) obj;
        if (palavra == null) {
            if (other.palavra != null)
            return false;
        } else if (!palavra.equals(other.palavra))
            return false;
            return true;
        }
        
        // Tostring
        @Override
        public String toString() {
            return "Palavra [palavra=" + palavra + ", codigoDapalavra=" + codigoDapalavra + "]";
        }
    
    

        
}
