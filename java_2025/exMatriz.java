import java.util.Scanner;

public class exMatriz {

    static void CriaMatriz() {

        int matriz[][] = new int[3][3];

        matriz[0][0] = 1; matriz[1][0] = 4; matriz[2][0] = 7;
        matriz[0][1] = 2; matriz[1][1] = 5; matriz[2][1] = 8;
        matriz[0][2] = 3; matriz[1][2] = 6; matriz[2][2] = 9;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void CriaMatrizFromUser(int linhas, int colunas) {
        // CRIAR INSTANCIA DA CLASSE SCANNER
        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor da linha " + i + " e coluna " + j + ": ");
                matriz[i][j] = input.nextInt();
            }
        }

        input.close();

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Linnhas, Colunas;

        System.out.print("Digite o numero de linhas: ");
        Linnhas = input.nextInt();
        System.out.print("Digite o numero de colunas: ");
        Colunas = input.nextInt();

        CriaMatrizFromUser(Linnhas, Colunas);

        input.close();
    }
} 