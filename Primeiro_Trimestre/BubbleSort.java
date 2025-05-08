//Escreva um programa que receba 5 nomes de pessoas e os armazene em um array.
//Ordene esses nomes em ordem alfabética
//utilizando o método Bubble Sort e, em seguida, imprima os nomes ordenados.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[5];
        for(int i=0; i<nome.length; i++){
            System.out.print("Informe o "+ (i+1) +"° nome: ");
            nome[i] =  scanner.nextLine();

        }

        String[] resposta = BubbleSort(nome);
        for(int l=0; l<resposta.length; l++){
            System.out.println(resposta[l]);


        }



    }



    public static String[] BubbleSort(String[] vetor){
        for(int i=0; i<vetor.length-1; i++){
            for(int j=0; j<vetor.length-1; j++){
                if(vetor[j].compareTo(vetor[j+1])>0){
                    String aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;

                }

            }


        }

        return vetor;



    }






}

