public class Conversor {
    public static void main(String[] args) {
        
        String idade = "30";
        int integerIdade = 30;
        double doubleIdade = 30.5;
        float floatIdade = 305.9f;

        // Convertendo string para inteiro
        int idadeInteiro = Integer.parseInt(idade);
        System.out.println("Idade em string para inteiro: " + idadeInteiro);

        // Convertendo string para float
        float idadeFloat = Float.parseFloat(idade);
        System.out.println("Idade em string para float: " + idadeFloat);

        // Convertendo double para string
        String idadeDoubleString = Double.toString(doubleIdade);
        System.out.println("Idade em double para string: " + idadeDoubleString);

        // Convertendo float para string
        String idadeFloatString = Float.toString(floatIdade);
        System.out.println("Idade em float para string: " + idadeFloatString);
        // Convertendo inteiro para string
        String idadeString = Integer.toString(integerIdade);
        System.out.println("Idade em int para string: " + idadeString);

    }
}
