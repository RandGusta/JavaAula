// Contar dígitos de um número inteiro
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int n = 123422;
        int resposta  = contarDigitos(n);
        System.out.println(resposta);


    }

    public static int contarDigitos(int n){
        String nToString = Integer.toString(n);
        char[] nToChar = nToString.toCharArray();

        return contar(nToChar);

    }

    public static int contar(char[] vetor){
        if(vetor.length == 0){
            return 0;

        }

        char[] novoVetor = Arrays.copyOf(vetor, vetor.length-1); // Arrays.copyOf(VETOR ORIGINAL, NOVO TAMANHO)
        return 1 + contar(novoVetor);



    }



}
