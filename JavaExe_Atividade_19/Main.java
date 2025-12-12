import java.util.Scanner;

public class Main{

    // metudo para somar os numeros inseridos pelo utilizador
    static void somaNumeros() {

        // criar objeto para ler os dados inseridos pelo utilizador
        Scanner scanner = new Scanner(System.in);

        //vetor para guardar os numeros digitados
        int[] numeros = new int[100];
        int soma = 0;

        // contador para o numero de entradas
        int count = 0;

        // loop para ler os numeros ate o utilizador inserir -1
        System.out.println("Insira numeros para somar (insira -1 para terminar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            // guardar o numero no vetor na posicao count
            numeros[count] = numero;
            // incrementar a soma e o contador
            soma += numero;
            count++;
        }

        System.out.println("A soma dos numeros inseridos e: " + soma);

        // fechar o scanner
        scanner.close();
    }

    public static void main(String[] args) {

        // Camando o metodo
        somaNumeros();
    }
}