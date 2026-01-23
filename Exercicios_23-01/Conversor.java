public class Conversor {
    public static void main(String[] args) {
        
        String idade = "30";

        int idadeInteiro = Integer.parseInt(idade);
        System.out.println("Idade em inteiro: " + idadeInteiro);

        float idadeFloat = Float.parseFloat(idade);
        System.out.println("Idade em float: " + idadeFloat);
    }
}
