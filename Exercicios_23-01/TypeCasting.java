public class TypeCasting {
    public static void main(String[] args) {
        
        double [] nota = {12.5, 16.0, 19.0, 17.5, 15.5, 14.0};

        // clacular a media das notas fazer type casting da media para int
        double soma = 0.0;
        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];

    }
        int numeroTotalDeAlunos = nota.length;
        double media = soma / nota.length;
        int mediaInt = (int) media;
        System.out.println("Numeros total de alunos: " + numeroTotalDeAlunos);
        System.out.println("Média das notas (Original): " + media);
        System.out.println("Média das notas (inteiro): " + mediaInt);
    }
}
