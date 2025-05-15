//Implemente o algoritmo de ordenação para ordenar as linhas de uma matriz 2D

import java.util.Arrays; // necessário para utilizar o deepToString
public class Main{
    public static void main(String[] args){
        int[][] matriz = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        ordenarMatriz(matriz);
        System.out.println(Arrays.deepToString(matriz)); // deepToString serve para printar uma matriz assim como o Arrays.toString() serve para printar um vetor 
    }

    public static void ordenarMatriz(int[][] matriz){
        int linha = matriz.length;
        int coluna = matriz[0].length;
        int k = 0;
        int[] vetorTemp = new int[linha * coluna];
        for(int i = 0; i<linha; i++){ // Transformando a matriz temporariamente em vetor
            for(int j = 0; j<coluna; j++){
                vetorTemp[k++] = matriz[i][j];
            }
        }

        for(int ciclo = 0; ciclo<vetorTemp.length-1; ciclo++){
            for(int l = 0; l<vetorTemp.length-1; l++){
                if(vetorTemp[l]>vetorTemp[l+1]){
                    int aux = vetorTemp[l+1];
                    vetorTemp[l+1] = vetorTemp[l];
                    vetorTemp[l] = aux;
                }

            }



        }
        k = 0;
        for(int i = 0; i<linha; i++){
            for(int j = 0; j<coluna; j++){
                matriz[i][j] = vetorTemp[k++]; // colocando os valores ordenados novamente em uma matriz
            }
        }



    }

}

