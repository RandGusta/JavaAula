// somar dígitos

import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int n = 8888;
        int resposta = somarDigitos(n);
        System.out.println("A soma: "  + resposta);

    }

    public static int somarDigitos(int n){
        String intString = Integer.toString(n);
        char[] vetor = intString.toCharArray();
        return soma(vetor);
    }


    public static int soma(char[] vetor){
        if(vetor.length == 0){
            return 0;

        }

        char[] vetorNovo = Arrays.copyOf(vetor,vetor.length-1);
        return Character.getNumericValue(vetor[vetor.length-1]) + soma(vetorNovo);


    }




}
