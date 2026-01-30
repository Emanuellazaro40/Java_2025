package Exercicio_Poo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Emanuel Lazaro");
        pessoa.setIdade(25);
        System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade() + " anos.");
    }
}
