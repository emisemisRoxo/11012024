import java.util.*;
public class trycatch2 {
    
    public static void verificarIdade(short idade) {
        if (idade >= 18) {
            System.out.println("Acesso garantido!");
        }
        else {
            throw new ArithmeticException("Idade não permitida!");
        }
    }
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        boolean deuRuim = false;
        try {
            System.out.println("Digite sua idade:");
            short idadeDigitada = scnInput.nextShort();
            verificarIdade(idadeDigitada);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage() + " Precione enter para continuar..."); deuRuim=true;
            Scanner scnSair = new Scanner(System.in);
            scnSair.nextLine();
           scnSair.close();
        } finally {
            if (deuRuim==true) {
                System.out.println("Favor, reiniciar o sistema!");
            }
            else {
                System.out.println("Okay! Você concluiu a atividade");
            }
        } scnInput.close();
    } 
} 