package map.Ordenacao;

public class Evento {


/////////////////  ATRIBUTOS  ///////////////////////////
            
    private String nome;
    private String atracao;

    public Evento (String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    /////////////////  GETTERS AND SETTERS  ///////////////////////////

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }



//////////////////////////  TO STRING  ///////////////////////////////////

@Override
public String toString() {
    return "[nome=" + nome + ", atracao=" + atracao + "]";
}


    
}
