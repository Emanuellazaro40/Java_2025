import java.util.Scanner;

public class Calculadora {

    static double calcular(int a, int b) {
        if(a == 0 || b == 0){
            throw new ArithmeticException();
        }

        double resultado = a / b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero_1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero_2 = input.nextInt();
        
        try{
            System.out.println(calcular(numero_1, numero_2));
        }
        catch(Exception e){
            System.out.println("Erro. Não é possivel dividir por zero. " + e);
        }

        input.close();
    }
}