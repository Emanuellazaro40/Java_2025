package Exercicios_32;

public class Main {

    public static void main(String[] args) {

        // iniciar novo objeto da classe Banco
        Banco minhaConta = new Banco();

        // definir saldo inicial, depositar, levantar e mostrar o saldo em cada etapa
        minhaConta.definirSaldo(1200.0);
        System.out.println("Saldo inicial: " + minhaConta.obterSaldo());

        minhaConta.depositar(500.0);
        System.out.println("Saldo após depósito: " + minhaConta.obterSaldo());

        minhaConta.levantar(200.0);
        System.out.println("Saldo após levantamento: " + minhaConta.obterSaldo());

        minhaConta.levantar(2500.0); // Tentar lavantar mais do que o saldo disponível
        System.out.println("Saldo final: " + minhaConta.obterSaldo());

    }
}
