import java.util.Scanner;

public class Atividade_51 {
    public  static  void main(String[] args){

        // criar objeto
        Scanner input = new Scanner(System.in);

        // entrada do utilizador
        System.out.println("Digite um numero para verificar o dia da semana: ");
        int dia = input.nextInt();

        switch (dia){
            case 1:
                System.out.println("É domingo");
                break;
            case 2:
                System.out.println("É segunda-feira");
                break;
            case 3:
                System.out.println("É terca-feira");
                break;
            case 4:
                System.out.println("É quarta-feira");
                break;
            case 5:
                System.out.println("É quinta-feira");
                break;
            case 6:
                System.out.println("É sexta-feira");
                break;
            case 7:
                System.out.println("É Sabado");
                break;

            default:
                System.out.println("O numero nao coresponde ao dia da semana! Tente Novamente");
        }

        input.close();
    }
}
