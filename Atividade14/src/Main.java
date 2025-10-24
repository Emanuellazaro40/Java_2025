public class Main {
    public static void main (String[] args){

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] meses = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};

        for(int i =0; i < meses.length; i++){
            System.out.printf("O mês de %s tem %d dias%n", meses[i], dias[i]);
        }
    }
}