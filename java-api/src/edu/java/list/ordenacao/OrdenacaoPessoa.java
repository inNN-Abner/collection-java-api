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
    }
    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoaAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaAltura, new ComparatorAltura());
        return pessoaAltura;
        }
    
    //Método para ordenar por Nome - Utilizando COMPARATOR
    class ComparatorNome implements Comparator<Pessoa> {
        public int compare(Pessoa p1, Pessoa p2){
            return p1.getNome().compareTo(p2.getNome());
        }
    }
    public List<Pessoa> ordenarNome(){
        List<Pessoa> pessoaNome = new ArrayList<>(pessoaList);
        Collections.sort(pessoaNome, new ComparatorNome());
        return pessoaNome;
    }

    public static void main(String[] args) {
        //Instanciando OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        
        //Adicionado pessoas
        ordenacaoPessoa.adicionarPessoa("Abner", 20, 1.75);
        ordenacaoPessoa.adicionarPessoa("Giulia", 22, 1.73);
        ordenacaoPessoa.adicionarPessoa("João", 18, 1.81);
        ordenacaoPessoa.adicionarPessoa("Júlio", 17, 1.77);

        //Ordenando por Nome
        System.out.println("Ordenando por NOME");
        System.out.println(ordenacaoPessoa.ordenarNome());

        //Ordenando por Idade
        System.out.println("Ordenando por IDADE");
        System.out.println(ordenacaoPessoa.ordenarIdade());

        //Ordenando por Altura
        System.out.println("Ordenando por ALTURA");
        System.out.println(ordenacaoPessoa.ordenarAltura());

    }
}
