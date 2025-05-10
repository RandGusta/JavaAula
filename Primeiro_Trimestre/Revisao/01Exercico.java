//Dada a sequência de números:
//[3, 4, 9, 2, 5, 8, 2, 1, 7], ordene-a em ordem não decrescente
//segundo os seguintes algoritmos, apresentando a sequência obtida após cada passo do algoritmo:
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};
//        bubbleSort(vetor);
//        System.out.println(Arrays.toString(vetor));
//        selectionSort(vetor);
//        System.out.println(Arrays.toString(vetor));
//        inserctionSort(vetor);
//        System.out.println(Arrays.toString(vetor));
        mergeSortDividir(vetor, 0, vetor.length-1);
        System.out.println(Arrays.toString(vetor));



    }


    public static void bubbleSort(int[] vetor){
        for(int ciclo = 0; ciclo<vetor.length-1; ciclo++){
            for(int i = 0; i<vetor.length-1; i++){
                if(vetor[i]>vetor[i+1]){
                    int auxiliar = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = auxiliar;

                }


            }



        }





    }




    public static void selectionSort(int[] vetor){
        for(int i = 0; i<vetor.length-1; i++){
            int i_menor = i;
            for(int j = i+1; j<vetor.length; j++){
                if(vetor[i_menor]>vetor[j]){
                    i_menor = j;

                }

            }

            int aux = vetor[i];
            vetor[i] = vetor[i_menor];
            vetor[i_menor] = aux;

        }



    }


    public static void inserctionSort(int[] vetor){
        for(int i = 1; i<vetor.length; i++){
            int j = i-1;
            int valor = vetor[i];
            while(j>=0 && valor<vetor[j]){
                vetor[j+1] = vetor[j];
                j -=1;

            }
            vetor[j+1] = valor;
        }



    }


    public static void mergeSortDividir(int[] vetor, int inicio, int fim) {
        if(inicio < fim){
        int meio = (fim + inicio) / 2;
        mergeSortDividir(vetor, inicio, meio);
        mergeSortDividir(vetor, meio + 1, fim);
        mergeSortOrdenar(vetor, inicio, meio, fim);
    }

    }


    public static void mergeSortOrdenar(int[] vetor, int inicio, int meio, int fim){
        int[] vetorTemporario = new int[fim - inicio + 1];
        int i = inicio;
        int j = meio + 1;
        int k = 0;
        while(i<=meio && j<=fim){

            if(vetor[i]<vetor[j]){
                vetorTemporario[k++] = vetor[i++];

            } else {
                vetorTemporario[k++] = vetor[j++];


            }


        }


        while(i<=meio){
            vetorTemporario[k++] = vetor[i++];
        }

        while(j<=fim){
            vetorTemporario[k++] = vetor[j++];


        }

        for(int h = 0; h<vetorTemporario.length; h++){
            vetor[h+inicio] = vetorTemporario[h];

        }

    }






}
