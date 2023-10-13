package edu.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    //Atributo
    private List<Pessoa> pessoaList;

    //Construtor de Pessoa
    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    

    //Método para adicionar pessoa
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Método para ordenar por Idade - Utilizando COMPARABLE
    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoaIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaIdade);
        return pessoaIdade;
    }

    //Método para ordenar por Altura - Utilizando COMPARATOR
    class ComparatorAltura implements Comparator<Pessoa> {
        public int compare(Pessoa p1, Pessoa p2){
            return Double.compare(p1.getAltura(), p2.getAltura());
        }

    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoaAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaAltura, new ComparatorAltura());
        return pessoaAltura;
        }
    }
}
