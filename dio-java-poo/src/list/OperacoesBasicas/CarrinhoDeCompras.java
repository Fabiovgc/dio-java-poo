package list.OperacoesBasicas;

import java.util.*;

public class CarrinhoDeCompras {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();


        carrinhoDeCompras.adicionarItem("item1");

        carrinhoDeCompras.adicionarItem("item1");

        carrinhoDeCompras.adicionarItem("item2");
        System.out.println("O numero total de itens é: " + carrinhoDeCompras.obterNumeroTotalDeItens());

        carrinhoDeCompras.removerItem("item2");
        System.out.println("O numero total de itens é: " + carrinhoDeCompras.obterNumeroTotalDeItens());


        carrinhoDeCompras.obterDescricoesItens();




    }




    // atributo que é uma lista de itens e chamamos de itemList
    private List<Item> itemList;


    // Criando um constructor para determinar que sempre que chamarmos o objeto CarrinhoDeCompras haver uma lista vazia para que possamos manipular
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    // Criando os Metodo de adicionar item
    public void adicionarItem(String descricao){
        itemList.add(new Item(descricao));
    }


    // Criando os Metodo de remover item
    public void removerItem(String descricao){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item itm: itemList){
            if(itm.getDescricao().equalsIgnoreCase(descricao)){
                itensParaRemover.add(itm);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    // Criando os Metodo de obter numero total de itens
    public int obterNumeroTotalDeItens(){
        return itemList.size();
    }



    // Criando os Metodo de obter descrições de itens
    public void obterDescricoesItens(){
        System.out.println(itemList);
    }

}
