// inverter elementos de um vetor de inteiros
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    int[] vetor = {1,2,3,4,5,6};
    int[] vetorInverso = inverter(vetor, 0, vetor.length-1);
    System.out.println(Arrays.toString(vetorInverso));
  }


  public static int[] inverter(int[] vetor, int inicio, int fim){
    if(inicio >= fim){
      return vetor;
    }
    int aux = vetor[inicio];
    vetor[inicio] = vetor[fim];
    vetor[fim] = aux;
    return inverter(vetor, inicio+1, fim-1);
    
  }
  
}
