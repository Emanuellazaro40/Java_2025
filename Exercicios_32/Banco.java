package Exercicios_32;

public class Banco {
    public double saldoConta = 0.0;

    // Metods definir saldo, obter saldo, depositar e levantar,
    // para levantar dinheiro considerar que o saldo da conta nao pode ser negativo

    public void definirSaldo(double saldo) {
        if(saldo <= 0) {
            System.out.println("O saldo não pode ser negativo. Definindo saldo para 0.0.");
            this.saldoConta = 0.0;
        } else {
            this.saldoConta = saldo;
        }
    }

    public double obterSaldo() {
        return saldoConta;
    }

    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
        } else {
            this.saldoConta += valor;
        }
    }

    public void levantar(double valor) {
        if (valor > saldoConta) {
            System.out.println("Saldo insuficiente para realizar o levantamento.");
        } else {
            this.saldoConta -= valor;
        }
    }
}
