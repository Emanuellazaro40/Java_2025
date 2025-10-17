import java.util.Scanner;

public class Atividade_131 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insere o primeiro numero: ");
        int num_1 = input.nextInt();

        System.out.println("Insere o segundo numero: ");
        int num_2 = input.nextInt();

        System.out.println("escolha o operador: * + - /:");
        char operador = input.next().charAt(0);

        switch (operador){
            case '+':
                int soma = num_1 + num_2;
                System.out.println(soma);
                break;
            case '-':
                int sub = num_1 - num_2;
                System.out.println(sub);
                break;
            case '*':
                int mult = num_1 * num_2;
                System.out.println(mult);
                break;
            case '/':
                if (num_1 == 0 || num_2 == 0){
                    System.out.println("Divisao por zero. Impossivel digite outro numero!");
                }else {
                    int div = num_1 / num_2;
                    System.out.println(div);
                }
                break;
            default:
                System.out.println("Operador invalido! Tente novamente.");
        }
    }
}


