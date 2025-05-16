//Ordenação de Pontuações de Jogos
//Escreva um programa que leia as pontuações de jogadores em um torneio e as ordene em ordem decrescente usando o algoritmo ordenação.
//O programa deve exibir as pontuações ordenadas e determinar a pontuação mais alta em tempo constante.
//O programa deve receber a entrada fornecida pelo usuário.

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de pontuações que deseja ordenar: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        for(int i = 0; i<vetor.length; i++){
            System.out.print("Informe a " + (i+1) + "° pontuação: ");
            vetor[i] = scanner.nextInt();
            System.out.println();
        }
        ordenarPontosDesc(vetor);
        System.out.println(Arrays.toString(vetor));
        System.out.println("A pontuação mais alta foi " + vetor[0]);

    }

    public static void ordenarPontosDesc(int[] vetor){
        for(int l=0; l<vetor.length-1; l++){
            int i_menor = l;
            for(int j=l+1; j<vetor.length; j++){
                if(vetor[i_menor]<vetor[j]){
                    i_menor = j;
                }
            }
            int aux = vetor[l];
            vetor[l] = vetor[i_menor];
            vetor[i_menor] = aux;
        }
    }



}
