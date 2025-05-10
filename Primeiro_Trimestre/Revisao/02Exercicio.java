//Ordenação Decrescente
//Modifique o algoritmo de ordenação para ordenar um vetor de
//números inteiros em ordem decrescente.
import java.util.Arrays;
public class Main{
    public static void main(String[] args){

        int[] vetor = {3, 0, -2, 5, 8};
        BubbleInverso(vetor);
        System.out.println(Arrays.toString(vetor));

    }

    public static void BubbleInverso(int[] vetor){
        for(int ciclo = 0; ciclo<vetor.length-1; ciclo++){
            for(int i = 0; i<vetor.length-1; i++){
                if(vetor[i]<vetor[i+1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;

                }
            }
        }


    }


}
