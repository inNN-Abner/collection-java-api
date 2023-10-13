package edu.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List<Livro> livroList;

    //Construtor de Livro
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    //Método para adicionar Livros
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    //Método para pesquisa por Autor
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }

    //Método para pesquisa por Ano de Publicação
    public List<Livro> pesquisarIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livroIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroIntervaloAno.add(l);
                }
            }
        }
        return livroIntervaloAno;
    }

    //Método para pesquisa por Título (retorna só o primeiro título)
    public Livro pesquisarTitulo(String titulo){
        Livro livroTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = l;
                    break;
                }
            }
        }
        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        //Adicionar livro
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1",2010);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2",2010);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3",2011);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 4",2012);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4",2012);

        //Pesquisar por Autor
        System.out.println("\nPesquisa por AUTOR");
        System.out.println(catalogoLivros.pesquisarAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarAutor("Autor 3"));

        //Pesquisar por Intervalo de Anos
        System.out.println("\nPesquisa por INTERVALO DE ANO");
        System.out.println(catalogoLivros.pesquisarIntervaloAno(2010, 2010));
        System.out.println(catalogoLivros.pesquisarIntervaloAno(2010, 2011));

        //Pesquisar por Titulo 
        System.out.println("\nPesquisa por TÍTULO - Mostra o primeiro encontrado da lista");
        System.out.println(catalogoLivros.pesquisarTitulo("Livro 3"));
    }   
}
