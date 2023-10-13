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
    
    //MAIN
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        //Verificando se o Array de ListaTarefa está vazio
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTarefas());

        //Adicionando Tarefas na lista
        listaTarefa.adicionarTarefa("1. Estudar Programação");
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("2. Testar os métodos");
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("3. Compreender o List");
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTarefas());
        
        //Removendo Tarefas
        listaTarefa.removerTarefa("3. Compreender o List");
        System.out.println("Tarefa removida!\nO novo número total de tarefas na lista é: " + listaTarefa.obterNumeroTarefas());

        //Obter Descrição das Tarefas
        listaTarefa.obterDescricaoTarefa();
    }
}
