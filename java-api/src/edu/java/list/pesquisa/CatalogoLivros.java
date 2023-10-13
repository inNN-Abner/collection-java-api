package edu.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List<Livro> livroList;

    //Construtor de Livro
    public CatalogoLivros(){
        this.livroList = new ArrayList<>(null);
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
}
