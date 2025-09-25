import java.lang.classfile.instruction.SwitchCase;

public class Main {
    public static void main(String[] args){
        char caracter ='a';

        switch (caracter){
            case 'a': System.out.println("É vogal");
                break;
            case 'e': System.out.println("É vogal");
                break;
            case 'i': System.out.println("É vogal");
                break;
            case 'o': System.out.println("É vogal");
                break;
            case 'u': System.out.println("É vogal");
                break;
            default:
                System.out.println("É uma consoante");
        }

    }
}