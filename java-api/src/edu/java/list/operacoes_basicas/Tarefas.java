package edu.java.list.operacoes_basicas;

public class Tarefas {
    
    //Atributo
    private String descricao;

    //Construtor
    public Tarefas(String descricao){
        this.descricao = descricao;
    }

    //Precisa do GET porque o atributo é private
    public String getDescricao(){
        return descricao;
    }
}
