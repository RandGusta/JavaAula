//Faça um método para ordenar apenas os primeiros N elementos de um vetor usando o algoritmo de ordenação.
//O programa deve receber a entrada fornecida pelo usuário

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {8, 4, 3, 7, 6, 5, 2};
        System.out.println("Informe até qual posição do vetor deseja ordenar: ");
        int posicao = scanner.nextInt();
        int[] ordenado = ordenarVetorParcial(vetor, posicao);

        for(int i = 0; i<ordenado.length; i++){
            System.out.println(ordenado[i]);
        }

    }

    public static int[] ordenarVetorParcial(int[] vetor, int posicao){
        for(int i = 0; i<posicao-1; i++){ // quando quero escolher até que posição ordenar trato a posição como se fosse o fim do meu vetor
            int i_menor = i;
            for(int j = i+1; j<posicao; j++){
                if(vetor[i_menor]>vetor[j]){
                    i_menor = j;
                }

            }
            int aux = vetor[i];
            vetor[i] = vetor[i_menor];
            vetor[i_menor] = aux;
        }

        return vetor;


    }





}
