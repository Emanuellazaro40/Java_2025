import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nota;

        while (true){
            System.out.println("Digite uma nota de 0 - 10: ");
            nota = input.nextInt();
            if(nota < 0 || nota > 10){
                System.out.println("Valor invalido!");
            }
            else{
                System.out.println("Valor Valido! " + nota);
                return;
            }
        }
    }
}
