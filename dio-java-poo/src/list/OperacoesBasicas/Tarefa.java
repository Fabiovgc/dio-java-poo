package list.OperacoesBasicas;

public class Tarefa {
    // atributo
    private String descricao;

    // Constructor que recebe a descrição e cria um objeto do tipo tarefa.
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    // Criando metodos Getters e Setters pois o atributo está privado e queremos saber a descrição dessa tarefa
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "descricao";
	}


}
