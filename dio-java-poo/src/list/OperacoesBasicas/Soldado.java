package list.OperacoesBasicas;

public class Soldado {
    private String nip;

    public Soldado(String nip){
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Soldado [" + nip + "]";
    }


}
