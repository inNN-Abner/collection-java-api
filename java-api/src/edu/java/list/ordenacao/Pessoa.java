package edu.java.list.ordenacao;

//É adicioando o 'implements Comparable' para utilizar nos métodos
//O 'Comparable<Pessoa>' revebe generics
public class Pessoa implements Comparable<Pessoa> {

    //Atributos
    private String nome;
    private int idade;
    private double altura;

    //Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    } 

    //Implementação do Comparable
    public int compareTo(Pessoa p){
        return Integer.compare(idade, p.getIdade());
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    //Formatação toString
    public String toString(){
        return "Pessoa | " +
        "Nome: " + nome +
        " | Idade: " + idade +
        " | Altura: " + altura;
    }
}
