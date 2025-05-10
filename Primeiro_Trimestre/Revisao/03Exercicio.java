//Ordenação de Vetor de Strings
//Faça um método utilizando o algoritmos de ordenação para ordenar um vetor de strings em ordem alfabética.
//O programa deve receber a entrada fornecida pelo usuário
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de nomes: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();
        String[] vetor = new String[tamanho];
        for(int i=0; i<vetor.length; i++){
            System.out.print("Informe o "+(i+1)+"° nome: ");
            vetor[i] = scanner.nextLine();

        }
        bubbleSort(vetor);
        System.out.print(Arrays.toString(vetor));



    }


    public static void bubbleSort(String[] vetor){

        for(int ciclo = 0; ciclo<vetor.length-1; ciclo++){
            for(int i=0; i<vetor.length-1; i++){
                if(vetor[i].compareTo(vetor[i+1])>0){
                    String aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                }


            }


        }




    }








}
