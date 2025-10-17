import java.util.Scanner;

public class Atividade_131 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insere o primeiro numero: ");
        double num_1 = input.nextDouble();

        System.out.println("Insere o segundo numero: ");
        double num_2 = input.nextDouble();

        System.out.println("escolha o operador: * + - /:");
        char operador = input.next().charAt(0);

        switch (operador){
            case '+':
                double soma = num_1 + num_2;
                System.out.println(soma);
                break;
            case '-':
                double sub = num_1 - num_2;
                System.out.println(sub);
                break;
            case '*':
                double mult = num_1 * num_2;
                System.out.println(mult);
                break;
            case '/':
                if (num_1 == 0 || num_2 == 0){
                    System.out.println("Divisao por zero Impossivel. Digite outro numero!");

                    System.out.println("Insere o primeiro numero: ");
                    num_1 = input.nextDouble();
                    System.out.println("Insere o segundo numero: ");
                    num_2 = input.nextDouble();

                    double div = num_1 / num_2;
                    System.out.println(div);
                    break;
                }else {
                    double div = num_1 / num_2;
                    System.out.println(div);
                }
                break;
            default:
                System.out.println("Operador invalido! Tente novamente.");
                break;
        }

        input.close(); // fechar o input para nao consumir memoria
    }
}

