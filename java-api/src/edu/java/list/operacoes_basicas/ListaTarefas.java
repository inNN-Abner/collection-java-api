package edu.java.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributo
    private List<Tarefas>tarefaList;
    
    //Construtor que gera um ArrayList vazio toda vez que instanciar ListaTarefas
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    //Método para ADICIONAR TAREFAS
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefas(descricao));
    }

    //Método para REMOVER TARFEAS
    public void removerTarefa(String descricao){
        List<Tarefas> tarefasRemover = new ArrayList<>();
        for(Tarefas t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t); 
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    //Método para obter N° TOTAL DE TAREFAS
    public int obterNumeroTarefas(){
        return tarefaList.size();
    }

    //Método para obter DESCRIÇÕES DAS TAREFAS
    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }
}
