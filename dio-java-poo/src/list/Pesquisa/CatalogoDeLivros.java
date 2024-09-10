package list.Pesquisa;

import java.util.*;

public class CatalogoDeLivros {
        public static void main(String[] args) {
            CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();
            catalogoDeLivros.adicionarLivros("Livro1", "Autor1", 2020);
            catalogoDeLivros.adicionarLivros("Livro2", "Autor2", 2021);
            catalogoDeLivros.adicionarLivros("Livro3", "Autor2", 2022);
            catalogoDeLivros.adicionarLivros("Livro4", "Autor4", 2023);
            catalogoDeLivros.adicionarLivros("Livro5", "Autor4", 2024);
            catalogoDeLivros.adicionarLivros("Livro6", "Autor4", 2024);

            System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor4"));
            System.out.println(catalogoDeLivros.pesquisarPorTitulo("Livro5"));
            System.out.println(catalogoDeLivros.pesquisarPorIntervaloDeAnos(2022, 2020));
        }
    
    
    
    private List<Livro> livroList;


    public CatalogoDeLivros(){
        this.livroList = new ArrayList<>();
    }


    public void adicionarLivros(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livro( titulo, autor, anoDePublicacao));
    }

    // Nesse metodo verificamos se a lista está vazia antes de realizarmos a pesquisa.
    public List<Livro> pesquisarPorAutor(String autor){
        
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }





    public List<Livro> pesquisarPorIntervaloDeAnos(int anoFinal, int anoInicial){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }




    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


}
